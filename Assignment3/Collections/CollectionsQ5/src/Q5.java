import java.util.*;

class Q5
{
    private int id;
    private String fname;
    private double cgpa;
    public Q5(int id, String fname, double cgpa) {
        super();
        this.id = id;
        this.fname = fname;
        this.cgpa = cgpa;
    }
    public int getId() {
        return id;
    }
    public String getFname() {
        return fname;
    }
    public double getCgpa() {
        return cgpa;
    }
}

public class JavaSort
{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());

        List<Q5> studentList = new ArrayList<Q5>();
        while(testCases>0){
            int id = in.nextInt();
            String fname = in.next();
            double cgpa = in.nextDouble();

            Q5 st = new Q5(id, fname, cgpa);
            studentList.add(st);

            testCases--;
        }
        Collections.sort(studentList, new Comparator<Q5>() {
            @Override
            public int compare(Q5 s1, Q5 s2) {
                if(s2.getCgpa()>s1.getCgpa()){
                    return 1;
                }else if(s2.getCgpa()<s1.getCgpa()){
                    return -1;
                }
                return s1.getFname().compareTo(s2.getFname());
            }
        });

        for(Q5 st: studentList){
            System.out.println(st.getFname());
        }
    }
}