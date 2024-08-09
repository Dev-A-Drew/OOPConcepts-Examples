package OOPConcepts.Inheritance1Gods;

/* Let's start with the inheritance example about a simple reference of what we would take as the hole meaning of the
   word "Inheritance", by focusing on the Greek mythology, in this case the current class wil be GodClass, defining
   his attributes as powerOfAGod="Throw lightning" and nameOfGod="Zeus". The methods will be attackOfAGod, this will
   be one of the methods we will use for inheritance in class human.*/
public class GodClass {
    String powerOfAGod="Throw lightning";
    String nameOfGod="Zeus";
    public void attackOfAGod()
    {
        System.out.println("This is the attack of a god: "+powerOfAGod);
    }

    public void setNameOfGod(String nameOfGod) {
        this.nameOfGod = nameOfGod;
    }

    public String getNameOfGod() {
        return nameOfGod;
    }
}
