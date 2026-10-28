import java.util.ArrayList;
import java.util.Scanner;

public class grade {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        ArrayList<Integer> grades = new ArrayList<>();

        int grade = 0;

        System.out.println("=== Student Grade Organizer ===");
        System.out.println("Enter student grades (0-100).");
        System.out.println("Enter -1 to finish.");

        while (grade != -1) {
            System.out.print("Enter a grade: ");
            grade = input.nextInt();

            if (grade >= 0 && grade <= 100) {
                grades.add(grade);
                System.out.println("Grade added!");
            } else if (grade != -1) {
                System.out.println("Invalid grade. Try again.");
            }
        }

        System.out.println("\n=== All Grades ===");

        int i = 0;
        int total = 0;

        while (i < grades.size()) {
            System.out.println("Grade " + (i + 1) + ": "
                    + grades.get(i));

            total += grades.get(i);
            i++;
        }

        if (grades.size() > 0) {
            double average = (double) total / grades.size();
            System.out.println("Average grade: " + average);
        } else {
            System.out.println("No grades were entered.");
        }

        input.close();



    }

}
