import java.util.Scanner;

class NegativeNumberException extends Exception {
    public NegativeNumberException(String message) {
        super(message);
    }
}

public class Main {

    private static final int ARRAY_SIZE = 10;
    private static int[] numbers = new int[ARRAY_SIZE];

    public static int readNumber() throws NegativeNumberException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        if (number < 0) {
            throw new NegativeNumberException("Negative numbers are not allowed");
        }
        return number;
    }

    public static void fillArray() {
        for (int i = 0; i < ARRAY_SIZE; i++) {
            try {
                numbers[i] = readNumber();
            } catch (NegativeNumberException e) {
                System.out.println(e.getMessage());
                numbers[i] = 0;
            }
        }
    }

    public static void main(String[] args) {
        fillArray();

        System.out.println("Array contents:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}
