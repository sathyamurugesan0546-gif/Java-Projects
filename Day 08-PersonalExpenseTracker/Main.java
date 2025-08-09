import java.util.ArrayList;
import java.util.Scanner;

class Expense {
    double amount;
    String category;
    String description;

    public Expense(double amount, String category, String description) {
        this.amount = amount;
        this.category = category;
        this.description = description;
    }

    @Override
    public String toString() {
        return "Amount: Rs " + amount + " | Category: " + category + " | Description: " + description;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Expense> expenses = new ArrayList<>();

        while (true) {
            System.out.println("\n=== Personal Expense Tracker ===");
            System.out.println("1. Add Expense");
            System.out.println("2. View All Expenses");
            System.out.println("3. View Total by Category");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter amount: Rs ");
                    double amount = scanner.nextDouble();
                    scanner.nextLine();

                    System.out.print("Enter category (Food/Transport/Shopping/etc.): ");
                    String category = scanner.nextLine();

                    System.out.print("Enter description: ");
                    String description = scanner.nextLine();

                    expenses.add(new Expense(amount, category, description));
                    System.out.println(" Expense added successfully!");
                    break;

                case 2:
                    if (expenses.isEmpty()) {
                        System.out.println("No expenses recorded yet.");
                    } else {
                        System.out.println("\n--- All Expenses ---");
                        for (Expense e : expenses) {
                            System.out.println(e);
                        }
                    }
                    break;

                case 3:
                    if (expenses.isEmpty()) {
                        System.out.println("No expenses to calculate totals.");
                    } else {
                        System.out.println("\n--- Total by Category ---");
                        ArrayList<String> categories = new ArrayList<>();

                        for (Expense e : expenses) {
                            if (!categories.contains(e.category)) {
                                categories.add(e.category);
                            }
                        }

                        for (String cat : categories) {
                            double total = 0;
                            for (Expense e : expenses) {
                                if (e.category.equalsIgnoreCase(cat)) {
                                    total += e.amount;
                                }
                            }
                            System.out.println(cat + ": Rs " + total);
                        }
                    }
                    break;

                case 4:
                    System.out.println("Thank you for using the Expense Tracker. Goodbye!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
