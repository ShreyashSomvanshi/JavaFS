package pack.cap.module3.ctrlstmnt;

public class NestedIfDemo {
	
	public static void main(String[] args) {
		int x = 20, y = 30, z = 10;
		if(x==20) {
			if(y<50) {
				System.out.println("ABC");
			}
			if(z>30) {
				System.out.println("DEF");
			}
			else {
				System.out.println("PQR");
			}
		}
		else {
			System.out.println("XZ");
		}
	}

}
