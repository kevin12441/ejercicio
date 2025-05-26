public class Futbolista extends MiembroEquipo {
    private Integer goles;
    private String demarcacion;

    // Constructor
    public Futbolista(Integer id, String nombre, String apellidos, Integer edad, Integer goles, String demarcacion) {
        super(id, nombre, apellidos, edad); // Llama al constructor de la superclase
        this.goles = goles;
        this.demarcacion = demarcacion;
    }

    // Getters y Setters
    public Integer getGoles() {
        return goles;
    }

    public void setGoles(Integer goles) {
        this.goles = goles;
    }

    public String getDemarcacion() {
        return demarcacion;
    }

    public void setDemarcacion(String demarcacion) {
        this.demarcacion = demarcacion;
    }

        // Métodos específicos
        public void jugarPartido() {
            System.out.println("Jugando partido...");
        }
    
        public void entrenar() {
            System.out.println("Entrenando...");
        }
    
        @Override
        public void concentrarse() {
            System.out.println("Futbolista concentrándose...");
        }
    }