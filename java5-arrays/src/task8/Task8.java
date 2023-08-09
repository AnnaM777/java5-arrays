package task8;

import java.util.Scanner;

//Write a program that will load the elements of an array and print the elements of an array with an odd index.
public class Task8 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n;

        System.out.print("Enter the number of array elements: ");
        n = input.nextInt();

        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter " + (i + 1) + ". element: ");
            array[i] = input.nextInt();
        }

        System.out.println("Elements with an odd index are:");

        for (int i = 1; i < n; i += 2) {
            System.out.println(array[i]);
        }

    }
}
