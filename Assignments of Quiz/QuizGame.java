import java.util.Scanner;

public class QuizGame {

   //static float rightAnswer = 0;
    //static float TotalMarks = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Welcome to Quiz Game");
        System.out.println();
        System.out.println("Register your Name");
        String name = scanner.nextLine();

        float rightAnswer = 0;
       rightAnswer =  playQuiz (scanner);

        while (true) {
            float WrongAnswer =  (5 - rightAnswer);

           float TotalMarks = 0;
           TotalMarks =  (float) (rightAnswer - (0.25*WrongAnswer));
            
            if(TotalMarks < 0) {
                System.out.println(name+", You Fail the QUIZ "+" Your total marks is : 0");
            }
            else{
                System.out.println("Congratulation "+name+" Your total marks is : "+TotalMarks);
            }
            
            System.out.println("\nPress 1 to continue and press 0 to break");
            int userinput = scanner.nextInt();
            if(userinput == 0)
            {
                System.out.println("Thank You for playing the Game");
                                        break;
            }
            else {
               rightAnswer  = playQuiz (scanner);
            }
           }
        
          
    }

    public static int playQuiz(Scanner scanner) {
        char option;
        //float mainBalance = 0;
        //TotalMarks = 0;
        float rightAnswer = 0;
        System.out.println("Please enter S to start the Quiz");
        char s = scanner.next().charAt(0);

        if (s == 's' || s == 'S') {
            // Question 1
            System.out.println("Q1. What is the biggest sea port in Bangladesh?");
            System.out.println("(a) Chittagong (b) Dhaka (c) Cox Bazar (d) Tangail");
            System.out.print("Your answer: ");
            option = scanner.next().charAt(0);
            //questionNumbers++;
            if (option == 'a' || option == 'A') {
                rightAnswer++;
                System.out.println("Your answer is Right\n");
            } else {
                System.out.println("Wrong Answer. Correct Answer is Chittagong\n");
            }

            // Question 2
            System.out.println("Q2. Who is the richest man in the world?");
            System.out.println("(a) Mark Zuckerberg (b) Elon Musk (c) Walter Hysenberg (d) Akib Tomlinsion");
            System.out.print("Your answer: ");
            option = scanner.next().charAt(0);
            //questionNumbers++;
            if (option == 'b' || option == 'B') {
                rightAnswer++;
                System.out.println("Your answer is Right\n");
            } else {
                System.out.println("Wrong Answer. Correct Answer is Elon Musk\n");
            }

            // Question 3
            System.out.println("Q3. How many citizens died during the Liberation War in 1971?");
            System.out.println("(a) 10M (b) 5M (c) 3M (d) 6.5M");
            System.out.print("Your answer: ");
            option = scanner.next().charAt(0);
            //questionNumbers++;
            if (option == 'c' || option == 'C') {
                rightAnswer++;
                System.out.println("Your answer is Right\n");
            } else {
                System.out.println("Wrong Answer. Correct Answer is 3M\n");
            }

            // Question 4
            System.out.println("Q4. What is the capital of Switzerland?");
            System.out.println("(a) London (b) New York (c) Berlin (d) Bern");
            System.out.print("Your answer: ");
            option = scanner.next().charAt(0);
            //questionNumbers++;
            if (option == 'd' || option == 'D') {
                rightAnswer++;
                System.out.println("Your answer is Right\n");
            } else {
                System.out.println("Wrong Answer. Correct Answer is Bern\n");
            }

            // Question 5
            System.out.println("Q5. Who is the father of the computer?");
            System.out.println("(a) Charles Babbage (b) Akib Tomlinson (c) Konrad Zuse (d) John Presper Eckert");
            System.out.print("Your answer: ");
            option = scanner.next().charAt(0);
            //questionNumbers++;
            if (option == 'a' || option == 'A') {
                rightAnswer++;
                System.out.println("Your answer is Right\n");
            } else {
                System.out.println("Wrong Answer. Correct Answer is Charles Babbage\n");
            }
        } else {
            System.out.println("Wrong Input... Please enter S or s.");
        }

        return (int) rightAnswer;
    }
}
