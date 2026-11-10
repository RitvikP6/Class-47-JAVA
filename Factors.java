import java.util.Scanner;
public class Factors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();}
        for (int i = 0; i < n; i++) {
            System.out.println("Factors of " + arr[i] + " are: ");
            for (int j = 1; j <= arr[i]; j++) {
                if (arr[i] % j == 0) {
                    System.out.print(j + " ");
                }
            }
            System.out.println();
        }
    }
}
