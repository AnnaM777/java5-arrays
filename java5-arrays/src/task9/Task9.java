package task9;

import java.util.Scanner;

//Write a program that will load the elements and find the largest element of the array.
public class Task9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of the array: ");
        int n = input.nextInt();
        int[] array = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            array[i] = input.nextInt();
        }
        int max = array[0];
        System.out.println("The largest element of the array is: ");
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println(max);
    }
}
