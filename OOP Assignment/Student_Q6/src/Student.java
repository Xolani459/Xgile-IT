public class Student {

    private String name;
    private int age;
    private double totalMark;
    private double FirstSubject;
    private double SecondSubject;
    private double ThirdSubject;

    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name=name;
    }
    public int getAge()
    {
        return age;
    }
    public  void setAge(int age)
    {
        this.age=age;
    }
    public String getTotalMark()
    {
        return totalMark;
    }
    public void setTotalMark(double totmark)
    {
        this.totalMark=totmark;
    }
    public double getFirstSubject()
    {
        return FirstSubject;
    }
    public void setFirstSubject(double firstSubject)
    {
        this.FirstSubject=firstSubject;
    }
    public double getSecondSubject()
    {
        return  SecondSubject;
    }
    public void setSecondSubject(double SecondSubject)
    {
        this.SecondSubject=SecondSubject;
    }
    public double getThirdSubject()
    {
        return  ThirdSubject;
    }
    public void setThirdSubject(double ThirdSubject)
    {
        this.ThirdSubject=ThirdSubject;
    }
    public Student()
    {

    }
    public Student(String name,int age,double mark,double firstSubject,double secondSubject,double thirdSubject)
    {
        this.name=name;
        this.age=age;
        this.totalMark=mark;
        this.FirstSubject=firstSubject;
        this.SecondSubject=secondSubject;
        this.ThirdSubject=thirdSubject;
    }


}
