import java.util.Scanner;

public class IterativeFactorial {
    public static long factorial(int n) {
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
	    System.out.print("___Factorial of Numbers___ \n");
		
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int number = scanner.nextInt();
      
        long result = factorial(number);
        System.out.println("Factorial of " + number + " using iteration is: " + result);
    }
}
