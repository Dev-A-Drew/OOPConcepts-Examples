package OOPConcepts.Association1toN;

public class ownerClass {

    int ownerAge;
    String ownerName;
    String ownerLastName;

    @Override
    public String toString() {
        return "ownerClass{" +
                "ownerAge=" + ownerAge +
                ", ownerName='" + ownerName + '\'' +
                ", ownerLastName='" + ownerLastName + '\'' +
                '}';
    }

    public ownerClass(){}

    public ownerClass(int ownerAge, String ownerName, String ownerLastName) {
        this.ownerAge = ownerAge;
        this.ownerName = ownerName;
        this.ownerLastName = ownerLastName;
    }

    public int getOwnerAge() {
        return ownerAge;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public String getOwnerLastName() {
        return ownerLastName;
    }


    public void setOwnerAge(int ownerAge) {
        this.ownerAge = ownerAge;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public void setOwnerLastName(String ownerLastName) {
        this.ownerLastName = ownerLastName;
    }
}
