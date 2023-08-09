package task7;
//Write a program that rotates text and prints it in reverse order.
//Example: Java - avaJ.
public class Task7 {
    public static void main(String[] args) {

        String text = "Java";
        char[] array = text.toCharArray();


        int array2 = text.length()-1;


        for (int i = array.length-1;i>=0; i--){
            System.out.println(array[i]);
        }

    }
}
