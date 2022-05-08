import java.util.Date;

public class Employee extends Person{

    private double salary;
    private  Date Doj;
    private int Experience_Years;
    public Employee(int age, float height, float weight, Date Dob,double salary,Date Doj,int Experience_Years) {
        super(age, height, weight, Dob);
        this.salary=salary;
        this.Doj=Doj;
        this.Experience_Years=Experience_Years;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setDoj(Date doj) {
        Doj = doj;
    }

    public void setExperience_Years(int experience_Years) {
        Experience_Years = experience_Years;
    }

    public double getSalary() {
        return salary;
    }

    public Date getDoj() {
        return Doj;
    }

    public int getExperience_Years() {
        return Experience_Years;
    }
}
