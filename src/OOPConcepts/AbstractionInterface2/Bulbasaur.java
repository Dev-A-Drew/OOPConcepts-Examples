package OOPConcepts.AbstractionInterface2;

public class Bulbasaur extends PokemonClass implements IPlanta{

    public Bulbasaur(){}

    @Override
    protected void attackTackle() {
        System.out.println("This is a Bulbasaur TACKLE attack");
    }

    @Override
    protected void attackScratch() {
        System.out.println("This is a Bulbasaur SCRATCH attack");

    }

    @Override
    protected void attackBite() {
        System.out.println("This is a Bulbasaur BITE attack");
    }

    @Override
    public void attackDrainage() {
        System.out.println("This is a Bulbasaur Drainage Attack from PokemonClass");
    }

    @Override
    public void attackParalyze() {
        System.out.println("This is a Bulbasaur Paralayze Attack from PokemonClass");
    }
}
