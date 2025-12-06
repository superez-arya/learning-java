import java.util.Scanner;

public class ArraySumAverage {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to Array's some and average");
        int[] numArray = ArrayUtility.inputArray(input);
        
        long sum = sum(numArray);
        int avg = average(numArray);

        System.out.println("The sum of the number is: "+ sum);
        System.out.println("The average of the number is: "+avg);
      
    }
    public static long sum(int[] numArray){
        long sum = 0;
        int i = 0;
        while (i<numArray.length) {
            sum += numArray[i];
            i++;
        }
        return sum;
    }

    public static int average(int[] numArray){
        long sum = sum(numArray);
        return(int) sum/numArray.length;
    }
}