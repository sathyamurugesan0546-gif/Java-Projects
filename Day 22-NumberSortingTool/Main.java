import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter how many numbers you want to sort: ");
        int n = sc.nextInt();

        int[] numbers = new int[n];
        System.out.println("Enter the numbers:");
        for(int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }

        System.out.print("Sort in (1) Ascending or (2) Descending? Enter 1 or 2: ");
        int choice = sc.nextInt();

        if(choice == 1) {
            Arrays.sort(numbers);
            System.out.println("Sorted in Ascending order: " + Arrays.toString(numbers));
        } else if(choice == 2) {
            Arrays.sort(numbers);
            System.out.print("Sorted in Descending order: [");
            for(int i = numbers.length - 1; i >= 0; i--) {
                System.out.print(numbers[i]);
                if(i != 0) System.out.print(", ");
            }
            System.out.println("]");
        } else {
            System.out.println("Invalid choice!");
        }

        sc.close();
    }
}
