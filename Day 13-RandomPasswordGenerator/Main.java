import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter password length: ");
        int length = sc.nextInt();

        System.out.print("Include uppercase letters? (y/n): ");
        boolean includeUpper = sc.next().equalsIgnoreCase("y");

        System.out.print("Include lowercase letters? (y/n): ");
        boolean includeLower = sc.next().equalsIgnoreCase("y");

        System.out.print("Include numbers? (y/n): ");
        boolean includeNumbers = sc.next().equalsIgnoreCase("y");

        System.out.print("Include special characters? (y/n): ");
        boolean includeSpecial = sc.next().equalsIgnoreCase("y");

        String password = generatePassword(length, includeUpper, includeLower, includeNumbers, includeSpecial);
        System.out.println("\nGenerated Password: " + password);

        sc.close();
    }

    public static String generatePassword(int length, boolean upper, boolean lower, boolean numbers, boolean special) {
        String upperChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowerChars = "abcdefghijklmnopqrstuvwxyz";
        String numberChars = "0123456789";
        String specialChars = "!@#$%^&*()-_=+[]{}|;:,.<>?/";

        StringBuilder charPool = new StringBuilder();
        if (upper) charPool.append(upperChars);
        if (lower) charPool.append(lowerChars);
        if (numbers) charPool.append(numberChars);
        if (special) charPool.append(specialChars);

        if (charPool.length() == 0) {
            return "Error: No character types selected!";
        }

        Random random = new Random();
        StringBuilder password = new StringBuilder();

        for (int i = 0; i < length; i++) {
            int index = random.nextInt(charPool.length());
            password.append(charPool.charAt(index));
        }

        return password.toString();
    }
}
