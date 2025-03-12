public enum Color {
    ROJO("Rojo"),
    AZUL("Azul"),
    AMARILLO("Amarillo"),
    NARANJA("Naranja"),
    BLANCO("Blanco"),
    GRIS("Gris");

    private final String color;

    Color(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }


    @Override
    public String toString() {
        return this.color;
    }
}
