import java.util.Scanner;

class GCD {
    public static void main(String[] args) {
        System.out.println("Welcome to Greatest Common Divisor Calculator ! ");
          Scanner input = new Scanner(System.in);
        System.out.print("Plese Enter Your Number: ");
        int num1 = input.nextInt();
         System.out.print("Plese Enter Your Number: ");
        int num2 = input.nextInt();
        input.close();
        int result = gcd(num1,num2);
        System.out.println("The GCD of the Two numbers is: "+result);
    }

    public static int gcd(int num1, int num2){
        int gcd = 1;
        int i = 2;
        int least = least(num1, num2);
        while (i<=least) {
            if(num1 % i == 0 && num2 % i == 0){
                gcd = i;
            }
            i++;
        }
        return gcd;
    }

    public static int least(int num1, int num2){
        if(num1<num2){
            return num1;
        } else{
            return num2;
        }
    }
}
