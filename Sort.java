import java.io.*;
import java.util.Arrays;

class Sort {
    public static void main(String[] args) throws IOException {
        int[] numbers = new int[5];

        for (int i = 0; i < 5; i++) {
            numbers[i] = Integer.parseInt(args[i]);
        }

        Arrays.sort(numbers);
        System.out.println("Sorted numbers: ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}