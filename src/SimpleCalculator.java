import java.util.Scanner; // importing the scanner to read user input from scanner

public class SimpleCalculator {
    public static void main(String[]args){
        //Creating a scanner object to capture the user's input
        Scanner scanner = new Scanner(System.in);

        //Declaring 2 variables (doubles) for the 2 numbers and the result
        double num1,num2,result;
        // declaring a variable for the operators (+ - * /)
        char operator;

        //Display a welcome message and a list of operators and what they do
        System.out.println("=================Welcome to my simple Calculator===================");
        System.out.println(" Operator for adding: + \n Operator for subtracting: - \n Operator for multiplication: * \n Operator for division: /" );
        System.out.println("=================Let's begin===================");

        System.out.println("Please enter the first number as a double ( e.g - 5.00)"); //prompt user to enter the first number
        //validating that the user entered a valid double
        while (!scanner.hasNextDouble()){
            //if the input is not valid/ not a double, it will show an error message and clear the input
            System.out.println("Invalid number. Please try entering a different number - e.g 5.00");
            scanner.next(); //Discad the input
        }
        //Storing the first number
        num1=scanner.nextDouble();

        //Prompting user for the operator

        System.out.println("Please enter the second number as a double ( e.g - 8.69)"); //prompt user to enter the first number
        //validating that the user entered a valid double
        while (!scanner.hasNextDouble()){
            //if the input is not valid/ not a double, it will show an error message and clear the input
            System.out.println("Invalid number. Please try entering a different number - e.g 5.00");
            scanner.next(); //Discad the input
        }
        //Storing the second number
        num2=scanner.nextDouble();

        //switch statements to perform the calculation based on the operator
        switch (operator){
            case '+':
                //performing addition and storing result
                result=num1+num2;
                //Displaying the results formatted to 2 decimal places
                System.out.printf("%.2f + %.2f = %.2f%n",num1,num2,result);
                break;
            case '-':
                //performing subtraction and storing result
                result=num1-num2;
                //Displaying the results formatted to 2 decimal places
                System.out.printf("%.2f - %.2f = %.2f%n",num1,num2,result);
                break;
            case '*':
                //performing multiplication and storing result
                result=num1*num2;
                //Displaying the results formatted to 2 decimal places
                System.out.printf("%.2f * %.2f = %.2f%n",num1,num2,result);
                break;
            case '/':
                //performing division and storing result
                result=num1/num2;
                //Displaying the results formatted to 2 decimal places
                System.out.printf("%.2f / %.2f = %.2f%n",num1,num2,result);
                break;
            default:
                //Handle invalid operator input
                System.out.println("Error: Please enter a valid operator [+,-,* or /]");

        }

    scanner.close(); //close the scanner
    }
}
