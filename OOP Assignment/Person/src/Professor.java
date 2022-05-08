import java.util.ArrayList;
import java.util.Date;


public class Professor extends Employee{
    private String Courses;
    private ArrayList<Object>ListOfAdvisee;
    public Professor(int age, float height, float weight, Date Dob, double salary, Date Doj, int Experience_Years,String Courses,ArrayList<Object> ListofAdvisee) {
        super(age, height, weight, Dob, salary, Doj, Experience_Years);
        this.Courses=Courses;
        this.ListOfAdvisee=ListofAdvisee;
    }

    public void setCourses(String courses) {
        Courses = courses;
    }

    public ArrayList<Object> ListOfAdvisee() {
        return ListOfAdvisee;
    }

    public String getCourses() {
        return Courses;
    }

    public void ListOfAdvisee(ArrayList<Object> ListOfAdvisee) {
        ListOfAdvisee = ListOfAdvisee;
    }
}
