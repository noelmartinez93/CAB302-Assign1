package oop.Shapes;

public class Tetrahedron implements Shape
{
    private double edge;

    public Tetrahedron(double edge)
    {
        edge = this.edge;
    }

    @Override
    public double volume(double ed)
    {
        double result = (ed * ed * ed) / 6 * Math.sqrt(2);
        return result;
    }

    @Override
    public double surfaceArea(double ed)
    {
        double result = Math.sqrt(3*(ed * ed));
        return result;
    }
}
