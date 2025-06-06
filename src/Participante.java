public class Participante extends Persona {
    public Participante(String nombre, String cedula, int edad) {
        super(nombre, cedula, edad);
    }

    public void inscribirseCurso(Curso curso) {
        curso.inscribir(this);
    }

    @Override
    public void mostrarDatos() {
        System.out.println("Participante: " + getNombre() + ", Cédula: " + getCedula() + ", Edad: " + getEdad());
    }
}

