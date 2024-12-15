package pack.cap.module3.ctrlstmnt;

public class searchtest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = {1,8, 3,7,5,6,10,4};
		int val = 10;
		
		boolean found = false;
		
		for(int x : nums) {
			if(x==val) {
				found = true;
				break;
			}
		}
		if(found) {
			System.out.println("Value found");
		}
		
		for(int i=1; i<=10; i++) {
			if(i%2 != 0) {
				continue;
			}
			System.out.println(i);
		}
		
		int p = 1;
		while(p<=10) {
			if(p==5) {
				p++;
				continue;
			}
			System.out.println(p);
			p++;
		}
		
		for(p=0; p<=6; p++) {
			if(p<2) continue;
			System.out.println(p+" ");
			if(p<4) continue;
			System.out.println(10*p+" ");
		}
	}

}
