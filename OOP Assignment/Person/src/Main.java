import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Student stud=new Student();

        stud.getAge(24);
        stud.setHeight(74);
        stud.setWeight(89);
        stud.setListofSubjects(5);
        stud.setAddress("Pretoria");
        stud.setDob(2002-03-23);
        stud.setRoll(2022-01-23);

        //List of subjects for the Student
        ArrayList<Object>NoSub=new ArrayList<Object>();
        NoSub.add("Information Systems");
        NoSub.add("System Software");
        NoSub.add("Technical Programming ");
        NoSub.add("Industry Exposure");
        NoSub.add("Communication Networks");

        //Display
        System.out.println("Student stays at :"+stud.getAddress() + "\n"+ "Age is:"+stud.getAge(24) +" Height is:"+stud.getHeight()+" And the weight is:"+stud.getWeight());

        Employee emp=new Employee();
        emp.setSalary(15000);
        emp.setExperience_Years(5);
        emp.setDoj(2015-04-13);
        emp.setAddress("Cape Town");
        emp.setWeight(78);



    }
}
