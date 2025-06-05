public class Entrenador extends Persona {

    private String diciplina;

    public Entrenador(String nombre, String cedula, int edad, String diciplina) {
        super(nombre, cedula, edad);
        this.diciplina = diciplina;
    }

    @Override
    public void mostrarDatos() {
        System.out.println("Entrenador: " + getNombre()+ "Edad: " + getEdad()+ "Diciplina: " + diciplina);
    }
}
