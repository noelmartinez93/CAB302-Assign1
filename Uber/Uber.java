package junit.Uber;

public class Uber
{
    private String carModel;
    private String driverName;

    public Uber(String cModel, String dName)
    {
        this.carModel = cModel;
        this.driverName = dName;
    }

    public String getDriverName()
    {
        return driverName;
    }

    public String getCarModel()
    {
        return carModel;
    }

    public static double setRate(double rate)
    {
        return 0;
    }

    public static double getFareRate()
    {
        return 0;
    }

    public static double setSurge(double multiplier)
    {
        return 0;
    }

    public void pickup()
    {

    }

    public double setdownPassenger()
    {
        return 0;
    }
}
