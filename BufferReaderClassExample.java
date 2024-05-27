package employeedata;
import java.io.BufferedReader;
import java.io.*;

public class BufferReaderClassExample 
{	
	public static void main(String[] args) 
	{
		try
		{
			String name;
			int Salary;			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));			 
			 System.out.println("Enter name");			 
			 name= br.readLine();			 
			 System.out.println("Enter Salary");			 
			 Salary = Integer.parseInt(br.readLine());			 
			 System.out.println("Name is : "+name);
			 System.out.println("Salary is: " +Salary);			 
		} 
		catch(Exception e) {
			System.out.println("Error");
		}
	}
}
