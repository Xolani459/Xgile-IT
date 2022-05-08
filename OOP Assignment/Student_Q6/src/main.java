public class main {
    public static void main(String[] args) {
        Student stud=new Student();
        ExaminationMark exam=new ExaminationMark("James",40,63,52,66,62);

        stud.setName("James");
        stud.setAge(40);
        stud.setTotalMark(63);
        stud.setFirstSubject(52);
        stud.setSecondSubject(66);
        stud.setThirdSubject(62);

        System.out.println(stud.toString());
        System.out.println(exam.toString());
    }
}
