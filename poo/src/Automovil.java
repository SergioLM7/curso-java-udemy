import java.security.AuthProvider;

public class Automovil implements Comparable<Automovil> {

     private int ID;
     private String fabricante ;
     private String modelo;
     private Color color;
     private Motor motor;
     private Tanque tanque;
     private Persona conductor;
     private Rueda[] ruedas;
     private int idRuedas;

     private Tipo tipo;

     private static int capacidadTanqueEstatico = 30;
     private static Color colorPatente = Color.NARANJA;
     private static int lastID;

     public static final Integer VELOCIDAD_MAX_CARRETERA = 120;
     public static final Integer VELOCIDAD_MAX_CIUDAD= 60;


     public Automovil() {
          this.ID = lastID++;
          this.ruedas = new Rueda[5];
     }

     public Automovil (String fabricante, String modelo) {
          this();
          this.fabricante = fabricante;
          this.modelo = modelo;
     }

     public Automovil (String fabricante, String modelo, Color color) {
          this(fabricante, modelo);
          this.color = color;
     }

     public Automovil(String fabricante, String modelo, Color color, Motor motor) {
          this(fabricante, modelo, color);
          this.motor = motor;
     }

     public Automovil(String fabricante, String modelo, Color color, Motor motor, Tanque tanque) {
          this(fabricante, modelo, color, motor);
          this.tanque = tanque;
     }

     public Automovil(String fabricante, String modelo, Color color, Motor motor, Tanque tanque, Persona conductor, Rueda[] ruedas) {
          this(fabricante, modelo, color, motor, tanque);
          this.conductor = conductor;
          this.ruedas = ruedas;
     }

     public String getFabricante() {
          return this.fabricante;
     }

     public void setFabricante(String fabricante) {
          this.fabricante = fabricante;
     }

     public String getModelo() {
          return this.modelo;
     }

     public void setModelo(String modelo) {
          this.modelo = modelo;
     }

     public Color getColor() {
          return this.color;
     }

     public void setColor(Color color) {
          this.color = color;
     }

     public static Color getColorPatente() {
          return colorPatente;
     }

     public static void setColorPatente(Color colorPatente) {
          Automovil.colorPatente = colorPatente;
     }

     public static int getCapacidadTanqueEstatico() {
          return capacidadTanqueEstatico;
     }

     public static void setCapacidadTanqueEstatico(int capacidadTanqueEstatico) {
          Automovil.capacidadTanqueEstatico = capacidadTanqueEstatico;
     }

     public int getID() {
          return ID;
     }

     public void setID(int ID) {
          this.ID = ID;
     }

     public Tipo getTipo() {
          return tipo;
     }

     public void setTipo(Tipo tipo) {
          this.tipo = tipo;
     }

     public Motor getMotor() {
          return motor;
     }

     public void setMotor(Motor motor) {
          this.motor = motor;
     }

     public Tanque getTanque() {
          if(this.tanque == null){
               this.tanque = new Tanque();
          }
          return tanque;
     }

     public void setTanque(Tanque tanque) {
          this.tanque = tanque;
     }

     public Persona getConductor() {
          return conductor;
     }

     public void setConductor(Persona conductor) {
          this.conductor = conductor;
     }

     public Rueda[] getRuedas() {
          return ruedas;
     }

     public void setRuedas(Rueda[] ruedas) {
          this.ruedas = ruedas;
     }

     public Automovil addRueda(Rueda rueda) {
          if(idRuedas < this.ruedas.length) {
               this.ruedas[idRuedas++] = rueda;
          }

          return this;
     }

     public String verDetalles() {
          StringBuilder sb = new StringBuilder();
          sb.append("auto.ID = ").append(this.ID).append("\n");
          sb.append("auto.fabricante = ").append(this.fabricante).append("\n");
          sb.append("auto.modelo = ").append(this.modelo).append("\n");
          if(this.tipo != null) {
               sb.append("auto.tipo = ").append(this.tipo.getNombre()).append("\n");
          }
          sb.append("auto.color = ").append(this.color.getColor()).append("\n");
          sb.append("auto.color patente = ").append(colorPatente.getColor()).append("\n");
          if(this.motor !=null) {
               sb.append("auto.cilindrada = ").append(this.motor.getCilindrada()).append("\n");
          }
          if(this.getConductor() != null) {
               sb.append("\nConductor: ").append(this.getConductor()).append("\n");
          }
          if(getRuedas()!= null) {
               sb.append("Ruedas del ").append(this.getModelo()).append(": \n");
               for(Rueda rueda : this.getRuedas()) {
                    sb.append("\n").append(this.modelo).append(": ").append(rueda.getFabricante()).append(", llanta: ").append(rueda.getLlanta()).append(", ancho: ").append(rueda.getAncho());
               }
          }

          return sb.toString();
     }

     public String acelerar(int rpm) {
          return "El coche " + this.fabricante + " acelerando a " + rpm + "rmp";
     }

     public String frenar () {
          return "El coche " + this.fabricante + " " + this.modelo + " frenando!";
     }

     public String acelerarFrenar (int rpm) {
          String acelerar = this.acelerar(rpm);
          String frenar = this.frenar();
          return acelerar + "\n" + frenar;
     }

     public float calcularConsumo (int km, float porncentajeCombustible) {
          return km / (porncentajeCombustible * this.getTanque().getCapacidad());
     }

     public static float calcularConsumoEstatico (int km, int porncentajeCombustible) {
          return km / ((porncentajeCombustible / 100f) * Automovil.capacidadTanqueEstatico);
     }

     public float calcularConsumo (int km, int porncentajeCombustible) {
          return km / ((porncentajeCombustible / 100f) * this.getTanque().getCapacidad());
     }

     @Override
     public boolean equals(Object obj) {
          if(this == obj)
               return true;

          if(!(obj instanceof Automovil)) {
               return false;
          }
          Automovil a = (Automovil) obj;
          return (this.fabricante != null && this.modelo != null && this.fabricante.equals(a.getFabricante()) && this.modelo.equals(a.getModelo()));
     }

     @Override
     public String toString() {
          return this.ID + ": fabricante='" + fabricante + '\'' +
                  ", modelo='" + modelo;
     }

     @Override
     public int compareTo(Automovil a) {
          return this.conductor.toString().compareTo(a.conductor.toString());
     }
}
