import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Crear objetos base
        Entrenador entrenador1 = new Entrenador("Juan Pérez", "10101010", 35, "08:00-10:00");
        Curso cursoFutbol = new Curso("Fútbol Básico", "Fútbol", 10, 18, "08:00-10:00", entrenador1);
        Cancha cancha1 = new Cancha("Cancha 1", "Fútbol");
        cancha1.asignarCurso("08:00-10:00", cursoFutbol);
        Recepcionista recepcionista = new Recepcionista("Laura Torres", "90909090", 29);

        ArrayList<Participante> participantes = new ArrayList<>();

        int opcion;
        do {
            System.out.println("\n MENU PRINCIPAL");
            System.out.println("1. Registrar nuevo participante");
            System.out.println("2. Inscribir participante a curso");
            System.out.println("3. Mostrar participantes inscritos");
            System.out.println("4. Mostrar cursos en cancha");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // limpiar buffer

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese nombre: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Ingrese cédula: ");
                    String cedula = scanner.nextLine();
                    System.out.print("Ingrese edad: ");
                    int edad = scanner.nextInt();
                    scanner.nextLine();

                    Participante nuevo = new Participante(nombre, cedula, edad);
                    participantes.add(nuevo);
                    System.out.println(" Participante registrado.");
                    break;

                case 2:
                    if (participantes.isEmpty()) {
                        System.out.println("⚠ No hay participantes registrados.");
                        break;
                    }
                    System.out.println("Lista de participantes:");
                    for (int i = 0; i < participantes.size(); i++) {
                        System.out.println((i + 1) + ". " + participantes.get(i).getNombre());
                    }
                    System.out.print("Seleccione el número del participante a inscribir: ");
                    int index = scanner.nextInt();
                    scanner.nextLine();

                    if (index >= 1 && index <= participantes.size()) {
                        recepcionista.inscribirParticipante(participantes.get(index - 1), cursoFutbol);
                    } else {
                        System.out.println(" Opción inválida.");
                    }
                    break;

                case 3:
                    cursoFutbol.mostrarParticipantes();
                    break;

                case 4:
                    cancha1.mostrarCursos();
                    break;

                case 5:
                    System.out.println(" Saliendo del sistema...");
                    break;

                default:
                    System.out.println(" Opción inválida.");
            }

        } while (opcion != 5);

        scanner.close();

    }
}