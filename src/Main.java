import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<String> participantes = new ArrayList<>();
        int opcion;

        do {
            System.out.println("\n=== Menú del Curso ===");
            System.out.println("1. Agregar participante");
            System.out.println("2. Mostrar participantes");
            System.out.println("3. Salir");
            System.out.print("Elige una opción: ");

            // Validar si se ingresó un número
            while (!sc.hasNextInt()) {
                System.out.print("Por favor, ingresa un número válido: ");
                sc.next();
            }

            opcion = sc.nextInt();
            sc.nextLine(); // Limpiar buffer

            switch (opcion) {
                case 1:
                    System.out.print("Ingresa el nombre del participante: ");
                    String nombre = sc.nextLine();
                    participantes.add(nombre);
                    System.out.println(" Participante agregado con éxito.");
                    break;

                case 2:
                    System.out.println("\n Lista de Participantes:");
                    if (participantes.isEmpty()) {
                        System.out.println("Aún no hay participantes registrados.");
                    } else {
                        for (int i = 0; i < participantes.size(); i++) {
                            System.out.println((i + 1) + ". " + participantes.get(i));
                        }
                    }
                    break;

                case 3:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println(" Opción no válida. Intenta de nuevo.");
            }

        } while (opcion != 3);

        sc.close();



    }
}