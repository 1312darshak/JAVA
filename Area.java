package areaofRectangle;

public class Area 
{
	private double length;
    private double breadth;
    public void setDim(double length, double breadth)
    {
        this.length = length;
        this.breadth = breadth;
    }

    public double getArea() {
        return length * breadth;
    }

	public static void main(String[] args) 
	{
		Area rectangle = new Area();
        rectangle.setDim(5.5,8.9);
        System.out.println("The area of the rectangle is: " + rectangle.getArea());

	}

}
