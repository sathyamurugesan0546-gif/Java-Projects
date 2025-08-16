import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int choice;

        System.out.println("===== Digital Dice Roller =====");

        do {
            System.out.println("\nChoose number of dice to roll (1 to 5): ");
            int diceCount = sc.nextInt();

            if (diceCount == 1) {
                int roll = random.nextInt(6) + 1;
                System.out.println("You rolled: " + roll);
            } else if (diceCount == 2) {
                int roll1 = random.nextInt(6) + 1;
                int roll2 = random.nextInt(6) + 1;
                System.out.println("You rolled: " + roll1 + " and " + roll2);
            } else if (diceCount == 3) {
                int roll1 = random.nextInt(6) + 1;
                int roll2 = random.nextInt(6) + 1;
				int roll3 = random.nextInt(6) + 1;
                System.out.println("You rolled: " + roll1 + " , " + roll2 + " and " + roll3);
            }else if (diceCount == 4) {
                int roll1 = random.nextInt(6) + 1;
                int roll2 = random.nextInt(6) + 1;
				int roll3 = random.nextInt(6) + 1;
				int roll4 = random.nextInt(6) + 1;
                System.out.println("You rolled: " + roll1 + " , " + roll2 + " , " + roll3 + " and " + roll4);
            }else if (diceCount == 4) {
                int roll1 = random.nextInt(6) + 1;
                int roll2 = random.nextInt(6) + 1;
				int roll3 = random.nextInt(6) + 1;
				int roll4 = random.nextInt(6) + 1;
				int roll5 = random.nextInt(6) + 1;
                System.out.println("You rolled: " + roll1 + " , " + roll2 + " , " + roll3 + " , " + roll4 +  " and " + roll5);
            } else {
                System.out.println("Invalid choice. Choose from 1 to 5.");
            }

            System.out.println("\nDo you want to roll again? (1 = Yes, 0 = No): ");
            choice = sc.nextInt();

        } while (choice != 0);

        System.out.println("Thanks for playing!");
        sc.close();
    }
}
