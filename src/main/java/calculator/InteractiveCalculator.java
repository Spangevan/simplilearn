package calculator;

import java.util.Scanner;

import calculator.operations.AddOperation;

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
		
		int result = 0;
		if (operation.contentEquals("add")) {
			AddOperation add = new AddOperation();
			add.setA(numberA);
			add.setB(numberB);
			result = add.getResult();
			
		} else if (operation.contentEquals("subtract")) {
			
		} else if (operation.contentEquals("multiply") ) {
			
		} else if (operation.equals("divide")) {
			
		} else {
			System.out.println();
		}
		
		
		
		
		
		
		
	}

}
