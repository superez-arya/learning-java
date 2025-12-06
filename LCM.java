import java.util.Scanner;

class LCM {

    public static void main(String[] args) {
        System.out.println("Welcome to Least Common multiple Calculator ! ");
        Scanner input = new Scanner(System.in);
        System.out.print("Plese Enter Your Number: ");
        int num1 = input.nextInt();
         System.out.print("Plese Enter Your Number: ");
        int num2 = input.nextInt();
        input.close();
        int result = Lcm(num1,num2);
        System.out.println("The LCM of the Two numbers is: "+result);
    }


    public static int Lcm(int num1,int num2){
        int i =1;
        while (i<num2) {
            int factor = num1 * i;
            if (factor % num2 == 0){
                return factor;
            }
            i++;
        }
        return 0;
    }
}