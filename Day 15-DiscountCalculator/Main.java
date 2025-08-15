import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("===== Discount Calculator =====");

        System.out.print("Enter Original Price: Rs");
        double originalPrice = sc.nextDouble();

        System.out.print("Enter Discount Percentage: ");
        double discountPercent = sc.nextDouble();

        // Calculate discount
        double discountAmount = (originalPrice * discountPercent) / 100;
        double finalPrice = originalPrice - discountAmount;

        System.out.println("\n----- Bill Summary -----");
        System.out.println("Original Price: Rs" + originalPrice);
        System.out.println("Discount Percentage: " + discountPercent + "%");
        System.out.println("Discount Amount: Rs" + discountAmount);
        System.out.println("Final Price after Discount: Rs" + finalPrice);

        sc.close();
    }
}
