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
        if(hrs != 0)
        {
            result = hrs * 35;
        }
        if(hrs == 0)
        {
            result = 1562.5; /* 75000 divided by 12 mos is 6250, then divided by 4 weeks is 1562.5 */
        }
        return result;
    }

    @Override
    public String toString(){
        String result = ("Staff " + getID() + " works as a " + getTitle());
        return result;
    }
}
