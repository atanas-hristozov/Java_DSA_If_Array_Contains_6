import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] arrString = scanner.nextLine().split(",");
        int[] arr = new int[arrString.length];
        for (int i = 0; i < arrString.length; i++) {
            arr[i] = Integer.parseInt(arrString[i]);
        }
        int index = Integer.parseInt(scanner.nextLine());
        scanner.close();
        boolean result = contains6(arr, index);
        System.out.println(result);
    }

    private static boolean contains6(int[] arr, int index) {
        if (index >= arr.length) {
            return false;
        }
        if (arr[index] == 6) {
            return true;
        }
        return contains6(arr, index + 1);
    }
}