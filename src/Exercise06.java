import java.util.Scanner;

public class Exercise06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

// Objective: Check if etiher of the numbers is negative:

        int number1, number2;

        System.out.println("Enter the first number:");
        number1 = scanner.nextInt();

        System.out.println("Enter the second number:");
        number2 = scanner.nextInt();

        if (number1 < 0){
            System.out.println("The number " + number1 + " is negative.");
        }

        else{
            System.out.println("The number " + number1 + " is not negative.");
        }

        if (number2 < 0){
            System.out.println("The number " + number2 + " is negative.");
        }

        else{
            System.out.println("The number " + number2 + " is not negative.");
        }
    }
}
