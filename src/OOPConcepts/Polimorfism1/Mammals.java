package OOPConcepts.Polimorfism1;

public class Mammals extends Animal{

    int horns;
    public Mammals(String vertebrate, String nameAnimal, String typeAnimal, int horns)
    {
        super(vertebrate, nameAnimal, typeAnimal);
        this.horns=horns;
    }

    @Override
    public String showAnimalData()
    {
        return  " It is vertebrate: "+vertebrate+
                "\n Name is: "+nameAnimal+
                "\n Type is: "+typeAnimal+
                "\n Horns: "+ horns;
    }

}
