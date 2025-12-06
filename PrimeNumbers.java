import java.util.Scanner;

class PrimeNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the upper limit (N): ");
        int N = input.nextInt();

        System.out.println("Prime numbers between 1 and " + N + " are:");

        for (int i = 2; i <= N; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }

        input.close();
    }

    // Function to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1)
            return false;

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0)
                return false;
        }

        return true;
    }
}
