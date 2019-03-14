package oop.Shapes;

public class SquarePyramid implements Shape
{
    private double edge;
    private double height;

    public SquarePyramid (double edg, double hei)
    {
        this.edge = edg;
        this.height = hei;
    }

    @Override
    public double volume(double edg, double hei)
    {
        double result = (edg * edg) * (hei / 3);
        return result;
    }

    @Override
    public double surfaceArea (double edg, double hei)
    {
        double result = (edg * edg) + ((2 * edg) * Math.sqrt(((edg * edg) / 4) + (hei * hei)));
        return result;
    }
}
