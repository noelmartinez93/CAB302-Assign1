package oop.University;

public class Staff extends Academic
{
    private int hrs;

    Staff(Title title, int id, String name)
    {
        super(title, id, name);
    }

    public void setHours(int hours)
    {
        hrs = hours;
    }

    @Override
    public double getWeeklyPay()
    {
        double result = 0;
        if(hrs > 0)
        {
            result = hrs * 35;
        }
        if(hrs == 0)
        {
            result = ((75000.00 / 364.00) * 7.00);
        }
        return result;
    }

    @Override
    public String toString(){
        String result = ("Staff " + getID() + " works as a " + getTitle());
        return result;
    }
}
