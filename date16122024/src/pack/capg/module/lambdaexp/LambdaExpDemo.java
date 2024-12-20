package pack.capg.module.lambdaexp;

@FunctionalInterface
interface SalaryCalculator{
	double CalculateSalary(double baseSalary);
}

public class LambdaExpDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double baseSalary = 50000;
		
		SalaryCalculator withBonus = (sal)-> sal+(sal*0.10);
		
		// salary with deduction of 5 percent
		SalaryCalculator withDeduction = (sal) -> sal-(sal*0.05);
		
		// salary with increment
		SalaryCalculator withIncrement = (sal)->{
			if(sal < 20000) {
				return sal+(sal*0.15);
			} else {
				return sal;
			}
		};
		
		SalaryCalculator noChange = (salary) -> salary;
		System.out.println("Base salary: "+baseSalary);
		System.out.println("Salary without change: "+noChange.CalculateSalary(baseSalary));
		System.out.println("Salary with Bonus: "+withBonus.CalculateSalary(baseSalary));
		System.out.println("Salary with Deduction of 5 per: "+withDeduction.CalculateSalary(baseSalary));
		System.out.println("Salary increment for <20k: "+withIncrement.CalculateSalary(baseSalary));
	}

}
