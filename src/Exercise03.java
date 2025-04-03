import java.util.Scanner;

public class Exercise03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

// Objective: Check if at least one of these conditions is true: value1 is greater than 3, or value2 is greater than 4:
        float value1, value2;

        System.out.println("Check if at least one of these conditions is true:\n- The first number is greater than 3\n- Or second number is greater than 4");

        System.out.println("Enter a first number:");
        value1 = scanner.nextFloat();

        System.out.println("Enter a second number:");
        value2 = scanner.nextFloat();

        if (value1 > 3 && value2 > 4){
            System.out.println("Both conditions are true.");
        }

        else if (value1 > 3 || value2 > 4) {
            System.out.println("One of the conditions is true.");
        }

        else{
            System.out.println("Both conditions are false.");
        }

    }
}
