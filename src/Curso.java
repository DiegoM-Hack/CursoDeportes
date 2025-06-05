import java.sql.Array;
import java.util.ArrayList;

public class Curso {
    private final ArrayList<Object> inscritos;
    private String nombre;
    private int edadMin;
    private int edadMax;
    private String diciplina;
    private String horario;
    private String entrenador;

    public Curso(String nombre, int edadMin, int edadMax, String diciplina, String horario, String entrenador) {
        this.nombre = nombre;
        this.edadMin = edadMin;
        this.edadMax = edadMax;
        this.diciplina = diciplina;
        this.horario = horario;
        this.entrenador = entrenador;
        this.inscritos = new ArrayList<>();
    }

    public boolean inscribir(Participante p) {
        if(inscritos.size()<30 && p.getEdad() >= edadMin && p.getEdad() <= edadMax) {
            inscritos.add(p);
        }return true;
    }

}
