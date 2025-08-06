import java.util.Scanner;

public class RecursiveFactorial {
    public static long factorial(int n) {
        if (n == 0 || n == 1)
            return 1;
        else
            return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        System.out.print("___Factorial of Numbers___ \n");
		
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int number = scanner.nextInt();
        
        long result = factorial(number);
        System.out.println("Factorial of " + number + " using recursion is: " + result);
    }
}
