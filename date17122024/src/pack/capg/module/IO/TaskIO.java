package pack.capg.module.IO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.Writer;

public class TaskIO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path = "C:\\Windows\\System32\\config\\systemprofile\\eclipse-workspace\\date17122024\\bufferedRdrWrtrdemo.txt";
		
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print("Enter Emp name: ");
            String name = br.readLine(); 

            System.out.print("Enter emp salary: ");
            double sal = Double.parseDouble(br.readLine()); 
            
            System.out.print("Enter emp mob No.: ");
            long mobno = Integer.parseInt(br.readLine());
            

            System.out.println("Emp Name: " + name + " has Salary: " + sal + " Mobile no.: " + mobno );
            
            ///
            System.out.println("Writing data to file");
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
                bw.write("Name: " + name);
                bw.newLine();
                bw.write("Salary: " + sal);
                bw.newLine();
                bw.write("Mob no.: " + mobno);
                bw.newLine();
                
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            System.out.println("Data written successfully.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
		
		
		
	}

}
