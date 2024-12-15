package pack.cap.module6.collectn;

public class ThreeDArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] department = {"Electronics","CS", "IT"};
		
		int dept, st, sc, total = 0;
		double per=0;
		int[][][] scores = {
				{{75, 87, 69},{90, 87, 85},{56, 67, 76}},
				{{78,67,75},{87, 98, 76},{67,56,66}},
				{{72, 63,72},{80,90,70},{64,56,67}}
		};
		
//		for(dept=0; dept<3; dept++) {
			for(int i=0; i<3; i++) {
				System.out.println("Department " + department[i] +":" );
				for(st=0; st<3; st++) {
					System.out.println("Student "+(st +1) +" scores");
					for(sc=0;sc<3;sc++) {
						System.out.println(scores[dept][st][sc]+" ");
						total += scores[dept][st][sc];
						per=(double)total/3;
					}
					System.out.println("\n Total scores: " + total );
					System.out.println("Percentage: " + per );
					total = 0;
				}
				System.out.println();
			}
//			break;
//		}
		
	}

}
