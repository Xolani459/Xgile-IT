import java.util.ArrayList;
import java.util.Date;

public class Student extends  Person{
    private Date roll;
    private int ListofSubjects;
    private  int Marks;
    private  int No_Subjects;

    public Student(int age, float height, float weight, Date Dob, Date roll, int Marks, int no_subjects) {
        super(age, height, weight, Dob);
        this.roll=roll;
        this.Marks=Marks;
        this.No_Subjects = no_subjects;
    }



    public void setRoll(Date roll) {
        this.roll = roll;
    }

    public void setListofSubjects(int listofSubjects) {
        this.ListofSubjects = listofSubjects;
    }

    public void setMarks(int marks) {
        Marks = marks;
    }

    public Date getRoll() {
        return roll;
    }


    public int getMarks() {
        return Marks;
    }
    public double CalcGrade(int Tot_Mark)
    {
        Tot_Mark=getMarks()+getMarks()+getMarks()+getMarks()/4;
        return Tot_Mark;
    }


}
