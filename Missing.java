import java.util.Scanner;

public class Missing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int[] arr = new int[n - 1];

        System.out.println("Enter " + (n - 1) + " elements:");

        int actualSum = 0;

        for (int i = 0; i < n - 1; i++) {
            arr[i] = sc.nextInt();
            actualSum = actualSum + arr[i];
        }

        int expectedSum = n * (n + 1) / 2;

        int missing = expectedSum - actualSum;

        System.out.println("Missing number = " + missing);

        sc.close();
    }
}  