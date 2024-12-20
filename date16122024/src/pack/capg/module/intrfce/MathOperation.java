package pack.capg.module.intrfce;

@FunctionalInterface
public interface MathOperation {

	double apply(double a, double b);
	
	default double safeDivide(double a, double b) {
		if(b==0) {
			System.out.println("Error: cant divide by 0");
			return Double.NaN;
		}
		return a/b;
	}
	
	static double add(double a, double b) {
		return a+b; // +
	}
	
	static double sub(double a, double b) {
		return a-b; 
	}
	
	static double multiply(double a, double b) {
		return a*b; 
	}
	
	static double div(double a, double b) {
		if(b==0) {
			System.out.println("Error: cant divide by 0");
			return Double.NaN;
		}
		return a/b;
	}
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}

}
