package OOPConcepts.Polimorfism1;

public class Bird extends  Animal{

    boolean canFly;
    public Bird (String vertebrate, String nameAnimal, String typeAnimal, boolean fly)
    {
        super(vertebrate, nameAnimal, typeAnimal);
        this.canFly=fly;
    }

    public boolean itFlies()
    {
        return true;
    }
    @Override
    public String showAnimalData()
    {
        return  " It is vertebrate: "+vertebrate+
                "\n Name is: "+nameAnimal+
                "\n Type is: "+typeAnimal+
                "\n It Flies: "+canFly;
    }
}
