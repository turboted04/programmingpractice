
import java.util.Random;

public class ArraysMed {

    public static int[] reverseArr(int[] arr) {
        int[] rev = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            rev[i] = arr[(arr.length - 1) - i];
        }
        return rev;
    }

    public static int maxIndex(int[] arr) {
        int maxIndex = 0;
        int max = arr[maxIndex]; //NOT 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    public static boolean ascendingOrder(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static int targetOccurences(int[] arr, int target) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Random random = new Random();
        int[] arr2 = new int[10];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = random.nextInt(99) + 1;
        }

        System.out.println(maxIndex(arr2));

        int[] arr3 = {0, 1, 2, 2, 5, 6, 7, 8, 9};
        int[] arr4 = {1, 2, 3, 4, 5, 6, 5, 8, 9};

        System.out.println(ascendingOrder(arr3));
        System.out.println(ascendingOrder(arr4));
        System.out.println(targetOccurences(arr4, 2));
    }
}
