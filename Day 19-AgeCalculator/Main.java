import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your birth year (YYYY): ");
        int year = sc.nextInt();

        System.out.print("Enter your birth month (MM): ");
        int month = sc.nextInt();

        System.out.print("Enter your birth day (DD): ");
        int day = sc.nextInt();

        LocalDate birthDate = LocalDate.of(year, month, day);
        LocalDate currentDate = LocalDate.now();

        if (birthDate.isAfter(currentDate)) {
            System.out.println("Birth date cannot be in the future!");
        } else {
            Period age = Period.between(birthDate, currentDate);
            System.out.println("Your age is: " + age.getYears() + " years, " 
                               + age.getMonths() + " months, and " 
                               + age.getDays() + " days.");
        }

        sc.close();
    }
}
