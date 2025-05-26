public class miembroequipo { 
    private Integer id;
    private String nombre;
    private String apellidos;
    private Integer edad;

    // Constructor
    public miembroequipo(Integer id, String nombre, String apellidos, Integer edad) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    // Getters y Setters (Encapsulación)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    // Métodos comunes
    public void concentrarse() {
        System.out.println("Concentrándose...");
    }

    public void viajar() {
        System.out.println("Viajando...");
    }
}