import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Exchange rates (static for now)
        double usdToInr = 83.12;
        double eurToInr = 91.45;
        double gbpToInr = 108.33;

        System.out.println("=== Currency Converter ===");
        System.out.println("Available conversions:");
        System.out.println("1. USD to INR");
        System.out.println("2. EUR to INR");
        System.out.println("3. GBP to INR");
        System.out.print("Enter your choice (1/2/3): ");
        int choice = scanner.nextInt();

        System.out.print("Enter amount: ");
        double amount = scanner.nextDouble();
        double result;

        switch (choice) {
            case 1:
                result = amount * usdToInr;
                System.out.printf("%.2f USD = %.2f INR%n", amount, result);
                break;
            case 2:
                result = amount * eurToInr;
                System.out.printf("%.2f EUR = %.2f INR%n", amount, result);
                break;
            case 3:
                result = amount * gbpToInr;
                System.out.printf("%.2f GBP = %.2f INR%n", amount, result);
                break;
            default:
                System.out.println("Invalid choice! Please try again.");
        }

        scanner.close();
    }
}
