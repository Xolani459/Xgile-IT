import java.util.Scanner;

public class Student {
    private String StudName;
    private double Subject1;
    private double Subject2;
    private double Subject3;

    public static void main(String[] args) {
      Student st=new Student();
        //Assign the values
        st.AssignStudent();

        //Calculate total Average
        st.CalcAverage(st.Subject1,st.Subject2,st.Subject3);

        //Display
        st.Display();
    }
    protected void AssignStudent(){
        //Declare the scanner object
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Student Name :");
        StudName = sc.nextLine();

        System.out.println("Enter Marks for Subject 1:");
        Subject1 = sc.nextDouble();

        System.out.println("Enter Marks for Subject 2:");
        Subject2 = sc.nextDouble();

        System.out.println("Enter Marks for Subject 3:");
        Subject3 = sc.nextDouble();

    }
    protected double CalcAverage(double Subject1,double Subject2,double Subject3)
    {
        double Average;
        Average = (Subject1 + Subject2 + Subject3) /3;
        return Average;
    }

    protected void Display()
    {
        Student st=new Student();
        System.out.println("The average for " + st.StudName + " is " + Math.round(st.CalcAverage(Subject1,Subject2,Subject3)));
    }

}
