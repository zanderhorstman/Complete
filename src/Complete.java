import java.util.Scanner;

public class Complete {
    public static void main(String[] args) {
        int num;
        Scanner input = new Scanner(System.in);

//The code below determines if the pre-set number is a positive or negative number.
//Edit the application to prompt an integer user input, and state if the number
//entered is greater than 10, less than 10, or is equal to 10.
//Use if, else if, else statements.

        System.out.print("Please enter a number: ");
        num = input.nextInt();

        if (num > 10) {
            System.out.println("Number is greater than 10.");
        } else if (num <10){
            System.out.println("Number is less than 10.");
        } else {
            System.out.println("Number is equal to 10.");
        }
        System.out.println("Application finished.");
    }
}
