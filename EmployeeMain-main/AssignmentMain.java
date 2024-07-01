package employeeMain;



public class AssignmentMain {

	public static void main(String[] args) {

		// Create a Manager instance
        Manager manager = new Manager();
        manager.setName("Alice");
        manager.setEmployeeId(101);
        manager.setSalary(90000);
        manager.setDepartment("Engineering");

        // Create a Developer instance
        Developer developer = new Developer();
        developer.setName("Bob");
        developer.setEmployeeId(102);
        developer.setSalary(80000);
        developer.setProgrammingLanguage("Java");

        // Use EmployeeUtilities to print details
        System.out.println("Manager Details:");
        Utilities.printEmployeeDetails(manager);

        System.out.println("\nDeveloper Details:");
        Utilities.printEmployeeDetails(developer);
    }
	}

}
