import java.util.Scanner;
HEAD
import java.util.Random;

cfcf6e1790c512c37442c1b3a9f5c948c3672df5

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
HEAD
        Random rand = new Random();

        int numberToGuess = rand.nextInt(100) + 1;
        int guess;
        int attempts = 0;

        System.out.println("Guess a number between 1 and 100:");

        do {
            System.out.print("Your guess: ");
            guess = scanner.nextInt();
            attempts++;

            if (guess < numberToGuess) {
                System.out.println("Too low!");
            } else if (guess > numberToGuess) {
                System.out.println("Too high!");
            } else {
                System.out.println("Correct! You guessed it in " + attempts + " attempts.");
            }

        } while (guess != numberToGuess);

        scanner.close();
    }
}


        System.out.println("Simple Calculator");
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter an operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        double result;

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 == 0) {
                    System.out.println("Error: Cannot divide by zero!");
                    return;
                }
                result = num1 / num2;
                break;
            default:
                System.out.println("Invalid operator!");
                return;
        }

        System.out.println("Result: " + result);
        scanner.close();
    }
}
cfcf6e1790c512c37442c1b3a9f5c948c3672df5
