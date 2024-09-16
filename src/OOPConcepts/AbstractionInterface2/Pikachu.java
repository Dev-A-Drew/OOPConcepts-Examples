package OOPConcepts.AbstractionInterface2;

public class Pikachu extends PokemonClass implements IElectric{

    public Pikachu(){}

    @Override
    protected void attackTackle() {
        System.out.println("This is a Pikachu TACKLE attack");
    }

    @Override
    protected void attackScratch() {
        System.out.println("This is a Pikachu SCRATCH attack");
    }

    @Override
    protected void attackBite() {
        System.out.println("This is a Pikachu BITE attack");
    }

    @Override
    public void attackLightingRod() {
        System.out.println("This is a Pikachu LightingRod Attack from PokemonClass");
    }

    @Override
    public void attackLightingFist() {
        System.out.println("This is a Pikachu LightingFist Attack from PokemonClass");
    }
}
