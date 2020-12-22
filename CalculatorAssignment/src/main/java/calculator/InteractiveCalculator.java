package calculator;

import java.util.Scanner;

import calculator.operations.AddOperation;
import calculator.operations.DivideOperation;
import calculator.operations.MultiplyOperation;
import calculator.operations.SubtractOperation;

public class InteractiveCalculator {
	
	public static final void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Give me number A please:");
		
		int numberA = scanner.nextInt();
		scanner.nextLine();
		
		System.out.println("Give me number B please:");
		int numberB = scanner.nextInt();
		
		System.out.println("Give me an operation please");
		scanner.nextLine();
		String operation = scanner.nextLine();
		
		double result = 0;
		if (operation.contentEquals("add")) {
			AddOperation add = new AddOperation();
			add.setA(numberA);
			add.setB(numberB);
			result = add.getResult();
			
			System.out.println((int)result);
			
		} else if (operation.contentEquals("subtract")) {
			
			SubtractOperation subtract = new SubtractOperation();
			subtract.setA(numberA);
			subtract.setB(numberB);
			result = subtract.getResult();
			
			System.out.println((int)result);
			
		} else if (operation.contentEquals("multiply") ) {
			
			MultiplyOperation multiply = new MultiplyOperation();
			multiply.setA(numberA);
			multiply.setB(numberB);
			result = multiply.getResult();
			
			System.out.println((int)result);
			
		} else if (operation.equals("divide")) {
			
			DivideOperation divide = new DivideOperation();
			divide.setA(numberA);
			divide.setB(numberB);
			result = divide.getResult();
			
			System.out.println(result);
			
		} else {
			System.out.println("I am sorry, that input is not valid");
		}
		
		
		
		
		
		
		
	}

}
