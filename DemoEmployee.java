package employeeData;

public class DemoEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		  EmpPersonalInfo epr = new EmpPersonalInfo();
		  

epr.setEname("Janaki");
epr.setEmailId("scds@sdfds.com");
epr.setResaddr("shyamal");
epr.setMobileno(123456);


System.out.println(epr);  //  epr.toString() 


//System.out.println(epr.getEname() + " " + epr.getEmailId() + " " + epr.getMobileno());
	
	
EmpPersonalInfo epr1 = new EmpPersonalInfo();
	epr1.setEname("Apple");
	epr1.setResaddr("On the tree");
	
	
	System.out.println(epr1);  //epr1.toString()
	
	
	}

}
