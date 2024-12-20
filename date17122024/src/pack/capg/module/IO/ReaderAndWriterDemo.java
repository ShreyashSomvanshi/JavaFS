package pack.capg.module.IO;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class ReaderAndWriterDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		// Reader
//	try {
//		Reader r = new FileReader("C:\\Windows\\System32\\config\\systemprofile\\eclipse-workspace\\date17122024\\readerwriterdemo.txt");
//		int data = r.read();
//		while(data != -1) {
//			System.out.print((char)data);
//			data = r.read();
//		}
//		System.out.println("\n");
//		System.out.println("Does file.txt support mark operation: "+r.markSupported());
//		r.close();
//	} catch(FileNotFoundException e) {
//			e.printStackTrace();
//	}
	
		
		// Writer
	try {
		Writer w = new FileWriter("C:\\Windows\\System32\\config\\systemprofile\\eclipse-workspace\\date17122024\\readerwriterdemo.txt");
		String data = "Java Input Output stream writer";
		w.write(data);
		w.append(" Appenddding ....");
		w.close();
		System.out.println(" Written.....!");
	} catch(FileNotFoundException e) {
		e.printStackTrace();
	}
	
	
	}

}
