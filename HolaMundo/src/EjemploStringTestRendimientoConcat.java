public class EjemploStringTestRendimientoConcat {

    public static void main(String[] args) {
        String a = "a";
        String b = "b";
        String c = a;

        StringBuilder sb = new StringBuilder("a");
        long inicio = System.currentTimeMillis();

        for (int i = 0; i < 1000; i++) {
            //c = c.concat(a).concat(b).concat("\n"); // 500 -> 2 ms | 1000 -> 4 ms
            c  += a + b + "\n";// 500 -> 13 ms | 1000 -> 15 ms
           // sb.append(a).append(b).append("\n");// 500 -> 0 ms | 1000 -> 0 ms
        }

        System.gc();

        long fin = System.currentTimeMillis();
        System.out.println(fin - inicio);
        System.out.println("c = " + c);
        System.out.println("sb = " + sb);
        System.exit(0);
    }
}
