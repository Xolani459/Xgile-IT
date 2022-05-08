import java.util.ArrayList;

public class Dept  {

    private String dept_Name;
    private String location;
    private double budget;
    private int Manager_id;
    private ArrayList<Employee> employee=new ArrayList<Employee>();
    private int No_Employees;


    public Dept()
    {
    }
    public Dept(String dept_Name,String location,double budget,int Manager_id,int No_Employees)
    {
        this.dept_Name=dept_Name;
        this.budget=budget;
        this.location=location;
        this.budget=budget;
        this.Manager_id=Manager_id;
        this.No_Employees=No_Employees;

    }
    public void setNo_Employees(ArrayList<Employee>employee)
    {
        this.employee=employee;
    }
    public void addEmployee(ArrayList<Employee>employee)
    {
        employee.addAll(employee);
    }
    public void removeEmployee(ArrayList<Employee> employee,int id){
        this.employee=employee;
        employee.remove(id);
    }
    public double deptExpenditure(double budget,double month1,double month2,double month3,double month4,double month5,double month6,double month7,double month8,double month9,double month10,double month11,double month12)
    {
        budget=(month1+month2+month3+month4+month5+month6+month7+month8+month9+month10+month11+month12);
        return budget;
    }
    public String Display()
    {
        return "Department: "+dept_Name+ " \n" +" location:"+"\n"+location+ " Budget: "+"\n"+budget+"Manager ID:"+Manager_id+"\n"+" Number of Employees: "+No_Employees;
    }
    public String onBudget(double budget)
    {
        if(budget <this.budget)
        {
            return "The Department is on budget";
        }
        else
        {
            return "The department is not on budget";
        }
    }
}
