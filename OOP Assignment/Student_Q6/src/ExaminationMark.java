public class ExaminationMark extends  Student {

    Student stud=new Student();

    public ExaminationMark(String name,int age,double mark,double firstSubject,double secondsubject,double thirdsubject)
    {
        super(name,age,mark,thirdsubject,secondsubject,firstSubject);
    }
    public double getAverage()
    {
        return (stud.getFirstSubject()+stud.getSecondSubject()+stud.getThirdSubject()/3);
    }
    public String getTotalMark()
    {
        if (getAverage() >=80)
        {
            return "A";
        }
        else if (getAverage() >=70)
        {
            return "B";
        }
        else if (getAverage() >=60)
        {
            return "C";
        }
        else if (getAverage() >=50)
        {
            return  "D";
        }
        else
        {
            return "F";
        }
        public void display()
        {
            return super.toString()+"\n"+" Name :"+ stud.getName()+" \n Student Age:"+stud.getAge()+"\n"+" First Subject: "+stud.getFirstSubject()+ "\n"+ " Second Subject: "+stud.getSecondSubject()+ "\n"+ " Third Subject :"+ stud.getThirdSubject()+"\n"+" Total Mark:"+getTotalMark();
        }
    }
}
