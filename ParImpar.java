import java.util.Random;

public class ParImpar {
    public static void main(String[] args) {
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            int num = random.nextInt(100);
            if (num % 2 == 0) {
                System.out.println(num + " es par");
            } else {
                System.out.println(num + " es impar");
            }
        }
    }
}
