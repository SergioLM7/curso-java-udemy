public class SentenciasBucleEtiquetasBuscar {

    public static void main(String[] args) {

        String frase = "trigo trigo tres tristes tigres comen trigo en un trigal";
        String palabra = "trigo";

        int maxPalabra = palabra.length();
        int maxFrase = frase.length();

        int cantidad = 0;

        buscar:
        for (int i = 0; i < maxFrase; i ++) {
            int k = i;

            for(int j = 0; j < maxPalabra; j++) {
                if (frase.charAt(k++) != palabra.charAt(j))
                    continue buscar;
            }
            cantidad++;
        }
        System.out.println("Encontrada la palabra " + palabra + " " + cantidad + " veces en la frase " + frase);
    }
}
