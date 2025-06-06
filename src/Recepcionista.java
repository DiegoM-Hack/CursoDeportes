public class Recepcionista extends Persona {
    public Recepcionista(String nombre, String cedula, int edad) {
        super(nombre, cedula, edad);
    }

    public void inscribirParticipante(Participante p, Curso curso) {
        p.inscribirseCurso(curso);
    }

    @Override
    public void mostrarDatos() {
        System.out.println("Recepcionista: " + getNombre());
    }
}
