package oop.Shapes;

public class SquarePyramid implements Shape
{
    private double edge;
    private double height;

    public SquarePyramid(double edg, double hei)
    {
        this.edge = edg;
        this.height = hei;
    }

    @Override
    public double volume()
    {
        double result = (edge * edge) * (height / 3);
        return result;
    }

    @Override
    public double surfaceArea ()
    {
        double result = (edge * edge) + ((2 * edge) * Math.sqrt(((edge * edge) / 4) + (height * height)));
        return result;
    }
}
