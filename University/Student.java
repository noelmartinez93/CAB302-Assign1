package oop.University;

public class Student extends Academic
{
    private double Stipend;

    Student(Title title, int id, String name, double stipend)
    {
        super(title, id, name);
        this.Stipend = stipend;
    }

    @Override
    public double getWeeklyPay()
    {
        return Stipend;
    }

    @Override
    public String toString(){
        String result = ("Student " + getID() + " studies a " + getTitle());
        return result;
    }
}
