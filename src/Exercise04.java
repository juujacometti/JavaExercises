import java.util.Scanner;

public class Exercise04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

// Objective: Calculate the absolute value:
        int number;

        System.out.println("Enter a number to calculate the absolute value:");
        number = scanner.nextInt();

        number = (Math.abs(number));

        System.out.println("The absolute value of the number is: " + number);
    }
}
