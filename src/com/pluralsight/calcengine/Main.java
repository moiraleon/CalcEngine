package com.pluralsight.calcengine;

public class Main {

	public static void main(String[]args){
//adding an array of data
	double[] leftVals = {100.0d, 25.0d, 225.0d, 11.0d};
	double[] rightVals ={50.0d,92.0d,17.0d,3.0d};
	char[] opCodes ={'d','a','s','m'};
	double[] results = new double[opCodes.length];
//creating array for loop
	for (int i =0; i<opCodes.length; i++){
		results[i] = execute(opCodes[i], leftVals[i],rightVals[i]);
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

		for(double currentResult: results)
	System.out.println(currentResult);
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
				System.out.println("Invalid opCode" + opCode;
				result = 0.0d;
				break;
		}
		return result;
	}
}



