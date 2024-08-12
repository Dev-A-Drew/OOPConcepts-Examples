package OOPConcepts.Polimorfism1;

public class Animal {

    String vertebrate;
    String nameAnimal;
    String typeAnimal;
    public Animal (String vertebrate, String nameAnimal, String typeAnimal)
    {
        this.vertebrate=vertebrate;
        this.nameAnimal=nameAnimal;
        this.typeAnimal=typeAnimal;
    }

    public String getVertebrate() {
        return vertebrate;
    }

    public String getNameAnimal() {
        return nameAnimal;
    }

    public String getTypeAnimal() {
        return typeAnimal;
    }

    public String showAnimalData()
    {
        return  " It is vertebrate: "+vertebrate+
                "\n Name is: "+nameAnimal+
                "\n Type is: "+typeAnimal;
    }
}
