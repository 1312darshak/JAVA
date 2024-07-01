package employeeData;

public class DemoEmployee {

	public static void main(String[] args) {
		

		
		  EmpPersonalInfo epr = new EmpPersonalInfo();
		  

epr.setEname("Abhay");
epr.setEmailId("scds@abc.com");
epr.setResaddr("Kasturi");
epr.setMobileno(123456);


System.out.println(epr);  //  epr.toString() 


	
	
EmpPersonalInfo epr1 = new EmpPersonalInfo();
	epr1.setEname("Apple");
	epr1.setResaddr("On the tree");
	
	
	System.out.println(epr1);  //epr1.toString()
	
	
	}
}
