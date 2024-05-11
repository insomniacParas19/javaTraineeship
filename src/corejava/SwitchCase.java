package corejava;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
	System.out.println("Enter preferred operator(+, -, *, /,): ");
	char op = sc.next().charAt(0);
	System.out.println("Enter first number");
	int num1=sc.nextInt();
	
	System.out.println("Enter second number");
	int num2=sc.nextInt();
	
	int result;
	
	switch(op) {
	case '+':
		result=num1+num2;
		System.out.println("Sum of two number is:"+result);
		break;
		
	case '-':
		result=num1+num2;
		System.out.println("Difference of two number is:"+result);
		break;
		
	case '*':
		result=num1*num2;
		System.out.println("Product of two number is:"+result);
		break;
		
	case '/':
		if(num2!=0) {
		result=num1/num2;
		System.out.println("Division of two number is:"+result);
		}
		else {
		System.out.println("Error !Division by zero is not allowed");	
		}
		break;
		
	default:
		System.out.println("Invalid operator input ! ");	
	}
	sc.close();
	
	}
}
