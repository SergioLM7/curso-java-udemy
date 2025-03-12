public class AutoBoxingInteger {
    public static void main(String[] args) {

        //Ejemplo de autoboxing, de forma automática estamos convirtiendo los int del array en objetos Integer
        Integer[] enteros = {1,2,3,4,5,6,7,8,9};

        int suma = 0;

        //intValue() devuelve el valor primitivo de un objeto Integer
        // Forma explícita
        for(Integer i : enteros) {
            if (i.intValue() % 2 == 0)
                suma+=i.intValue();
        }

        System.out.println("suma = " + suma);
        suma = 0;
        // Forma implícita: el compilador de Java será el que invoque al método intValue()
        for(Integer i : enteros) {
            if (i % 2 == 0)
                suma+=i;
        }

        System.out.println("suma 2 = " + suma);

    }
}
