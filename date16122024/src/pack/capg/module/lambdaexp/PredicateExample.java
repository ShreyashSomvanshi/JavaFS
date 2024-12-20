package pack.capg.module.lambdaexp;

import java.util.function.*;

public class PredicateExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Predicate<Integer> isEven = (num)->num%2 == 0;
		
		Predicate<Integer> isGreaterThan = (num)->num>100;
		
		//combined predicate
		Predicate<Integer> isEvenAndGreaterThan = isEven.and(isGreaterThan);
		
		// combined predicate with OR
		Predicate<Integer> isEvenORGreaterThan = isEven.or(isEvenAndGreaterThan) ; 
		
		// combined predicate with Negate
		Predicate<Integer> isNotEven = isEven.negate();
		
		System.out.println("isEven: "+isEven.test(6));
		System.out.println("isGreaterThan: "+isGreaterThan.test(6));
		System.out.println("isEvenAndGreaterThan: " + isEvenAndGreaterThan.test(600));
		System.out.println("isEvenORGreaterThan: " + isEvenORGreaterThan.test(61));
		System.out.println("isNotEven: "+isNotEven.test(6));
		
		
		// Define a supplier that returns a default msg
		Supplier<String> msgSupplier = () -> "hello, welcome to java8";
		
		// get msg by invoking get() method of the supplier
		String msg = msgSupplier.get();
		System.out.println(msg);
		
		// define a consumer  msgPrinter
		Consumer<String> msgResult = (msgR)-> System.out.println(msgR);
		msgResult.accept("This is a msg to print...");
		
	}

}
