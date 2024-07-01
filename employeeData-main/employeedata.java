package employeeData;

public class employeedata {

	private String name, designation;
	private int basicSalary;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public int getBasicSalary() {
		return basicSalary;
	}
	public void setBasicSalary(int basicSalary) {
		this.basicSalary = basicSalary;
	}
	@Override
	public String toString() {
		return "EmployeeData [name=" + name + ", designation=" + designation + ", basicSalary=" + basicSalary + "]";
	}
}
