import java.util.Scanner;

public class MaximumDifferenceInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length of array: ");
        int n = sc.nextInt();

        if (n < 2) {
            System.out.println("Array must contain at least 2 elements.");
            sc.close();
            return;
        }

        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int smallest = arr[0];
        int maxDifference = arr[1] - arr[0];

        for (int i = 1; i < n; i++) {
            int difference = arr[i] - smallest;

            if (difference > maxDifference) {
                maxDifference = difference;
            }

            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }

        System.out.println("Maximum difference = " + maxDifference);

        sc.close();
    }
}