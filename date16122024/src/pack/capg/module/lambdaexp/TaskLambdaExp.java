package pack.capg.module.lambdaexp;

@FunctionalInterface
interface PrizeDeclare{
	String authorWinningPrize(String stmnt);
}

public class TaskLambdaExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String stmnt = "ABC";
		
		PrizeDeclare Scifi = (smt)-> smt+" won prize in category Scifi.";
		
		PrizeDeclare bio = (smt)-> smt+" won prize in category Biography.";
		
		PrizeDeclare novel = (smt)-> smt+" won prize in category Novel.";
		
		
		System.out.println("Winning Author name: "+stmnt);
		
		
		System.out.println("Author prize in Novel category: : "+Scifi.authorWinningPrize("try1"));
		System.out.println("Author prize in Novel category: : "+novel.authorWinningPrize("SHR"));
//		System.out.println("Salary increment for <20k: "+withIncrement.CalculateSalary(baseSalary));
	}
	}


