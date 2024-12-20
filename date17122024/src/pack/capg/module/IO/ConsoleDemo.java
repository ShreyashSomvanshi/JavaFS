package pack.capg.module.IO;

import java.io.Console;

public class ConsoleDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			Console c = System.console();
			if(c!=null) {
				System.out.printf("Console is availble..");
				
			}else {
				System.out.printf("Not available");
			}
			System.out.println("Enter your name: ");
			String name = c.readLine();
			System.out.println("Hello "+name);
		}catch(Exception e) {
			
		}
		
	}

}
