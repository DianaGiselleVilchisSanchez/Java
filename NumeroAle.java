import java.util.Scanner;
import java.util.Random;

public class NumeroAle{ 
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numeroAleatorio = random.nextInt(100) + 1;
        int intentos = 0;
        int adivinanza = 0;

        System.out.println("¡Bienvenido al juego de adivinar el número!");
        System.out.println("He elegido un número entre 1 y 100. Intenta adivinarlo.");

        while (adivinanza != numeroAleatorio) {
            System.out.print("Introduce tu adivinanza: ");
            adivinanza = scanner.nextInt();
            intentos++;

            if (adivinanza < numeroAleatorio) {
                System.out.println("El número es mayor. Intenta de nuevo.");
            } else if (adivinanza > numeroAleatorio) {
                System.out.println("El número es menor. Intenta de nuevo.");
            } else {
                System.out.println("¡Felicidades! Adivinaste el número en " + intentos + " intentos.");
            }
        }

        scanner.close();
    }
}
