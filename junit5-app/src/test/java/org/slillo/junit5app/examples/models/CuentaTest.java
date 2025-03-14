package org.slillo.junit5app.examples.models;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.condition.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.slillo.junit5app.examples.exceptions.DineroInsuficienteException;

import java.math.BigDecimal;
import java.util.Map;
import java.util.Properties;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.*;


class CuentaTest {

    Cuenta cuenta;

    @BeforeEach
    void initMetodoTest() {
        this.cuenta = new Cuenta("Sergio", new BigDecimal("1000.8989"));
        System.out.println("Iniciando el método...");
    }

    @AfterEach
    void tearDown() {
        System.out.println("Finalizando el método de prueba...");
    }

    @BeforeAll
    static void beforeAll() {
        System.out.println("Inicializando el test...");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("Terminando el test...");
    }

    @Nested
    @DisplayName("Probando atributos de la cuenta corriente")
    class CuentaTestNombreSaldo {
        @Test
        @DisplayName("Nombre de la cuenta")
        void test_nombre_cuenta() {
            //cuenta.setPersona("Sergio");
            String esperado = "Sergio";
            String real = cuenta.getPersona();
            assertNotNull(real, () -> "La cuenta no puede ser nula");

            assertEquals(esperado, real, () -> "El nombre de la cuenta no es el que se esperaba: se esperaba " + esperado + " y se obtuvo: " + real);
            assertTrue(real.equals("Sergio"), () -> "El nombre de cuenta esperada debe ser igual al real");
        }

        @Test
        @DisplayName("El saldo de la cuenta corrienta para que no sea null, ni menor que cero y tenga el valor esperado")
        void test_saldo_cuenta() {
            assertNotNull(cuenta.getSaldo());

            assertEquals(1000.8989, cuenta.getSaldo().doubleValue());

            //Evalúan lo mismo
            assertFalse(cuenta.getSaldo().compareTo(BigDecimal.ZERO) < 0);
            assertTrue(cuenta.getSaldo().compareTo(BigDecimal.ZERO) > 0);

        }

        @Test
        @DisplayName("Referencias que sean iguales con el método equals ")
        void test_referencia_cuenta() {
            cuenta = new Cuenta("John Doe", new BigDecimal("897.989"));
            Cuenta cuenta2 = new Cuenta("John Doe", new BigDecimal("897.989"));

            //Comparamos por instancia
            //assertNotEquals(cuenta2, cuenta);

            //Comparamos por valores
            assertEquals(cuenta2, cuenta);

        }
    }

    @Nested
    class CuentaOperaciones {
        @Test
        void test_debito_cuenta() {

            cuenta.debito(new BigDecimal(100));

            assertNotNull(cuenta.getSaldo());
            assertEquals(900, cuenta.getSaldo().intValue());
            assertEquals("900.8989", cuenta.getSaldo().toPlainString());
        }

        @Test
        void test_credito_cuenta() {

            cuenta.credito(new BigDecimal(100));

            assertNotNull(cuenta.getSaldo());
            assertEquals(1100, cuenta.getSaldo().intValue());
            assertEquals("1100.8989", cuenta.getSaldo().toPlainString());
        }

        @Test
        @Disabled
        void test_transferir_dinero_cuentas() {
            Cuenta cuenta1 = new Cuenta("John Doe", new BigDecimal("2500"));
            Cuenta cuenta2 = new Cuenta("Juan García", new BigDecimal("1500.8920"));

            Banco banco = new Banco();
            banco.setNombre("Caixabank");
            banco.transferir(cuenta2, cuenta1, new BigDecimal("500"));

            assertEquals("1000.8920", cuenta2.getSaldo().toPlainString());
            assertEquals("3000", cuenta1.getSaldo().toPlainString());
        }
    }

    @Test
    void dinero_insuficiente_exception_cuenta() {
        Exception exception = assertThrows(DineroInsuficienteException.class, () -> {
            cuenta.debito(new BigDecimal("1500.00"));
        });

        String actual = exception.getMessage();
        String esperado = "Dinero insuficiente";
        assertEquals(esperado, actual);
    }

