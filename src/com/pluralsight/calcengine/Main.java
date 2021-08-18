package com.pluralsight.calcengine;

import java.util.Scanner;

public class Main {

	public static void main(String[]args) {
//adding an array of data
		double[] leftVals = {100.0d, 25.0d, 225.0d, 11.0d};
		double[] rightVals = {50.0d, 92.0d, 17.0d, 3.0d};
		char[] opCodes = {'d', 'a', 's', 'm'};
		double[] results = new double[opCodes.length];
		//adding args
		if (args.length == 0) {


//creating array for loop
			for (int i = 0; i < opCodes.length; i++) {
				results[i] = execute(opCodes[i], leftVals[i], rightVals[i]);
//		switch (opCodes[i]) {
//			case 'a':
//				results[i] = leftVals[i] + rightVals[i];
//				break;
//			case 's':
//				results[i] = leftVals[i] - rightVals[i];
//				break;
//			case 'm':
//				results[i] = leftVals[i] * rightVals[i];
//				break;
//			case 'd':
////			if(value2 !=0)
////			result = value1 / value2;
////			break; or for applying conditional assignment
//				results[i] = rightVals[i]!= 0 ? leftVals[i] / rightVals[i] : 0.0d;
//				break;
//			default:
//				System.out.println("Invalid opCode" + opCodes[i]);
//				results[i] = 0.0d;
//				break;
//		}

			}
//    public static void main(String[] args) {
//	double value1 = 100.0d;
//	double value2 = 0.0d;
//	double result = 0.0d;
//	char opCode = 'd';

			//adding a switch statement
//	switch (opCode){
//		case 'a':
//			result = value1 + value2;
//			break;
//		case 's':
//			result = value1 - value2;
//			break;
//		case 'm':
//			result = value1 * value2;
//			break;
//		case 'd':
////			if(value2 !=0)
////			result = value1 / value2;
////			break; or for applying conditional assignment
//			result =value2 !=0 ? value1/value2: 0.0d;
//			break;
//		default:
//			System.out.println("Invalid opCode"+opCode);
//			result = 0.0d;
//			break;
//	}


//	if(opCode =='a')
//	    result = value1 + value2;
//	else if(opCode =='s')
//	    result = value1 - value2;
//	else if(opCode =='m')
//	    result = value1 * value2;
//	else if(opCode =='d') {
//		if(value2 !=0)
//		result = value1 / value2;
//	}
//	else {
//		System.out.println("Invalid opCode"+opCode);
//		result = 0.0d;
//	}
			//adding a for each loop

			for (double currentResult : results)
				System.out.println(currentResult);
		} else if(args.length ==1 && args[0].equals("interactive"))
			executeInteractively();
		else if (args.length ==3)
			handleCommandLine(args);
		else
			System.out.println("Please provide an operation code and 2 numeric values");
	}
		static void executeInteractively(){

		System.out.println("Enter an operation and two numbers");
			Scanner scanner = new Scanner(System.in);
			String userInput = scanner.nextLine();
			String[] parts = userInput.split(" ");
			performOperation(parts);

		}

	private static void performOperation(String[] parts) {
		char opCode = opCodeFromString(parts[0]);
		double leftVal = valueFromWord(parts[1]);
		double rightVal = valueFromWord(parts[2]);
		double result = execute(opCode, leftVal,rightVal);
//		System.out.println(result);
		//adding string builds
		displayResult(opCode, leftVal, rightVal, result);
	}

	private static void displayResult(char opCode, double leftVal, double rightVal, double result) {
		char symbol = symbolFromOpCode(opCode);
		StringBuilder builder = new StringBuilder(20);
		builder.append(leftVal);
		builder.append(" ");
		builder.append(symbol);
		builder.append(" ");
		builder.append(rightVal);
		builder.append(" = ");
		builder.append(result);
		String output = builder.toString();
		System.out.println(output);
	}

	private static char symbolFromOpCode(char opCode){
		char[] opCodes ={'a','s','m','d'};
		char[] symbols ={'+','-','*','/'};
		char symbol = ' ';
		for(int index = 0; index < opCodes.length; index++){
			if(opCode == opCodes[index]){
				symbol = symbols[index];
				break;
			}
		}
		return symbol;
	}

	private static void handleCommandLine(String[] args) {
		char opCode = args[0].charAt(0);
		double leftVal =Double.parseDouble(args[1]);
		double rightVal = Double.parseDouble(args[2]);
		double result =execute(opCode, leftVal, rightVal);
		System.out.println(result);
	}

	//adding a method
	static double execute(char opCode, double leftVal, double rightVal){
		double result;
		switch (opCode) {
			case 'a':
				result = leftVal+ rightVal;
				break;
			case 's':
				result = leftVal- rightVal;
				break;
			case 'm':
				result = leftVal * rightVal;
				break;
			case 'd':
				result = rightVal!= 0 ? leftVal / rightVal: 0.0d;
				break;
			default:
				System.out.println("Invalid opCode" + opCode);
				result = 0.0d;
				break;
		}
		return result;
	}

	static char opCodeFromString(String operationName){
		char opCode = operationName.charAt(0);
		return opCode;
	}
	static double valueFromWord(String word){
		String [] numberWords = {
		"zero","one","two","three","four","five","six","seven","eight","nine"
		};
		double value = 0d;
		for(int index =0; index< numberWords.length; index++){
			if (word.equals(numberWords[index])){
				value = index;
				break;
			}
		}
		return value;
	}
}



