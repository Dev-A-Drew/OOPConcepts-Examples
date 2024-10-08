package OOPConcepts.Encapsulation1Student;

public class Student {

    private int id;
    private String name;
    private String lastName;

    public Student()
    {}

    public Student (int id, String name, String lastName)
    {
        this.id=id;
        this.name=name;
        this.lastName=lastName;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
