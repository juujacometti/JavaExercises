import java.util.Scanner;

public class Exercise02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

// Objective: Check if the number is odd or even:
        int number;

        System.out.println("Enter a number for check if it is odd or even:");
        number = scanner.nextInt();

        if (number % 2 == 0){
            System.out.println("The number " + number + " is an even number.");
        }
        else {
            System.out.println("The number " + number + " is a odd number.");
        }
    }
}
