public abstract class Persona {
    private String nombre;
    private String cedula;
    private int edad;

    public Persona(String nombre, String cedula, int edad) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.edad = edad;
    }

    // Getters y Setters
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getCedula() { return cedula; }
    public void setCedula(String cedula) { this.cedula = cedula; }

    public int getEdad() { return edad; }
    public void setEdad(int edad) { this.edad = edad; }

    // Método abstracto (polimorfismo)
    public abstract void mostrarDatos();
}
