public class fibonacci {

    public static void main(String[] args) {
        int n = 10;
        int num1 = 0, num2 = 1;

        System.out.println("Los primeros " + n + " números de la secuencia de Fibonacci:");

        for (int i = 1; i <= n; ++i) {
            System.out.print(num1 + " ");

            int siguienteNumero = num1 + num2;
            num1 = num2;
            num2 = siguienteNumero;
        }
    }
}
