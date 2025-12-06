import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        System.out.println("Hii, Welcome to Factorial Calulator ");
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter Your Number: ");
        int num = input.nextInt();
        input.close();
        long fact = FactoraialNum(num);
        System.out.println("Your Facotial number's Value is: "+fact);
    }

    public static long FactoraialNum(int num){
        if(num<2){
            return 1;
        }
        long fact = 1;
        int i = 2;
        while (i<=num) {
            fact *= i;
            i++;
        }
        return fact;
    }
    
}
