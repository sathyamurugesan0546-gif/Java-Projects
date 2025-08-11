import java.util.Scanner;

public class Quiz {

    public static void main(String[] args) {
        String[] questions = {
            "1. Which planet is known as the 'Red Planet'?",
            "2. Who invented the telephone?",
            "3. What is the capital of Japan?",
            "4. In computing, what does 'CPU' stand for?",
            "5. Which gas do plants absorb during photosynthesis?",
            "6. Who wrote 'Romeo and Juliet'?",
            "7. What is the largest mammal in the world?",
            "8. How many continents are there on Earth?",
            "9. What is the boiling point of water at sea level?",
            "10. Who painted the Mona Lisa?"
        };

        String[][] options = {
            {"a) Venus", "b) Mars", "c) Jupiter", "d) Mercury"},
            {"a) Alexander Graham Bell", "b) Thomas Edison", "c) Nikola Tesla", "d) Guglielmo Marconi"},
            {"a) Beijing", "b) Seoul", "c) Tokyo", "d) Osaka"},
            {"a) Central Process Unit", "b) Central Processing Unit", "c) Computer Processing Utility", "d) Control Program Unit"},
            {"a) Oxygen", "b) Nitrogen", "c) Carbon Dioxide", "d) Hydrogen"},
            {"a) William Shakespeare", "b) Charles Dickens", "c) Jane Austen", "d) Mark Twain"},
            {"a) African Elephant", "b) Blue Whale", "c) Giraffe", "d) Orca"},
            {"a) 5", "b) 6", "c) 7", "d) 8"},
            {"a) 50°C", "b) 75°C", "c) 100°C", "d) 150°C"},
            {"a) Vincent van Gogh", "b) Pablo Picasso", "c) Leonardo da Vinci", "d) Michelangelo"}
        };

        char[] answers = {'b', 'a', 'c', 'b', 'c', 'a', 'b', 'c', 'c', 'c'};

        Scanner sc = new Scanner(System.in);
        int score = 0;

        System.out.println("=== Welcome to the General Knowledge Quiz ===\n");

        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            for (String option : options[i]) {
                System.out.println(option);
            }
            System.out.print("Your answer: ");
            char answer = sc.next().toLowerCase().charAt(0);

            if (answer == answers[i]) {
                System.out.println(" Correct!\n");
                score++;
            } else {
                System.out.println(" Wrong! Correct answer: " + answers[i] + "\n");
            }
        }

        System.out.println("=== Quiz Over! ===");
        System.out.println("Your score: " + score + "/" + questions.length);

        sc.close();
    }
}
