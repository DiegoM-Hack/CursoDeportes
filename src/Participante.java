public class Participante extends Persona {


    public Participante(String cedula, String nombre, String apellido, int edad) {
        super(nombre, cedula, edad);
    }

    @Override
    public void mostrarDatos() {
        System.out.println("Participante: " + getNombre()+ "Edad: " + getEdad());
    }
}
