package oop.Shapes;

public class Tetrahedron implements Shape
{
    private double edge;

    public Tetrahedron(double edg)
    {
        this.edge = edg;
    }

    @Override
    public double volume()
    {
        double result = ((edge * edge) * edge) / (6 * Math.sqrt(2));
        return result;
    }

    @Override
    public double surfaceArea()
    {
        double result = (Math.sqrt(3))*(edge * edge);
        return result;
    }
}
