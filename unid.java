import java.util.Scanner;

public class unid{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el tamaño del arreglo: ");
        int tamano = scanner.nextInt();

        int[] arreglo = new int[tamano];
        System.out.println("Introduce los elementos del arreglo:");
        for (int i = 0; i < tamano; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            arreglo[i] = scanner.nextInt();
        }

        int pares = contarPares(arreglo);
        int impares = tamano - pares; 
        System.out.println("Número de elementos pares: " + pares);
        System.out.println("Número de elementos impares: " + impares);

        double promedio = calcularPromedio(arreglo);
        System.out.println("Promedio de los elementos: " + promedio);

        System.out.print("Introduce un número a buscar en el arreglo: ");
        int valorBuscado = scanner.nextInt();
        int indice = buscarElemento(arreglo, valorBuscado);
        
        if (indice != -1) {
            System.out.println("El número " + valorBuscado + " se encuentra en el índice " + indice);
        } else {
            System.out.println("El número " + valorBuscado + " no se encuentra en el arreglo.");
        }

        scanner.close();
    }

    public static int contarPares(int[] arreglo) {
        int contador = 0;
        for (int valor : arreglo) {
            if (valor % 2 == 0) {
                contador++;
            }
        }
        return contador;
    }
    public static double calcularPromedio(int[] arreglo) {
        int suma = 0;
        for (int valor : arreglo) {
            suma += valor;
        }
        return (double) suma / arreglo.length;
    }

public static int buscarElemento(int[] arreglo, int valorBuscado) {
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == valorBuscado) {
                return i;
            }
        }
        return -1;
    }
}
