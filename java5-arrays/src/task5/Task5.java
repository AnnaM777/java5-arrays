package task5;

import java.util.Arrays;
import java.util.Scanner;

//Ask the user how many subjects he has taken at university so far.
//     Based on the number of subjects, create an array and ask him to enter the grades he won.
//     When all grades are entered, display the average grade on the console.
public class Task5 {
    public static void main(String[] args) {
        Scanner inport = new Scanner(System.in);
        System.out.println("Enter the nuber of exams> ");
        int countSubjects = inport.nextInt();

        if (countSubjects > 0) {
            int[] grades = new int[countSubjects];
            for (int i = 0; i < grades.length; ) {
                System.out.println("Enter " + (i + 1) + " grade");
                int grade = inport.nextInt();
                if (grade >= 6 && grade <= 10) {
                    grades[i] = grade;
                    i++;
                } else {
                    System.out.println(" No grade has been entered in the range of 6 - 10");
                }
            }
            System.out.println(Arrays.toString(grades));

            int suma = 0;
            for (int i = 0; i < grades.length; i++) {
                suma += grades[i];
            }
            double avg = (double) suma / grades.length;
            System.out.println("The average is: " + avg);
        } else {
            System.out.println("The number of subjects is not less than 1.");
        }
        inport.close();
    }
}
