import java.util.Scanner;

public class QuizGame {
    static float rightanswer = 0;
    static float questionnumbers = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Quiz Game\n");

        System.out.println("Register your Name");
        String name = scanner.nextLine();

        int totalbalance = 0;
        char playagain;

        do {
            totalbalance = playquiz(scanner);

            System.out.println("Congratulations " + name);
            System.out.println("Total right answer is " + rightanswer);
            float percentage_of_rightanswer = (rightanswer / questionnumbers) * 100;
            System.out.println("Your " + percentage_of_rightanswer + "% answer is right");

            System.out.println("Do you want to play QUIZ again? Type Y or N?");
            playagain = scanner.next().charAt(0);
            scanner.nextLine();  // Consume the newline character left by next()

            if (playagain == 'Y' || playagain == 'y') {
                rightanswer = 0;
                questionnumbers = 0;
            } else {
                System.out.println("Thank you for playing the game!");
            }

        } while (playagain == 'Y' || playagain == 'y');

        scanner.close();
    }

    public static int playquiz(Scanner scanner) {
        char s;
        char option;
        float mainbalance = 0;

        System.out.println("Please enter 's' to start the game");

        s = scanner.next().charAt(0);
        scanner.nextLine();  // Consume the newline character left by next()

        if (s == 's' || s == 'S') {
            System.out.println("Which level do you want to play?");
            System.out.println("1. Beginner\n2. Master\n3. Legendary");

            String level = scanner.nextLine();
            switch (level) {
                case "1": // Beginner level
                    playBeginnerLevel(scanner);
                    break;

                case "2": // Master level
                    playMasterLevel(scanner);
                    break;

                case "3": // Legendary level
                    playLegendaryLevel(scanner);
                    break;

                default:
                    System.out.println("Wrong input... Please enter 1, 2, or 3.");
                    return playquiz(scanner);
            }
        } else {
            System.out.println("Wrong input... Please enter 's' to start the game.");
            return playquiz(scanner);
        }

        return (int) mainbalance;
    }

    public static void playBeginnerLevel(Scanner scanner) {
        char option;

        System.out.println("Q1. What is the value of 10 + 5?");
        System.out.println("(a) 15 (b) 20 (c) 30 (d) 10");
        System.out.print("Your answer: ");
        option = scanner.next().charAt(0);
        questionnumbers++;
        if (option == 'a' || option == 'A') {
            rightanswer++;
            System.out.println("Your answer is Right\n");
        } else {
            System.out.println("Your answer is wrong\n");
        }

        System.out.println("Q2. What is the value of 5 - 2?");
        System.out.println("(a) 3 (b) 10 (c) 1 (d) 6");
        System.out.print("Your answer: ");
        option = scanner.next().charAt(0);
        questionnumbers++;
        if (option == 'a' || option == 'A') {
            rightanswer++;
            System.out.println("Your answer is Right\n");
        } else {
            System.out.println("Your answer is wrong\n");
        }

        System.out.println("Q3. What is the value of 3 - 7?");
        System.out.println("(a) 15 (b) -4 (c) 3 (d) 10");
        System.out.print("Your answer: ");
        option = scanner.next().charAt(0);
        questionnumbers++;
        if (option == 'b' || option == 'B') {
            rightanswer++;
            System.out.println("Your answer is Right\n");
        } else {
            System.out.println("Your answer is wrong\n");
        }

        System.out.println("Q4. What is the value of 10 - 10?");
        System.out.println("(a) 15 (b) -4 (c) 3 (d) 0");
        System.out.print("Your answer: ");
        option = scanner.next().charAt(0);
        questionnumbers++;
        if (option == 'd' || option == 'D') {
            rightanswer++;
            System.out.println("Your answer is Right\n");
        } else {
            System.out.println("Your answer is wrong\n");
        }

        System.out.println("Q5. What is the value of 0 + 2?");
        System.out.println("(a) 15 (b) -4 (c) 2 (d) 0");
        System.out.print("Your answer: ");
        option = scanner.next().charAt(0);
        questionnumbers++;
        if (option == 'c' || option == 'C') {
            rightanswer++;
            System.out.println("Your answer is Right\n");
        } else {
            System.out.println("Your answer is wrong\n");
        }
    }

    public static void playMasterLevel(Scanner scanner) {
        char option;

        System.out.println("Q1. What is the value of 10 * 5?");
        System.out.println("(a) 50 (b) 20 (c) 30 (d) 10");
        System.out.print("Your answer: ");
        option = scanner.next().charAt(0);
        questionnumbers++;
        if (option == 'a' || option == 'A') {
            rightanswer++;
            System.out.println("Your answer is Right\n");
        } else {
            System.out.println("Your answer is wrong\n");
        }

        System.out.println("Q2. What is the value of 5 / 2?");
        System.out.println("(a) 2.5 (b) 10 (c) 1 (d) 6");
        System.out.print("Your answer: ");
        option = scanner.next().charAt(0);
        questionnumbers++;
        if (option == 'a' || option == 'A') {
            rightanswer++;
            System.out.println("Your answer is Right\n");
        } else {
            System.out.println("Your answer is wrong\n");
        }

        System.out.println("Q3. What is the value of 3 * 7?");
        System.out.println("(a) 15 (b) 21 (c) 3 (d) 10");
        System.out.print("Your answer: ");
        option = scanner.next().charAt(0);
        questionnumbers++;
        if (option == 'b' || option == 'B') {
            rightanswer++;
            System.out.println("Your answer is Right\n");
        } else {
            System.out.println("Your answer is wrong\n");
        }

        System.out.println("Q4. What is the value of 10 / 10?");
        System.out.println("(a) 15 (b) -4 (c) 3 (d) 1");
        System.out.print("Your answer: ");
        option = scanner.next().charAt(0);
        questionnumbers++;
        if (option == 'd' || option == 'D') {
            rightanswer++;
            System.out.println("Your answer is Right\n");
        } else {
            System.out.println("Your answer is wrong\n");
        }

        System.out.println("Q5. What is the value of 0 / 2?");
        System.out.println("(a) 15 (b) -4 (c) 0 (d) 2");
        System.out.print("Your answer: ");
        option = scanner.next().charAt(0);
        questionnumbers++;
        if (option == 'c' || option == 'C') {
            rightanswer++;
            System.out.println("Your answer is Right\n");
        } else {
            System.out.println("Your answer is wrong\n");
        }
    }

    public static void playLegendaryLevel(Scanner scanner) {
        char option;

        System.out.println("Q1. What is the value of 10 * 5 + 10 * 5?");
        System.out.println("(a) 500 (b) 200 (c) 300 (d) 100");
        System.out.print("Your answer: ");
        option = scanner.next().charAt(0);
        questionnumbers++;
        if (option == 'd' || option == 'D') {
            rightanswer++;
            System.out.println("Your answer is Right\n");
        } else {
            System.out.println("Your answer is wrong\n");
        }

        System.out.println("Q2. What is the value of 5 / 2 + 5 * 2?");
        System.out.println("(a) 12.5 (b) 10 (c) 1 (d) 6");
        System.out.print("Your answer: ");
        option = scanner.next().charAt(0);
        questionnumbers++;
        if (option == 'a' || option == 'A') {
            rightanswer++;
            System.out.println("Your answer is Right\n");
        } else {
            System.out.println("Your answer is wrong\n");
        }

        System.out.println("Q3. What is the value of 3 * 7 + 10 * 100?");
        System.out.println("(a) 1500 (b) 21000 (c) 30000 (d) 10001");
        System.out.print("Your answer: ");
        option = scanner.next().charAt(0);
        questionnumbers++;
        if (option == 'b' || option == 'B') {
            rightanswer++;
            System.out.println("Your answer is Right\n");
        } else {
            System.out.println("Your answer is wrong\n");
        }

        System.out.println("Q4. What is the value of 10 / 10 - 100 / 10?");
        System.out.println("(a) 15 (b) -4 (c) 3 (d) -9");
        System.out.print("Your answer: ");
        option = scanner.next().charAt(0);
        questionnumbers++;
        if (option == 'd' || option == 'D') {
            rightanswer++;
            System.out.println("Your answer is Right\n");
        } else {
            System.out.println("Your answer is wrong\n");
        }

        System.out.println("Q5. What is the value of 0 / 2 - 99 / 33?");
        System.out.println("(a) 15 (b) -4 (c) -3 (d) 2");
        System.out.print("Your answer: ");
        option = scanner.next().charAt(0);
        questionnumbers++;
        if (option == 'c' || option == 'C') {
            rightanswer++;
            System.out.println("Your answer is Right\n");
        } else {
            System.out.println("Your answer is wrong\n");
        }
    }
}
