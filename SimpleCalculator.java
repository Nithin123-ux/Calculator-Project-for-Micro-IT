package Simplecalculator;
import java.util.Scanner;

public class SimpleCalculator {

	public static void main(String[] args) {
		     System.out.println("----Simple calculator----");
			 Scanner sc = new Scanner(System.in);
			 
			 System.out.print("Enter first number: ");
			 double num1 = sc.nextDouble();
			 
	     	 System.out.print("Enter second number: ");
			 double num2 = sc.nextDouble();
			 
			 System.out.print("Enter operator: ");
			 char operator = sc.next().charAt(0);
			 
			 double result;
			 
			 switch(operator) {
			 case '+':
				 result = num1 + num2;
				 System.out.println("Addition: " + result);
				 break;
				 
			 case '-':
				 result = num1 - num2;
				 System.out.println("Subtraction: " + result);
				 break;
			 case '*':
				 result = num1 * num2;
				 System.out.println("Multiplication: " + result);
				 break;
			 case '/':
				 result = num1 / num2;
				 System.out.println("Division: " + result);
				 break;
			 case '%':
				 result = num1 % num2;
				 System.out.println("Modulous: " + result);
				 break;
			default :
				System.out.println("Invalid operator");
			 }
		}
}


