public class PersonalLimpieza extends Persona {
    private String canchaAsignada;
    private String horario;

    public PersonalLimpieza(String nombre, String cedula, int edad, String canchaAsignada, String horario) {
        super(nombre, cedula, edad);
        this.canchaAsignada = canchaAsignada;
        this.horario = horario;
    }

    @Override
    public void mostrarDatos() {
        System.out.println("Personal de limpieza: " + getNombre() + ", Cancha: " + canchaAsignada + ", Horario: " + horario);
    }
}