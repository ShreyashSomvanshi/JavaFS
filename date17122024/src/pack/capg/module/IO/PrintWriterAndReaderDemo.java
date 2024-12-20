package pack.capg.module.IO;

import java.io.File;
import java.io.PrintWriter;

public class PrintWriterAndReaderDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "C:\\Windows\\System32\\config\\systemprofile\\eclipse-workspace\\date17122024\\printReaderWriter.txt";
	
		try {
			PrintWriter w = new PrintWriter(new File(s)); //creates file if not exists.
			w.println("Hello this is example of printwriter");
			w.print("This is one more line");
			w.printf("\n This is formatted number: % .2f", 156.457);
			w.close();
			System.out.println("Writing to file completed...");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
