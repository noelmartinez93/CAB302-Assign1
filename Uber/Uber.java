package junit.Uber;

import java.time.Duration;
import java.time.Instant;

public class Uber
{
    private String carModel;
    private String driverName;
    private static double uberRate = 0.0;
    private static double uberSurge = 1.0;
    private static double timeElapsed = 0.0;
    private Instant start, end;


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
        uberRate = rate;
        return uberRate;
    }

    public static double getFareRate()
    {
        return uberRate;
    }

    public static double setSurge(double multiplier)
    {
        uberSurge = multiplier;
        return uberSurge;
    }

    public void pickup()
    {
        start = Instant.now();
    }

    public double setdownPassenger()
    {
        end = Instant.now();
        double duration = Duration.between(start, end).toMillis();
        double fare = uberRate * (duration / 1000) * uberSurge;
        return fare;
    }
}
