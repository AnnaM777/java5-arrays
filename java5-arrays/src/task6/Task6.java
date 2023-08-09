package task6;
//Write a program that determines the sum of array elements that are strictly greater than their own index.
public class Task6 {
    public static void main(String[] args) {

        int[] array = {5, 15, 1, 20, 6, 2, 1};
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > i) {
                sum += array[i];
            }
        }
        System.out.println("The sum is " + sum);

    }
}
