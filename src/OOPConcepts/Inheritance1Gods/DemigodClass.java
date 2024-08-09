package OOPConcepts.Inheritance1Gods;

/* In this class we will the abstraction of a son of a God, which will be a Demigod class, establishing powerOfDemiGod
   and nameOfDemiGod as attributes, and an attack method called attackOfADemiGod. For this class we could say the
   GodClass became the SUPERCLASS of DemiGodClass, and DemigodClass became the SUBCLASS of GodClass. Therefore to create
    the relation of inheritance between these 2 classes, it's needed to type the word "extends" next to the class name
    and referencing the SUPERCLASS of which it's going to inheritance.*/

public class DemigodClass extends GodClass{

    String powerOfDemigod = "Supernatural Strength";
    String nameOfDemigod = "Perseus";

    public void attackOfADemigod()
    {
        System.out.println("This is the attack of a Demigod: "+powerOfDemigod);
    }

}
