package pack.capg.module.lambdaexp;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = {1,2,3,4,5,6,7,8,9,10};
		
		// transform 1d array to 2d
		// method 1
		Stream<int[]> num = Arrays.stream(new int[][] {numbers});
		
		// prints 1d array:
//		num.forEach(arr -> System.out.println(Arrays.toString(arr)));
		
		num.flatMapToInt(Arrays::stream) //flatten the 2d array to 1d stream
		.filter(num1->num1%2==0)	//filter even stream
		.map(num1->num1*2)	//double the numbers
		.forEach(System.out::println); 	//print results
		
		
		// declaration: stream<E>()
//		Stream<String> str = Stream.empty();
//		str.forEach(System.out::println);
		
		
		int[] data = {2,4,3,14,55,23,7,88,9,5};
		IntStream numStream = Arrays.stream(data);
		numStream.filter(num2->num2%2!=0).forEach(System.out::println);
	
		// method 2
		Stream<String> strm = Stream.of("java ","is"," one of the"," prog lang.");
		strm.map(String :: toString).forEach(System.out::print);
	
		// method 3
		// other way to create stream (range of nums)
		IntStream rangeStrm = IntStream.range(1, 15);
		rangeStrm.filter(num3 -> num3%2 != 0).forEach(System.out::println);
	
		// method 4
		// infinite stream, can be limited using limit
		Stream<Integer> strm1 = Stream.iterate(1, a->a+1);
	
		strm1.limit(20).forEach(System.out::println);
	
	}

}
