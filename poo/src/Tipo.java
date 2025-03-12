public enum Tipo {
    SEDAN("Sedan", "Coche mediano", 4),
    ST("Station Wagon", "Coche más grande", 5),
    PICKUP("Pickup", "Camioneta", 4),
    FURGON("Furgón", "Coche utilitario", 3),
    CONVERTIBLE("Convertible", "Coche deportivo", 2),
    COUPE("Coupé", "Coche pequeño", 2),
    SUV("SUV", "Todoterreno deportivo", 5),
    HATCHBACK("Compacto", "Coche compacto", 5);

    private final String nombre;
    private final int numeroPuertas;
    private final String descripcion;

    Tipo(String nombre, String descripcion,  int numeroPuertas) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.numeroPuertas = numeroPuertas;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public String getDescripcion() {
        return descripcion;
    }
}
