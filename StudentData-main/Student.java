package studentData;

public class Student {
	
	private String name;
	
	
	public Student() {
        this.name = "Unknown";

}

	
	public Student(String name) {
        this.name = name;
    }
	
	
	public String getName() {
        return name;
    }
	
	
	public void setName(String name) {
        this.name = name;
    }
	
	
	public static void main(String[] args) {

        Student student1 = new Student(); 
        Student student2 = new Student("Muskan"); 
        
        System.out.println("Student 1 name: " + student1.getName());
        System.out.println("Student 2 name: " + student2.getName());
    }
}