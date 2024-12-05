package pack.capg.module1.basic;

public class operators1 {

	public static void main(String[] args) {
		int x=1; int y=2; int z=5;
		System.out.println("x: "+(!((x+2)== (1+2))));
		System.out.println("y: "+(!(y==z)));
		System.out.println("z>x: "+(!((z>x))));
		
		if(!(x==y)&&((y+5)>z)&&(!((z-3)==0))) {
			System.out.println("hello");
		}
	}

}
