public class WrapperInteger {

    public static void main(String[] args) {

        int intPrimitivo = 32768;
        //Forma explícita de crear un objeto, se conoce comno boxing; toma un valor primitivo y lo convierte a un objeto.
        Integer intObjeto = Integer.valueOf(intPrimitivo);

        //Forma literal de crear un objeto, se conoce comno autoboxing; toma un valor primitivo y lo convierte a un objeto automáticamente.
        Integer intObjetoLiteral = intPrimitivo;

        System.out.println("IntObjeto = " + intObjeto);

        //Forma implícita de convertir un objeto en un primitivo;
        int num = intObjeto;
        System.out.println("num = " + num);

        //Forma explícita de convertir un objeto en un primitivo;
        int num2 = intObjeto.intValue();
        System.out.println("num2 = " + num2);

        String valor = "6700";
        Integer valorInteger = Integer.valueOf(valor);
        System.out.println("valor = " + valor);

        //Perderá información y devolverá un valor ambiguo (PERDIDA DE INFORMACION) al ser más pequeño que el int que le estamos pasando
        Short shortObjeto = intObjeto.shortValue();
        System.out.println("shortObjeto = " + shortObjeto);


    }
}
