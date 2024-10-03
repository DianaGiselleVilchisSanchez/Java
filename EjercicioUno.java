import java.util.Scanner;

public class EjercicioUno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int sumaPares = 0;
        int sumaImpares = 0;
        
        System.out.println("Ingresa el número límite...:");
        int a = sc.nextInt();
        
        for (int i = 1; i <= a; i++) {
            if (i % 2 == 0) {
                sumaPares += i;
            }
            if (i % 2 != 0) {
                sumaImpares += i;
            }
        }
        
        System.out.println("La suma de los números pares es: " + sumaPares);
        System.out.println("La suma de los números impares es: " + sumaImpares);
        
        sc.close();
    }
}
