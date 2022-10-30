package homework_week9;
/*
Re write the student mark sheet programme using if else and while loop
 */

import java.util.Scanner;

public class Program2MarkSheet {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        char choice = 'Y';
        while (choice == 'Y') {//loop for printing more marksheet

            System.out.println("\n Enter Student Name     :\t");
            String name = scanner.next();
            System.out.println("Enter Strudent roll number :\t");
            int rollNum = scanner.nextInt();
            System.out.println("Enter Marks of Subject Maths :\t");
            int mathsMarks = scanner.nextInt();

            if (mathsMarks < 0 || mathsMarks > 100) {
                System.out.println("\n Invalid input mark should between 0 to 100 ");
                System.out.println("Please enter correct marks ");
                mathsMarks = scanner.nextInt();
            }

            System.out.println("enter marks of Subject Science\t:\t");
            int scienceMarks = scanner.nextInt();

            if (scienceMarks < 0 || scienceMarks > 100) {
                System.out.print("\nInvalid input, Marks should between 0 to 100");
                System.out.print("\nPlease enter correct marks:  ");
                scienceMarks = scanner.nextInt();
            }
            System.out.print("Enter Marks of Subject English   : ");
            int englishMarks = scanner.nextInt();
            if (englishMarks < 0 || englishMarks > 100) {
                System.out.print("\nInvalid input, Marks should between 0 to 100");
                System.out.print("\nPlease enter correct marks   :  ");
                englishMarks = scanner.nextInt();
            }
            int total = sum(mathsMarks, scienceMarks, englishMarks);
            int percentage = (total * 100) / 300;
            String result = calculateResult(mathsMarks, scienceMarks, englishMarks);
            String grade = calculateGrade(percentage, result);
            printTheMarkSheet(name, rollNum, mathsMarks, scienceMarks, englishMarks, total, percentage, result, grade);

            System.out.println("Would you like to print more marksheet? please enter Y or N :");
            choice = scanner.next().charAt(0);
            choice = Character.toUpperCase(choice);
        }
        //Closing the scanner object
        scanner.close();
    }

    //calculating the sum
    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    // Calculating the results on subjects marks
    public static String calculateResult(int mathsMarks, int scienceMarks, int englishMarks) {
        if (mathsMarks < 35 || scienceMarks < 35 || englishMarks < 35) {
            return "Fail";
        } else {
            return "Pass";
        }
    }

    // Calculating the grade on percentage and result
    public static String calculateGrade(int percentage, String result) {
        String grade = null;
        if (result.equalsIgnoreCase("pass")) {
            if (percentage >= 80) {
                grade = "A+";
            } else if (percentage >= 60) {
                grade = "A";
            } else if (percentage >= 50) {
                grade = "B";
            } else if (percentage >= 35) {
                grade = "C";
            }
        } else {
            grade = "-";
        }
        return grade;
    }

    // Printing the Marks sheet
    public static void printTheMarkSheet(String name, int rollNum, int mathsMarks, int scienceMarks,
                                         int englishMarks, double total, double percentage, String result,
                                         String grade) {
        System.out.println("-----------------------------");
        System.out.println("|                           |");
        System.out.println("| Mark Sheet                |");
        System.out.println("|___________________________|");
        System.out.println("| Name:" + name + "                  |");
        System.out.println("| Roll No:" + rollNum + "                |");
        System.out.println("|___________________________|");
        System.out.println("| Subjects: Marks           |");
        System.out.println("|___________________________|");
        System.out.println("| Math:" + mathsMarks + "                   |");
        System.out.println("| Science:" + scienceMarks + "                |");
        System.out.println("| English:" + englishMarks + "                |");
        System.out.println("|___________________________|");
        System.out.println("| Total:" + total + "             |");
        System.out.println("|___________________________|");
        System.out.println("| Percentage:" + percentage + "           |");
        System.out.println("| Result:" + result + "               |");
        System.out.println("| Grade:" + grade + "                  |");
        System.out.println("|___________________________|");
    }
}




