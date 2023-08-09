package task3;
//Create two arrays and show which of them  has more members.
public class Task3 {
    public static void main(String[] args) {
        int[]arr1 = {1,2,3,4,5,6};
        int[]arr2 = {1,2,3,4,5,6,7,8,9,};

        int i = 0;

        if (arr1[i] >  arr2 [i]) {
            System.out.println("The first array has more memebers.");
        } else
            System.out.println("The second array has more memebers.");
    }
}
