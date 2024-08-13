package OOPConcepts.Encapsulation1Student;

public class Main {
    public static void main(String[] args) {

        Student studnt1 = new Student();
        Student studnt2 = new Student(1,"Albert","Philips");

        System.out.println(studnt2.getId()+" "+studnt2.getName()+" "+studnt2.getLastName());
    }
}
