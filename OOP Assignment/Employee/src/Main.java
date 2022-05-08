import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList<Object>dept=new ArrayList<Object>();
        Dept deptObject=new Dept();

        Employee emp1=new Employee(1,"John","Silverton",245000);
        Employee emp2=new Employee(2,"Nomsa","Durban",176000);
        Employee emp3=new Employee(3,"Thabo","Cape Town",245000);
        Employee emp4=new Employee(4,"Musa","Eastern Cape",245000);
        Employee emp5=new Employee(5,"Lincon","North West",245000);

        ArrayList<Employee> emp=new ArrayList<Employee>();
        emp.add(emp1);
        emp.add(emp2);
        emp.add(emp3);
        emp.add(emp4);
        emp.add(emp5);

        dept.add(new Dept(" System Software","Silverton",245000,1,emp.size()));

        double totalprice=0;
        for (Object depts : dept)
        {
            System.out.println(depts.toString());
            deptObject.toString();

            totalprice=deptObject.deptExpenditure(150000,20000,10000,5000,4000,7000,3500,7500,3200,6400,5400,7000,3800)
        }

        System.out.println("The Total Expenditure of te department is: "+totalprice+"\n"+deptObject.onBudget(totalprice));

    }
}
