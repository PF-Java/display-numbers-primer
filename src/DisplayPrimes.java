import java.util.Scanner;

public class DisplayPrimes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the numbers primes: ");
        int numbers = scanner.nextInt();

        System.out.println("Display "+numbers + " primes: ");
        int count = 0;
        int number = 2;
        while (count < numbers) {
            boolean isprime = true;
            for (int i = 1; i <= Math.sqrt(number); i++) {
                if (number % i == 0 && i != 1) {
                    isprime = false;
                }
            }
            if (isprime) {
                System.out.print(number + "\t");
                count++;
            }
            number++;
        }
    }
}
