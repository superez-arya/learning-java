import java.util.Scanner;

public class multiplicationtest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Multiplication Table ! ");
        System.out.print("Please, Enter the Number: ");
        int num = input.nextInt();
        input.close();
        multiTable(num);
    }

    public static void multiTable(int num){
        int i = 1;
        while (i<10) {
            System.out.println(num + " X " + i + " = " + (num * i));
            i++;
        }
    }

}

