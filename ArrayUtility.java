import java.util.Scanner;

public class ArrayUtility {
    public static int[] inputArray(Scanner input){
          System.out.print("Please,Enter the number of elements: ");
        int size = input.nextInt();
        int[] nums = new int[size];
        int i = 0;
        while (i<size) {
            System.out.print("Please,Enter element number "+(i+1)+" : ");
            nums[i] = input.nextInt();
            i++;
        }
        return nums; 
    }
}
