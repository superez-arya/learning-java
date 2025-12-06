import java.util.Scanner;

public class OddSum {
    public static void main(String[] args) {
        System.out.println("Hii,Welcome to Odd Sum Calulator! ");
         Scanner input = new Scanner(System.in);
        System.out.print("please Enter Your First Numbers: ");
        int num1 = input.nextInt();
        System.out.print("Plese Enter Your Last Number: ");
        int num2 = input.nextInt();

        input.close();

        int result = oddSum(num1, num2);
        System.err.println("The Sum to Odd Numbers between "+num1+" to "+num2+ " is "+ result);
    }

    public static int oddSum(int num1, int num2){

        int sum = 0;
        for(int i = num1 ; i<= num2; i++){
            if(i%2 != 0){
                sum += i;
            }
        }

        return sum;

    }
}
