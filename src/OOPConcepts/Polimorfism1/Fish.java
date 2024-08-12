package OOPConcepts.Polimorfism1;

public class Fish extends  Animal{

    int finsNumber;
    public Fish(String vertebrate, String nameAnimal, String typeAnimal, int finsNumber)
    {
        super(vertebrate,nameAnimal,typeAnimal);
        this.finsNumber=finsNumber;
    }

    @Override
    public String showAnimalData()
    {
        return  " It is vertebrate: "+vertebrate+
                "\n Name is: "+nameAnimal+
                "\n Type is: "+typeAnimal+
                "\n Fins: "+finsNumber;
    }
}
