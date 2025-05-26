public class Masajista extends MiembroEquipo {
    private String titulacion;
    private Integer aniosExperiencia;

    // Constructor
    public Masajista(Integer id, String nombre, String apellidos, Integer edad, String titulacion, Integer aniosExperiencia) {
        super(id, nombre, apellidos, edad); // Llama al constructor de la superclase
        this.titulacion = titulacion;
        this.aniosExperiencia = aniosExperiencia;
    }

    // Getters y Setters
    public String getTitulacion() {
        return titulacion;
    }

    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }

    public Integer getAniosExperiencia() {
        return aniosExperiencia;
    }

    public void setAniosExperiencia(Integer aniosExperiencia) {
        this.aniosExperiencia = aniosExperiencia;
    }

    // Método específico
    public void darMasaje() {
        System.out.println("Dando masaje...");
    }
}