package region.personalinfo;

public class TaxCalculation 
{
	public void calculateTax(Person p)
	{
		double tax = 0.0;
		
		if(p.getAge()>=18)
		{
			if(p.getSalary()>=50000 && p.getSalary()<70000)
			{
				tax = p.getSalary() *0.05;
			}
		else if(p.getSalary()>=70000 && p.getSalary()<100000)
		{
			tax = p.getSalary() *0.10;
		}
		else if(p.getSalary()>=100000)
		{
			tax = p.getSalary() *0.15;
		}
		else
		{
			System.out.println("NO TAX");
		}
	    }
		else
		{
			System.out.println("NO TAX");
		}
		
		System.out.println("TAX = " + tax);
	}
}
