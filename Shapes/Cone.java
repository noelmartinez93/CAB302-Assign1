package oop.Shapes;

public class Cone implements Shape
{
    private double radius;
    private double height;

    public Cone(double rad, double hei)
    {
        this.radius = rad;
        this.height = hei;
    }

    @Override
    public double volume()
    {
        double result = Math.PI*((radius * radius) * (height / 3));
        return result;
    }

    @Override
    public double surfaceArea()
    {
        double result = Math.PI*(radius * (radius + (Math.sqrt((height * height) + (radius * radius)))));
        return result;
    }
}
