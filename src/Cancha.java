import java.util.HashMap;
import java.util.ArrayList;

public class Cancha {
    private String nombre;
    private String disciplina;
    private HashMap<String, ArrayList<Curso>> cursosPorHorario;

    public Cancha(String nombre, String disciplina) {
        this.nombre = nombre;
        this.disciplina = disciplina;
        this.cursosPorHorario = new HashMap<>();
    }

    public void asignarCurso(String horario, Curso curso) {
        cursosPorHorario.putIfAbsent(horario, new ArrayList<>());
        cursosPorHorario.get(horario).add(curso);
    }

    public void mostrarCursos() {
        System.out.println(" Cancha: " + nombre + " (" + disciplina + ")");
        for (String horario : cursosPorHorario.keySet()) {
            System.out.println(" Horario: " + horario);
            for (Curso c : cursosPorHorario.get(horario)) {
                System.out.println(" - Curso: " + c);
            }
        }
    }
}
