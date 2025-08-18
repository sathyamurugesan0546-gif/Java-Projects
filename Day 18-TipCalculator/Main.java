import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Tip Calculator");
        System.out.print("Enter the bill amount: ");
        double billAmount = scanner.nextDouble();

        System.out.print("Enter the tip percentage (e.g., 10 for 10%): ");
        double tipPercentage = scanner.nextDouble();

        double tipAmount = (billAmount * tipPercentage) / 100;
        double totalAmount = billAmount + tipAmount;

        System.out.println("\nTip Amount: Rs" + tipAmount);
        System.out.println("Total Amount: Rs" + totalAmount);

        scanner.close();
    }
}
