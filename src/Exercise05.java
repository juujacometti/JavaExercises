import java.util.Scanner;

public class Exercise05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

// Objective: Check if the values are even:

        int value1, value2;

        System.out.println("Enter the first number:");
        value1 = scanner.nextInt();

        System.out.println("Enter the second number:");
        value2 = scanner.nextInt();

        if (value1 % 2 == 0){
            System.out.println("The number " + value1 + " is even.");
        }

        else{
            System.out.println("The number " + value1 + "is not even" );
        }

        if (value2 % 2 == 0){
            System.out.println("The number " + value2 + " is even.");
        }

        else{
            System.out.println("The number " + value2 + " is not even" );
        }
    }
}
