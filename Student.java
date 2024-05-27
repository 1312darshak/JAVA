package employeedata;

public class Student 
{

		 private String name;

		    public Student() 
		    {
		        this.name = "Unknown";
		    }
		    
		    public Student(String name) 
		    {
		        this.name = name;
		    }

		    public String getName() 
		    {
		        return name;
		    }

		    public static void main(String[] args) 
		    {
		    	Student student1 = new Student();
		    	System.out.println("Student Name : "+ student1.getName());
		    	
		    	Student student2 = new Student("Hirva");
		    	System.out.println("Student Name : "+ student2.getName());
		    }
}

	


