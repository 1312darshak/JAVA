package geometry;

public class Triangle 
{
	private double s1;
	private double s2;
	private double s3;
	
	public Triangle(double s1, double s2, double s3) 
	{
		this.s1 = s1;
		this.s2 = s2;
		this.s3 = s3;
	}
	
	public double getArea()
	{
		double tr = (s1+s2+s3)/2;
		return Math.sqrt(tr*(tr-s1)*(tr-s2)*(tr-s3));
	}
	
	public double getParameter()
	{
		return s1+s2+s3;
	}
}
