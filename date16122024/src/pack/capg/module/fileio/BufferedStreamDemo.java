package pack.capg.module.fileio;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class BufferedStreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String filepath = "C:\\Windows\\System32\\config\\systemprofile\\eclipse-workspace\\date16122024\\buferedfile.txt";
		try (BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(filepath))){
			// write buffered data 
			String content = "This is a test content for BufferedOutputStream in Java, It will be read using BufferedInputStream";
			bos.write(content.getBytes());
			bos.flush(); /// ensures all the data is written to file
			System.out.println("Data successfully written to file");
			
			// Read buffered data from file
			BufferedInputStream bins = new BufferedInputStream(new FileInputStream(filepath));
			int ch;
			System.out.println("\n Reading data from the file");
//			bins.read(null, ch, ch)
			while((ch = bins.read()) != -1){
				System.out.print((char) ch);
			}
			
		}catch(Exception e) {
			System.out.println("Err occured.");
		}
	}

}
