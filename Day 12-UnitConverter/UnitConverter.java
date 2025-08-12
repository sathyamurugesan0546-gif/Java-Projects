import java.util.Scanner;

public class UnitConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n===== Unit Converter =====");
            System.out.println("1. Temperature Converter");
            System.out.println("2. Length Converter");
            System.out.println("3. Weight Converter");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    temperatureConverter(sc);
                    break;
                case 2:
                    lengthConverter(sc);
                    break;
                case 3:
                    weightConverter(sc);
                    break;
                case 4:
                    System.out.println("Exiting... Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice! Try again.");
            }
        } while (choice != 4);

        sc.close();
    }

    public static void temperatureConverter(Scanner sc) {
        System.out.println("\n--- Temperature Converter ---");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.print("Choose an option: ");
        int option = sc.nextInt();

        if (option == 1) {
            System.out.print("Enter Celsius: ");
            double c = sc.nextDouble();
            double f = (c * 9/5) + 32;
            System.out.println(c + "°C = " + f + "°F");
        } else if (option == 2) {
            System.out.print("Enter Fahrenheit: ");
            double f = sc.nextDouble();
            double c = (f - 32) * 5/9;
            System.out.println(f + "°F = " + c + "°C");
        } else {
            System.out.println("Invalid choice!");
        }
    }

    public static void lengthConverter(Scanner sc) {
        System.out.println("\n--- Length Converter ---");
        System.out.println("1. Meters to Kilometers");
        System.out.println("2. Kilometers to Meters");
        System.out.print("Choose an option: ");
        int option = sc.nextInt();

        if (option == 1) {
            System.out.print("Enter meters: ");
            double m = sc.nextDouble();
            System.out.println(m + " m = " + (m / 1000) + " km");
        } else if (option == 2) {
            System.out.print("Enter kilometers: ");
            double km = sc.nextDouble();
            System.out.println(km + " km = " + (km * 1000) + " m");
        } else {
            System.out.println("Invalid choice!");
        }
    }

    public static void weightConverter(Scanner sc) {
        System.out.println("\n--- Weight Converter ---");
        System.out.println("1. Kilograms to Grams");
        System.out.println("2. Grams to Kilograms");
        System.out.print("Choose an option: ");
        int option = sc.nextInt();

        if (option == 1) {
            System.out.print("Enter kilograms: ");
            double kg = sc.nextDouble();
            System.out.println(kg + " kg = " + (kg * 1000) + " g");
        } else if (option == 2) {
            System.out.print("Enter grams: ");
            double g = sc.nextDouble();
            System.out.println(g + " g = " + (g / 1000) + " kg");
        } else {
            System.out.println("Invalid choice!");
        }
    }
}
