import java.util.Arrays;

public class Binaria {
    public static void main(String[] args) {
        int[] arr = {3, 6, 8, 12, 14, 18, 21, 24, 27, 30};
        int target = 18;
        int result = binaria(arr, target);
        if (result == -1) {
            System.out.println("Elemento no encontrado");
        } else {
            System.out.println("Elemento encontrado en el índice: " + result);
        }
    }

    public static int binaria(int[] arr, int target) {
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
}
