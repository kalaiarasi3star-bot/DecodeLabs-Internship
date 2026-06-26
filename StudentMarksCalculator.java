import java.util.Scanner;

public class StudentMarksCalculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int subjects;
        int mark;
        int total = 0;
        double average;
        double percentage;
        String grade;

        System.out.print("Enter number of subjects: ");
        subjects = input.nextInt();

        for (int i = 1; i <= subjects; i++) {
            System.out.print("Enter marks for Subject " + i + " (0-100): ");
            mark = input.nextInt();
            total = total + mark;
        }

        average = (double) total / subjects;
        percentage = (double) total * 100 / (subjects * 100);

        if (percentage >= 90) {
            grade = "A+";
        } else if (percentage >= 80) {
            grade = "A";
        } else if (percentage >= 70) {
            grade = "B";
        } else if (percentage >= 60) {
            grade = "C";
        } else if (percentage >= 50) {
            grade = "D";
        } else {
            grade = "F";
        }

        System.out.println("\n----- STUDENT RESULT -----");
        System.out.println("Total Marks : " + total + " / " + (subjects * 100));
        System.out.printf("Average     : %.2f%n", average);
        System.out.printf("Percentage  : %.2f%%%n", percentage);
        System.out.println("Grade       : " + grade);

        input.close();
    }
}