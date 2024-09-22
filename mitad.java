public class mitad {
    public static void main(String[] args) {
        int altura = 10; 

        for (int i = 0; i < altura; i++) {
            
            for (int j = 0; j < altura - i - 1; j++) {
                System.out.print(" ");
            }
            
            for (int k = 0; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}