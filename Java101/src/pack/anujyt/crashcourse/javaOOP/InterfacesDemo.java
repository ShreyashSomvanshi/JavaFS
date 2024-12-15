package pack.anujyt.crashcourse.javaOOP;

public class InterfacesDemo implements Car1, xyz{ // demonstrates multiple inheritance

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("Strting ......");
	}

	@Override
	public void hi() {
		// TODO Auto-generated method stub
		
	}

}

interface Car1{
	void start();
}

interface xyz{
	void hi();
}