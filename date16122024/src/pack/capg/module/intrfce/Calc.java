package pack.capg.module.intrfce;

public class Calc {
	
	// using interface without using implements//
	
	// method to perform operation using a Mathoperation functional interface
	public static double performOperation(double a, double b, MathOperation operation) {
		return operation.apply(a, b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x=10, y=5;
		MathOperation addition = (a,b)->MathOperation.add(a, b);
		MathOperation subtract = (a,b)->MathOperation.sub(a, b);
		MathOperation multplcn = (a,b)->MathOperation.multiply(a, b);
		MathOperation division = (a,b)->MathOperation.div(a, b);
	
		System.out.println("Addition: "+performOperation(x,y,addition));
		System.out.println("Subtraction: "+performOperation(x,y,subtract));
		System.out.println("Multiplication: "+performOperation(x,y,multplcn));
		System.out.println("Division: "+performOperation(x,y,division));
		
		double result = performOperation(x, 0, division);
		if(Double.isNaN(result)) {
			System.out.println("Division be zero returned an error");
		}
		MathOperation safeDivide = (a,b)->a/b;
		System.out.println("Safe division: "+ safeDivide.safeDivide(y, 0));
	
	}

}
