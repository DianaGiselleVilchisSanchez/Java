import java.util.Arrays;
import java.util.Scanner;

public class uni{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar el tamaño del arreglo
        System.out.print("Introduce el tamaño del arreglo: ");
        int tamano = scanner.nextInt();

        // Crear el arreglo
        int[] arreglo = new int[tamano];

        // Llenar el arreglo con valores ingresados por el usuario
        System.out.println("Introduce los elementos del arreglo:");
        for (int i = 0; i < tamano; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            arreglo[i] = scanner.nextInt();
        }

        // Imprimir el arreglo original
        System.out.println("Arreglo original: " + Arrays.toString(arreglo));

        // Sumar los elementos del arreglo
        int suma = sumarElementos(arreglo);
        System.out.println("Suma de los elementos: " + suma);

        // Encontrar el mayor elemento del arreglo
        int mayor = encontrarMayor(arreglo);
        System.out.println("Mayor elemento: " + mayor);

        // Encontrar el menor elemento del arreglo
        int menor = encontrarMenor(arreglo);
        System.out.println("Menor elemento: " + menor);

        // Ordenar el arreglo
        Arrays.sort(arreglo);
        System.out.println("Arreglo ordenado: " + Arrays.toString(arreglo));

        scanner.close();
    }

    // Método para sumar los elementos de un arreglo
    public static int sumarElementos(int[] arreglo) {
        int suma = 0;
        for (int valor : arreglo) {
            suma += valor;
        }
        return suma;
    }

    // Método para encontrar el mayor elemento de un arreglo
    public static int encontrarMayor(int[] arreglo) {
        int mayor = arreglo[0];
        for (int valor : arreglo) {
            if (valor > mayor) {
                mayor = valor;
            }
        }
        return mayor;
    }

    // Método para encontrar el menor elemento de un arreglo
    public static int encontrarMenor(int[] arreglo) {
        int menor = arreglo[0];
        for (int valor : arreglo) {
            if (valor < menor) {
                menor = valor;
            }
        }
        return menor;
    }
}

