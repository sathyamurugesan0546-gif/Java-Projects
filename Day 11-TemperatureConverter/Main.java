import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Temperature Converter");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.println("3. Celsius to Kelvin");
        System.out.println("4. Kelvin to Celsius");
        System.out.println("5. Fahrenheit to Kelvin");
        System.out.println("6. Kelvin to Fahrenheit");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        System.out.print("Enter temperature: ");
        double temp = sc.nextDouble();
        double result = 0;

        switch (choice) {
            case 1:
                result = (temp * 9/5) + 32;
                System.out.printf("%.2f°C = %.2f°F\n", temp, result);
                break;
            case 2:
                result = (temp - 32) * 5/9;
                System.out.printf("%.2f°F = %.2f°C\n", temp, result);
                break;
            case 3:
                result = temp + 273.15;
                System.out.printf("%.2f°C = %.2fK\n", temp, result);
                break;
            case 4:
                result = temp - 273.15;
                System.out.printf("%.2fK = %.2f°C\n", temp, result);
                break;
            case 5:
                result = (temp - 32) * 5/9 + 273.15;
                System.out.printf("%.2f°F = %.2fK\n", temp, result);
                break;
            case 6:
                result = (temp - 273.15) * 9/5 + 32;
                System.out.printf("%.2fK = %.2f°F\n", temp, result);
                break;
            default:
                System.out.println("Invalid choice!");
        }

        sc.close();
    }
}
