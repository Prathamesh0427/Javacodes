import java.util.Scanner;

public class MenuArm {
    public static void main(String[] args) {
        int op = 0;
        Scanner b = new Scanner(System.in);
        do {
            System.out.println("1.Volumn\n2.Arm Strong Number\n3.Factorial");
            op = b.nextInt();
            switch (op) {
                case 1:
                    int r = 2, h = 4;
                    double pi = 3.14;
                    double volumn = pi * (r * 2) * h;
                    System.out.println("Volumn" + volumn);
                    break;

                case 2:
                    int number = 153; // You can change this number to test other values
                    int originalNumber = number;
                    int result = 0;
                    int n = 0;

                    // Find the number of digits in the given number
                    while (originalNumber != 0) {
                        originalNumber /= 10;
                        ++n;
                    }

                    originalNumber = number;

                    // Calculate the sum of the nth power of its digits
                    while (originalNumber != 0) {
                        int remainder = originalNumber % 10;
                        result += Math.pow(remainder, n);
                        originalNumber /= 10;
                    }

                    // Check if the result is equal to the original number
                    if (result == number) {
                        System.out.println(number + " is an Armstrong number.");
                    } else {
                        System.out.println(number + " is not an Armstrong number.");
                    }
                    break;

                case 3:
                    System.out.print("Enter Number: ");
                    int num = b.nextInt();
                    int factorial = 1;
                    for (int i = 1; i <= num; i++) {
                        factorial *= i;
                    }
                    System.out.println("Factorial: " + factorial);
                    break;

                case 4:
                    // exit();
            }
        } while (op != 4);
    }
}
