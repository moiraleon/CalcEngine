package com.pluralsight.calcengine;

public class Main {

    public static void main(String[] args) {
	double value1 = 100.0d;
	double value2 = 0.0d;
	double result = 0.0d;
	char opCode = 'd';

	//adding a switch statement
	switch (opCode){
		case 'a':
			result = value1 + value2;
			break;
		case 's':
			result = value1 - value2;
			break;
		case 'm':
			result = value1 * value2;
			break;
		case 'd':
//			if(value2 !=0)
//			result = value1 / value2;
//			break; or for applying conditional assignment
			result =value2 !=0 ? value1/value2: 0.0d;
			break;
		default:
			System.out.println("Invalid opCode"+opCode);
			result = 0.0d;
			break;
	}


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
	System.out.println(result);
    }
}
