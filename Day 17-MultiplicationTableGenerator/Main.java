import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Multiplication Table Generator ===");
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        System.out.print("Enter the range (e.g., 10 for up to 10): ");
        int range = scanner.nextInt();

        System.out.println("\nMultiplication Table for " + number + ":");
        for (int i = 1; i <= range; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }

        scanner.close();
    }
}
