package OOPConcepts.Inheritance1Gods;

/* In this last class called HumanClass, we are going to define same attributes and methods for a human,
   "born" of the DemiGod class. So, we also type the word "extends" and the DemiGod class next to HumanClass to
   generate the inheritance of the SUPERCLASS DemiGodClass and the SUBCLASS HumanClass. Here we have created another
   inheritance link to represent the meaning of it in the Main class*/

public class HumanClass extends DemigodClass{

    String powerOfAHuman = "Regular punch";
    String nameOfAHuman = "Alex";

    protected void attackOfAHuman()
    {
        System.out.println("This is the attack of a Human: "+powerOfAHuman);
    }


}
