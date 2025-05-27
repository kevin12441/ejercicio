public class Masajista extends MiembroEquipo {
    private String titulacion;
    private Integer aniosExperiencia;

    // Constructor
    public Masajista(int id, String nombre, String apellidos, int edad, String titulacion, int aniosExperiencia) {
        super(id, nombre, apellidos, edad);
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

    // Sobrescritura del método concentrarse
    @Override
    public void concentrarse() {
        System.out.println("El masajista se concentra preparando sus técnicas de masaje...");
    }

    // Sobrescritura del método viajar
    @Override
    public void viajar() {
        System.out.println("El masajista viaja con el equipo llevando su equipo de trabajo...");
    }
}