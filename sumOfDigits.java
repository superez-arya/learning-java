import java.util.Scanner;

public class sumOfDigits {
    public static void main(String[] args) {
        System.out.println("Welcome to Some of Digit Calculator ! ");
        Scanner input = new Scanner(System.in);
        System.out.print("Plese Enter Your Number: ");
        int num = input.nextInt();
        input.close();
        int result = sumofDigit(num);
        System.out.println("The Sum of the Digits is: "+result);
    }

    public static int sumofDigit(int num){
        int sum = 0;
        while (num>0) {
            sum = sum + (num%10); // sum += num%10;
            num /= 10;

        }
        return sum;
    }
    
}
