import java.util.Scanner;

public class CGCalculate {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double totalCredits = 0;
        double totalPoints = 0;
        System.out.println("Enter Student ID: ");
        int studentID = input.nextInt();
        System.out.println("Total Number of courses: ");
        int course_num = input.nextInt();



        for(int i = 1; i <= course_num; i++){
            System.out.println("Course " + i + ":");

            System.out.print("  Credit (Max 3): ");
            int credits = input.nextInt();

            System.out.print("  CT (Max 30): ");
            int classTest = input.nextInt();

            System.out.print("  AT (Max 10): ");
            int attendance = input.nextInt();

            System.out.print("  FE (Max 60): ");
            int exam = input.nextInt();

            int total_score = classTest + attendance + exam;
            
            double gradePoint;
            if (total_score >= 80) {
                gradePoint = 4.0;
            }
            else if (total_score >= 75 || total_score <= 79) {
                gradePoint = 3.75;
            } 
            else if (total_score >= 70 || total_score <= 74) {
                gradePoint = 3.5;
            } 
            else if (total_score >= 65 || total_score <= 69) {
                gradePoint = 3.25;
            } 
            else if (total_score >= 60 || total_score <= 64) {
                gradePoint = 3.00;
            } 
            else if (total_score >= 55 || total_score <= 59) {
                gradePoint = 2.75;
            } 
            else if (total_score >= 50 || total_score <= 54) {
                gradePoint = 2.5;
            } 
            else if (total_score >= 45 || total_score <= 49) {
                gradePoint = 2.25;
            } 
            else if (total_score >= 40 || total_score <= 44) {
                gradePoint = 2.00;
            } 
            else {
                gradePoint = 0.0;
            
            }

            totalCredits = totalCredits+ credits;
            totalPoints = totalPoints+gradePoint * credits;
        }

        double cg = totalPoints / totalCredits;

        String grade;

        if (cg >= 4) {
            grade = "A+";
        } 
        else if (cg >= 3.75) {
            grade = "A";
        } 
        else if (cg >= 3.5) {
            grade = "A-";
        }

        else if (cg >= 3.25) {
            grade = "B+";
        }
        
        else if (cg >= 3.00) {
            grade = "B";
        }

         else if (cg >= 2.75) {
            grade = "B-";
        }

        else if (cg >= 2.5) {
            grade = "C+";
        }

        else if (cg >= 2.25) {
            grade = "C";
        }

        else if (cg >= 2.00) {
            grade = "C-";
        }

        else {
            grade = "F";
        }
        
        System.out.println();
        System.out.println("Student ID: " + studentID);
        System.out.println("Credit Taken: " + totalCredits);
        System.out.println("Credit Earned: " + totalPoints);
        System.out.printf("CGPA: %.2f\n", cg);
        System.out.println("Grade: " + grade);

        input.close();


    }
}
