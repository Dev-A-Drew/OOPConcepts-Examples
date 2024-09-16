package OOPConcepts.AbstractionInterface2;

public class Squirtle extends PokemonClass implements IAgua{

    public Squirtle(){}
    @Override
    protected void attackTackle() {
        System.out.println("This is a Squirtle TACKLE attack");
    }

    @Override
    protected void attackScratch() {
        System.out.println("This is a Squirtle SCRATCH attack");
    }

    @Override
    protected void attackBite() {
        System.out.println("This is a Squirtle BITE attack");
    }

    @Override
    public void attackHydroBomb() {
        System.out.println("This is a Squirtle HydroBomb Attack from PokemonClass");

    }

    @Override
    public void attackBubble() {
        System.out.println("This is a Squirtle Bubble Attack from PokemonClass");

    }

    @Override
    public void attackWaterWave() {
        System.out.println("This is a Squirtle WaterWave Attack from PokemonClass");

    }
}
