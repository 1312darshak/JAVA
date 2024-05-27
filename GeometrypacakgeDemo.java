package geometryDemo;
import geometry.Circle;
import geometry.Rectangle;
import geometry.Triangle;

public class GeometrypacakgeDemo 
{
	public static void main(String[] args)
	{
		Circle cir = new Circle(10);
		Rectangle rec = new Rectangle(5,7);
		Triangle tr = new Triangle(9,8,7);
		
		System.out.println("Circle: ");
		System.out.println("Area: " + cir.getArea());
		System.out.println("Parameter: " + cir.getParameter());
		
		System.out.println("\nRectangle: ");
		System.out.println("Area: " + rec.getArea());
		System.out.println("Parameter: " + rec.getParameter());
		
		System.out.println("\nTriangle: ");
		System.out.println("Area: " + tr.getArea());
		System.out.println("Parameter: " + tr.getParameter());
	}
}
