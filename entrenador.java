public class Entrenador extends MiembroEquipo {
    private String idFederacion;

    // Constructor
    public Entrenador(Integer id, String nombre, String apellidos, Integer edad, String idFederacion) {
        super(id, nombre, apellidos, edad); // Llama al constructor de la superclase
        this.idFederacion = idFederacion;
    }

    // Getters y Setters
    public String getIdFederacion() {
        return idFederacion;
    }

    public void setIdFederacion(String idFederacion) {
        this.idFederacion = idFederacion;
    }

    // Métodos específicos
    public void dirigirPartido() {
        System.out.println("Dirigiendo partido...");
    }

    public void dirigirEntrenamiento() {
        System.out.println("Dirigiendo entrenamiento...");
    }

    // Sobrescritura del método concentrarse
    @Override
    public void concentrarse() {
        System.out.println("El entrenador se concentra planificando estrategias...");
    }

    // Sobrescritura del método viajar
    @Override
    public void viajar() {
        System.out.println("El entrenador viaja con el equipo para coordinar el próximo partido...");
    }
}