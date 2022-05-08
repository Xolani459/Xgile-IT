public class Employee {

    protected int id;
    protected String Name;
    protected String Address;
    protected double Salary;

    public Employee(int id, String Name, String Address, double Salary)
    {
        this.id=id;
        this.Name=Name;
        this.Address=Address;
        this.Salary=Salary;
    }
    public double getSalary() {
        return Salary;
    }

    public int getId() {
        return id;
    }

    public String getAddress() {
        return Address;
    }

    public String getName() {
        return Name;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setSalary(double salary) {
        Salary = salary;
    }

}
