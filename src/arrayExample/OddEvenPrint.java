package arrayExample;

public class OddEvenPrint {

	public static void main(String[] args) {
        System.out.println("Odd numbers from 1 to 100:");
        printOdd(1, 100);

        System.out.println("\nEven numbers from 1 to 100:");
        printEven(1, 100);
    }

    public static void printOdd(int start, int end) {
        for (int i = start; i <= end; i++) {
            if (i % 2 != 0) {  // odd number
                System.out.print(i + " ");
            }
        }
        System.out.println(); // cursor to move to a new line
    }

    public static void printEven(int start, int end) {
        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) { // even number
                System.out.print(i + " ");
            }
        }
        System.out.println(); // cursor to move to a new line
    }
}
