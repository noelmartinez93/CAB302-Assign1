package oop.Shapes;

public class Cone implements Shape
{
    private double radius;
    private double height;

    public Cone (double rad, double hei)
    {
        this.radius = rad;
        this.height = hei;
    }

    @Override
    public double volume(double rad, double hei)
    {
        double result = Math.PI*((rad * rad) * (hei / 3));
        return result;
    }

    @Override
    public double surfaceArea (double rad, double hei)
    {
        double result = Math.PI*(rad * (rad + (Math.sqrt((hei * hei) + (rad * rad)))));
        return result;
    }
}
