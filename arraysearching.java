import java.util.Scanner;

public class arraysearching {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = {2,5,9,3,55,98,34,64,36,36,78,94,86,92,99,88,78};
        System.out.println("Welcome to Arrya \n");
        System.out.print("Please , Enter the number you want to search: ");
        int num = input.nextInt();
        input.close();
        boolean isfound = isfound(arr, num);
        if(isfound){
            System.out.println("Your number was found in the Array");
        }else{
            System.out.println("Your numbe was not found in the Array");
        }
    }

    public static boolean isfound(int[] arr, int num){
        int index = 0;
        while (index<arr.length) {
            if (arr[index] == num) {
                return true;
            }
            index++;
        }
        return false;
    }
}
