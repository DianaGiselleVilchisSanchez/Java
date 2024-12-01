import java.util.Arrays;
import java.util.Scanner;

public class calificaciones {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario la cantidad de calificaciones
        System.out.print("¿Cuántas calificaciones deseas ingresar? ");
        int cantidad = scanner.nextInt();

        // Crear un arreglo para almacenar las calificaciones
        double[] calificaciones = new double[cantidad];

        // Pedir las calificaciones al usuario
        System.out.println("Ingresa las calificaciones:");
        for (int i = 0; i < cantidad; i++) {
            System.out.print("Calificación " + (i + 1) + ": ");
            calificaciones[i] = scanner.nextDouble();
        }

        // Ordenar las calificaciones
        Arrays.sort(calificaciones);

        // Mostrar las calificaciones ordenadas
        System.out.println("\nCalificaciones ordenadas:");
        for (double calificacion : calificaciones) {
            System.out.println(calificacion);
        }

        scanner.close();
    }
}