    @Test
    @DisplayName("Probando relaciones entre las cuentas y el banco con assertAll()")
    void test_relacion_banco_cuentas() {
        Cuenta cuenta1 = new Cuenta("John Doe", new BigDecimal("2500"));
        Cuenta cuenta2 = new Cuenta("Juan García", new BigDecimal("1500.8920"));

        Banco banco = new Banco();
        banco.addCuenta(cuenta1);
        banco.addCuenta(cuenta2);

        banco.setNombre("Caixabank");
        banco.transferir(cuenta2, cuenta1, new BigDecimal(500));

        assertAll(
                () ->  assertEquals("1000.8920", cuenta2.getSaldo().toPlainString(), ()-> "El saldo de la cuenta 2, no es el esperado"),
                () ->  assertEquals("3000", cuenta1.getSaldo().toPlainString()),
                () ->  assertEquals(2, banco.getCuentas().size()),
                () ->  assertEquals("Caixabank", cuenta1.getBanco().getNombre()),
                () ->  assertEquals("Juan García", banco.getCuentas().stream()
                        .filter(c -> c.getPersona().equals("Juan García"))
                        .findFirst()
                        .get().getPersona()),
                () ->  assertTrue(banco.getCuentas().stream()
                        .anyMatch(c -> c.getPersona().equals("Juan García")))
        );
    }

    @Nested
    class SistemaOperativoTest {
        @Test
        @EnabledOnOs(OS.WINDOWS)
        void test_solo_windows() {

        }

        @Test
        @EnabledOnOs({OS.MAC, OS.LINUX})
        void test_solo_unix() {

        }

        @Test
        @DisabledOnOs(OS.WINDOWS)
        void test_no_windodws() {

        }
    }

    @Nested
    class JavaVersionTest {
        @Test
        @EnabledOnJre(JRE.JAVA_8)
        void test_java_8() {

        }

        @Test
        @EnabledOnJre(JRE.JAVA_23)
        void test_java_23() {

        }
    }

    @Nested
    class SystemPropertiesTest {
        @Test
        void imprimir_systen_properties() {
            Properties properties = System.getProperties();
            properties.forEach((k, v) -> System.out.println("K: " + k + ": " + v));
        }

        @Test
        @EnabledIfSystemProperty(named = "java.version", matches=".*23.*")
        void test_java_version() {
        }

        @Test
        @DisabledIfSystemProperty(named = "os.arch", matches=".*64.*")
        void test_64() {
        }
    }

    @Nested
    class VariableAmbienteTest {
        @Test
        void imprimir_variables_ambiente() {
            Map<String, String> getenv = System.getenv();
            getenv.forEach((k,v ) -> System.out.println(k + " = " + v));
        }

        @Test
        @EnabledIfEnvironmentVariable(named = "JAVA_HOME", matches = ".*jdk-23.0.0.*")
        void testJavaHome() {
        }

        @Test
        @EnabledIfEnvironmentVariable(named = "NUMBER_OF_PROCESSORS", matches = "22")
        void testProcesadores() {
        }
    }

    @Test
    @DisplayName("Probando el saldo cuenta dev")
    void test_saldo_cuenta_DEV() {

        boolean esDev = "dev".equals(System.getProperty("ENV"));
        assumeTrue(esDev);

        assertNotNull(cuenta.getSaldo());

        assertEquals(1000.8989, cuenta.getSaldo().doubleValue());

        //Evalúan lo mismo
        assertFalse(cuenta.getSaldo().compareTo(BigDecimal.ZERO) < 0);
        assertTrue(cuenta.getSaldo().compareTo(BigDecimal.ZERO) > 0);

    }

    @Test
    @DisplayName("Probando el saldo cuenta dev con assumingThat")
    void test_saldo_cuenta_DEV2() {

        boolean esDev = "dev".equals(System.getProperty("ENV"));
        assumingThat(esDev, () -> {
            assertNotNull(cuenta.getSaldo());
            assertEquals(1000.8989, cuenta.getSaldo().doubleValue());
            //Evalúan lo mismo
            assertFalse(cuenta.getSaldo().compareTo(BigDecimal.ZERO) < 0);
            assertTrue(cuenta.getSaldo().compareTo(BigDecimal.ZERO) > 0);
        });
    }

    @DisplayName("Probando debito cuenta con repeticiones")
    @RepeatedTest(value=5, name = "{displayName} - Repetición numero {currentRepetition} de {totalRepetitions}")
    void test_debito_cuenta_repetir(RepetitionInfo info) {
        if(info.getCurrentRepetition() == 3) {
            System.out.println("Estamos en la repetición 3!!");
        }
        cuenta.debito(new BigDecimal(100));

        assertNotNull(cuenta.getSaldo());
        assertEquals(900, cuenta.getSaldo().intValue());
        assertEquals("900.8989", cuenta.getSaldo().toPlainString());
    }

    @ParameterizedTest(name = "número {index} ejecutando con valor {0} - {argumentsWithNames}")
    @ValueSource(strings = {"100", "200", "300", "500", "700", "1000.8989"})
    void test_debito_cuenta(String total) {

        cuenta.debito(new BigDecimal(total));

        assertNotNull(cuenta.getSaldo());
        assertTrue(cuenta.getSaldo().compareTo(BigDecimal.ZERO) >0);
    }
}