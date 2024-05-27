package region.countrystatepack;

public class Country 
{
	private String cname;
	
	public Country()
	{
		this.cname = "";
	}
	

	public Country(String cname) 
	{
		this.cname = cname;
	}

	public String getCname() 
	{
		return cname;
	}

	public void setCname(String cname) 
	{
		this.cname = cname;
	} 
	
	@Override
	public String toString() {
		return "Country [cname=" + cname + "]";
	}
	
	public static void main(String[] args)
	{
		Country country = new Country("India");
		System.out.println(country);
	}	
}
