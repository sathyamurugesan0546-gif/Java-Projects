import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> chatHistory = new ArrayList<>();
        String message;
        String user1 = "User1";
        String user2 = "User2";

        System.out.println("=== Simple Chat Application ===");
        System.out.println("Type 'exit' to end the chat.\n");

        while (true) {
            System.out.print(user1 + ": ");
            message = scanner.nextLine();
            if (message.equalsIgnoreCase("exit")) break;
            chatHistory.add(user1 + ": " + message);

            System.out.print(user2 + ": ");
            message = scanner.nextLine();
            if (message.equalsIgnoreCase("exit")) break;
            chatHistory.add(user2 + ": " + message);
        }

        System.out.println("\n=== Chat History ===");
        for (String chat : chatHistory) {
            System.out.println(chat);
        }

        scanner.close();
    }
}
