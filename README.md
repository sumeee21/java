AIM:
To handle divide by zero exception in Java using try-catch.

ALGORITHM:

1. Input numerator and denominator.
2. Try to divide numerator by denominator.
3. Catch ArithmeticException if denominator is zero and display error.
4. Display result if no exception.
5. End.

PROGRAM:

import java.util.Scanner;

public class DivideByZeroExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter numerator: ");
        int numerator = sc.nextInt();

        System.out.print("Enter denominator: ");
        int denominator = sc.nextInt();

        try {
            int result = numerator / denominator; // This may cause ArithmeticException
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero!");
        }

        System.out.println("Program continues after exception handling.");
        sc.close();
    }
}

OUTPUT:
Enter numerator: 10
Enter denominator: 0
Error: Cannot divide by zero!
Program continues after exception handling.


EXCEPTION HANDLING:
To prevent the program from crashing, Java provides a mechanism called exception handling using:

try → the block where we write code that may cause an exception.

catch → the block where we handle the exception (error message, alternative action, etc.).

HOW IT WORKS:

The division operation is placed inside the try block.

If denominator ≠ 0 → program executes normally.

If denominator = 0 → Java throws an ArithmeticException.

Control immediately shifts to the catch block.

The catch block prints a user-friendly message instead of letting the program crash.

After handling the exception, the program continues execution.
