
import java.util.Scanner;

public class Cadena {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa una cadena de texto: ");
        String cadena = scanner.nextLine();

        String cadenaInvertida = invertirCadena(cadena);
        System.out.println("Cadena invertida: " + cadenaInvertida);
        
        scanner.close();
    }

    public static String invertirCadena(String cadena) {
        StringBuilder cadenaInvertida = new StringBuilder(cadena);
        return cadenaInvertida.reverse().toString();
    }
}
