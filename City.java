package region.countrystatepack;

public class City 
{
	private String cname;
	
	public City()
	{
		this.cname = "";
	}

	public City(String cname) 
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
	public String toString() 
	{
		return "City [cname=" + cname + "]";
	}
	
	public static void main(String[] args)
	{
		City city = new City("Gandhinagar");
		System.out.println(city);
	}	
}
