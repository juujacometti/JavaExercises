import java.util.Scanner;

public class Exercise01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

// Objective: Calculate the sum of two numbers:
        int number1, number2, sum;

        System.out.println("Enter a number:");
        number1 = scanner.nextInt();
        System.out.println("Enter a second number:");
        number2 = scanner.nextInt();

        sum = number1 + number2;

        System.out.println("The result of the sum is = " + sum);
    }
}