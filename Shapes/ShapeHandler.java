package oop.Shapes;

public class ShapeHandler {
	// Returns the sum of the volumes of the given shapes.

	public static double volumeSum(Shape[] shapes)
	{
		double result = 0;
		for(Shape entry : shapes)
		{
			result += entry.volume();
		}
		return result;
	}

	// Returns the sum of the surface areas of the given shapes.
	public static double surfaceAreaSum(Shape[] shapes)
	{
		double result = 0;
		for(Shape entry : shapes)
		{
			result += entry.surfaceArea();
		}
		return result;
	}
}

