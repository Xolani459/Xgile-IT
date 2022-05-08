import java.util.Date;

public class Person {
    private int age;
    private float height;
    private float weight;
    private String address;
    private Date Dob;

    public int getAge(int i) {
        return age;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setDob(int dob) {
        Dob = dob;
    }

    public float getHeight() {
        return height;
    }

    public float getWeight() {
        return weight;
    }

    public String getAddress() {
        return address;
    }

    public Date getDob() {
        return Dob;
    }
    public Person(int age,float height,float weight,Date Dob)
    {
        this.age=age;
        this.height=height;
        this.weight=weight;
        this.Dob=Dob;
    }
}
