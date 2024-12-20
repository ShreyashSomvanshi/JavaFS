package pack.capg.module.IO;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilterInputStream;
import java.io.FilterOutputStream;

public class FilterStreeamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			// filter read file
//			String filepath = "C:\\Windows\\System32\\config\\systemprofile\\eclipse-workspace\\date16122024\\file1.txt";
//			FileInputStream fis = new FileInputStream(filepath);
//			FilterInputStream filter = new BufferedInputStream(fis);
//			int availableBytes = filter.available();
//			System.out.println("Initially , available bytes: "+availableBytes);
//			filter.read();
//			filter.read();
//			filter.read();
//			
//			int available = filter.available();
//			System.out.println("Available bytes after reading three bytes: "+available);
//			filter.close();
			
			// filter write file
			String filepath = "C:\\Windows\\System32\\config\\systemprofile\\eclipse-workspace\\date17122024\\filter-demo.txt";
			FileOutputStream fos = new FileOutputStream(filepath);
			FilterOutputStream filter = new BufferedOutputStream(fos);
			String content = "Hello filter output stream!";
			filter.write(content.getBytes());
			System.out.println("FilterOutputstream completed..");
			filter.close();
			
		} catch(Exception e) {
			
		}
	
	}

}
