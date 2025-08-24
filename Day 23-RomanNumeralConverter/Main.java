import java.util.*;

public class Main {
    // Maps for conversion
    private static final TreeMap<Integer, String> intToRomanMap = new TreeMap<>();
    private static final Map<Character, Integer> romanToIntMap = new HashMap<>();

    static {
        // Initialize integer to Roman map
        intToRomanMap.put(1000, "M");
        intToRomanMap.put(900, "CM");
        intToRomanMap.put(500, "D");
        intToRomanMap.put(400, "CD");
        intToRomanMap.put(100, "C");
        intToRomanMap.put(90, "XC");
        intToRomanMap.put(50, "L");
        intToRomanMap.put(40, "XL");
        intToRomanMap.put(10, "X");
        intToRomanMap.put(9, "IX");
        intToRomanMap.put(5, "V");
        intToRomanMap.put(4, "IV");
        intToRomanMap.put(1, "I");

        // Initialize Roman to Integer map
        romanToIntMap.put('I', 1);
        romanToIntMap.put('V', 5);
        romanToIntMap.put('X', 10);
        romanToIntMap.put('L', 50);
        romanToIntMap.put('C', 100);
        romanToIntMap.put('D', 500);
        romanToIntMap.put('M', 1000);
    }

    // Integer to Roman
    public static String intToRoman(int num) {
        StringBuilder roman = new StringBuilder();
        while (num > 0) {
            int key = intToRomanMap.floorKey(num);
            roman.append(intToRomanMap.get(key));
            num -= key;
        }
        return roman.toString();
    }

    // Roman to Integer
    public static int romanToInt(String roman) {
        int result = 0;
        int prevValue = 0;
        for (int i = roman.length() - 1; i >= 0; i--) {
            int value = romanToIntMap.get(roman.charAt(i));
            if (value < prevValue) {
                result -= value;
            } else {
                result += value;
            }
            prevValue = value;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Roman Numeral Converter ---");
            System.out.println("1. Integer to Roman");
            System.out.println("2. Roman to Integer");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter an integer (1-3999): ");
                    int number = sc.nextInt();
                    if (number < 1 || number > 3999) {
                        System.out.println("Invalid number! Enter between 1 and 3999.");
                    } else {
                        System.out.println("Roman numeral: " + intToRoman(number));
                    }
                    break;

                case 2:
                    System.out.print("Enter a Roman numeral: ");
                    String roman = sc.nextLine().toUpperCase();
                    System.out.println("Integer value: " + romanToInt(roman));
                    break;

                case 3:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice! Try again.");
            }
        } while (choice != 3);

        sc.close();
    }
}
