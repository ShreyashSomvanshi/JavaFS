package pack.capg.module.IO;

//import java.io.DataOutputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
//import java.io.FileOutputStream;

public class DataInputStreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Write data
//		try(DataOutputStream dos = new DataOutputStream(new FileOutputStream("C:\\Windows\\System32\\config\\systemprofile\\eclipse-workspace\\date17122024\\trydata.bin"))){
//			dos.writeInt(123);
//			dos.writeDouble(6578.989);
//			dos.writeBoolean(true);
//			dos.writeUTF("Hello, Written using DataOutputStream!");
//			System.out.println("Data written successfully");
//		}catch(Exception e) {
//			
//		}
		
		// Read data
		String path = "C:\\Windows\\System32\\config\\systemprofile\\eclipse-workspace\\date17122024\\trydata.bin";
		try(DataInputStream dis = new DataInputStream(new FileInputStream(path))){
//			FileInputStream input = new FileInputStream(path);
//			DataInputStream dis = new DataInputStream(input);
			int intVal = dis.readInt();
			double doubleVal = dis.readDouble();
			String s = dis.readUTF();
			
			System.out.println("Reading data:...");
			System.out.println("Int: "+intVal);
			System.out.println("Double: "+doubleVal);
			System.out.println("String: "+s);
//			System.out.println("UTF: "+);
			
			System.out.println("Data written successfully");
		}catch(Exception e) {
			System.out.println("Err..");
		}
	}

}
