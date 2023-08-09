package task2;
//Create an array of arbitrary length integer values and multiply the last term by the purchase number of terms.
// (Use length, not a fixed value)
public class Task2 {
    public static void main(String[] args) {

        int[]arr = {4, 7, 9, 2, 8};
        int sum = 0;
        int x = arr[arr.length-1];

        for (int i =0; i<arr.length; i++){
            sum = x * arr.length;
        }
        System.out.println("The sum is: " + sum);


    }
}
