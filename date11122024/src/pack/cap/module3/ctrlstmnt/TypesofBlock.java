package pack.cap.module3.ctrlstmnt;


/**
 *Local, Instance, Static Blocks 
 */
public class TypesofBlock {
	
	// instance block
	
	int data;
	{
		data=500;
	}

	public TypesofBlock() {
		super();
		System.out.println("0-arg constructor ");
		// TODO Auto-generated constructor stub
	}
	
	public TypesofBlock(int x) {
		super();
		System.out.println("1-arg constructor ");
		// TODO Auto-generated constructor stub
	}
	
	
	// instance block
	{
		System.out.println(" first Instance block .... ");
	}
	
	// instance block
	{
		System.out.println("second Instance block .... ");
	}
	
	void display() {
		System.out.println(data);
	}

	public static void main(String[] args) {
		TypesofBlock t = new TypesofBlock();
		new TypesofBlock(5);
	}

}
