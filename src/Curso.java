import java.sql.Array;
import java.util.ArrayList;

public class Curso {
    private String nombre;
    private String disciplina;
    private int edadMinima;
    private int edadMaxima;
    private String horario;
    private Entrenador entrenador;
    private ArrayList<Participante> participantes;
    private final int cupoMaximo = 30;

    public Curso(String nombre, String disciplina, int edadMinima, int edadMaxima, String horario, Entrenador entrenador) {
        this.nombre = nombre;
        this.disciplina = disciplina;
        this.edadMinima = edadMinima;
        this.edadMaxima = edadMaxima;
        this.horario = horario;
        this.entrenador = entrenador;
        this.participantes = new ArrayList<>();
    }

    public void inscribir(Participante p) {
        if (participantes.size() < cupoMaximo && p.getEdad() >= edadMinima && p.getEdad() <= edadMaxima) {
            participantes.add(p);
            System.out.println(" Participante inscrito: " + p.getNombre());
        } else {
            System.out.println(" No se pudo inscribir a: " + p.getNombre());
        }
    }

    public void mostrarParticipantes() {
        System.out.println(" Participantes del curso " + nombre + ":");
        for (Participante p : participantes) {
            p.mostrarDatos();
        }
    }
}
