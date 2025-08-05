import java.util.Scanner;

public class QuizApp {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String[] questions = {

            "1. What is the capital of India?",
            "2. Which language is used for Android development?",
            "3. What is 2 + 2?",
            "4. Who wrote the Mahabharata?",
            "5. Which planet is known as the Red Planet?",
            "6. What is the largest planet in our solar system?",
            "7. What is the smallest country in the world?",
            "8. Who is the author of the book 'Think and Grow Rich.'?",
            "9. What is the chemical symbol for gold?",
            "10. What is the chemical symbol for silver?",
            "11. What is the chemical symbol for copper?",
            "12. What is the chemical symbol for mercury?",
            "13. What is the chemical symbol for lead?",
            "14. What is the chemical symbol for tin?",
            "15. What is the most selling bike in India?"

        };

        String[] options = {

            "A) Mumbai", "B) Delhi", "C) Kolkata", "D) Chennai",
            "A) Java", "B) Python", "C) HTML", "D) Swift",
            "A) 3", "B) 4", "C) 5", "D) 2",
            "A) Kalidas", "B) Ved Vyas", "C) Tulsidas", "D) Valmiki",
            "A) Earth", "B) Mars", "C) Jupiter","D) Saturn",
            "A) Jupiter", "B) Saturn", "C) Uranus", "D) Neptune",
            "A) Vatican City", "B) Monaco", "C) Nauru", "D)China",
            "A) Napoleon Hill", "B) Dale Carnegie", "C) Stephen Covey","D) Brian Tracy",
            "A) Au", "B) Ag", "C) Hg", "D) Pb",
            "A) Au", "B) Ag", "C) Cu", "D) Pb",
            "A) Cu", "B) Ag", "C) Au", "D) H",
            "A) Hg", "B) Ag", "C) Au", "D) Pb",
            "A) Pb", "B) Ag", "C) Au", "D) H",
            "A) Sn", "B) Ag", "C) Au", "D) Pb",
            "A) Royal Enfield", "B) Bajaj", "C) Honda","D) TVS"

        };

        char[] answers = {'B', 'A', 'B', 'B', 'B', 'A', 'A', 'A', 'A', 'B', 'A', 'A', 'A', 'A', 'A' };

        boolean playAgain = true;

        while (playAgain) {

            int score = 0;

            System.out.println("\n Welcome to the Quiz App!\n");

            for (int i = 0; i < questions.length; i++) {

                System.out.println(questions[i]);
                System.out.println(options[i * 4]);
                System.out.println(options[i * 4 + 1]);
                System.out.println(options[i * 4 + 2]);
                System.out.println(options[i * 4 + 3]);
                System.out.print("Your answer (A/B/C/D): ");
                char userAnswer = input.next().toUpperCase().charAt(0);

                if (userAnswer == answers[i]) {
                    System.out.println(" Correct!\n");
                    score++;
                } else {
                    System.out.println(" Wrong! Correct answer: " + answers[i] + "\n");
                }
            }

            System.out.println(" You scored " + score + " out of " + questions.length);
            int percent = (score * 100) / questions.length;

            if (percent >= 60) {

                System.out.println(" Congratulations! You passed with " + percent + "%");

            } else {

                System.out.println(" Sorry, you failed with " + percent + "%");

            }

            System.out.print("\nDo you want to play again? (yes/no): ");

            String choice = input.next().toLowerCase();

            if (!choice.equals("yes") && !choice.equals("y")) {

                playAgain = false;

                System.out.println(" Thank you for playing the Quiz App!");



            }
        }
    }
}
