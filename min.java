import java.util.Scanner;

public class min {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];

        // Read first element
        arr[0] = sc.nextInt();
        int min = arr[0];

        // Read remaining elements
        for (int i = 1; i < n; i++) {
            arr[i] = sc.nextInt();

            if (min > arr[i]) {
                min = arr[i];
            }
        }

        System.out.println("Min: " + min);
    }
}