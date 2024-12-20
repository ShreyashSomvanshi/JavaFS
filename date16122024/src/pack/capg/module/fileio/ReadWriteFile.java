package pack.capg.module.fileio;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ReadWriteFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			
			FileInputStream fis = new FileInputStream("C:\\Windows\\System32\\config\\systemprofile\\eclipse-workspace\\date16122024\\file1.txt");
			
			int value = fis.read();
			System.out.println("Reading a value in byte from: "+value);
			System.out.println((char)value);
			fis.close();
			
			
			String path = "C:\\Windows\\System32\\config\\systemprofile\\eclipse-workspace\\date16122024\\other_file_created.txt";
			File file = new File(path);
			
			if(!file.exists()) {
				if(file.createNewFile()) {
					System.out.println("File created successfully."+path);
				}else {
					System.out.println("Failed to create file!!");
					return;
				}
			}
			
			// Writing the data into created file
			FileOutputStream fos = new FileOutputStream(file);
			String content = "Using other method, first create file using file packsge";
			fos.write(content.getBytes());
			System.out.println("Data written successfuly.");
			
			// Read data from the file using fileInputstream
			FileInputStream fin = new FileInputStream(file);
			int character;
			System.out.println("\n Reading data from the file");
			while((character = fin.read()) != -1){
				System.out.print((char) character);
			
			
			
			}
			
			
			// Method 1 to Write
			/* Working:
			// create file
			String path = "C:\\Windows\\System32\\config\\systemprofile\\eclipse-workspace\\date16122024\\file_created.txt";
//			Path path = Paths.get("C:\\Windows\\System32\\config\\systemprofile\\eclipse-workspace\\date16122024\\file_created1.txt");
//			Path p = Files.createFile(path);
			System.out.println("File created at the path");
			FileOutputStream fos = new FileOutputStream(path);
			String content = "2nd try Hello, created this file from FileOutputStream obj";
			fos.write(content.getBytes()); // getBytes converts string in content into bytes
			System.out.println("Data written successfully!");
			*/
			
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
