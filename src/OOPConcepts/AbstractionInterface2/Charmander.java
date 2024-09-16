package OOPConcepts.AbstractionInterface2;

public class Charmander extends PokemonClass implements IFuego{
    public Charmander(){}

    @Override
    protected void attackTackle() {
        System.out.println("This is a Charmander TACKLE attack");
    }

    @Override
    protected void attackScratch() {
        System.out.println("This is a Charmander SCRATCH attack");
    }

    @Override
    protected void attackBite() {
        System.out.println("This is a Charmander BITE attack");
    }

    @Override
    public void attackFireFist() {
        System.out.println("This is a Charmander FireFist Attack from PokemonClass");
    }

    @Override
    public void attackFlamethrower() {
        System.out.println("This is a Charmander FlameThrower Attack from PokemonClass");
    }

    @Override
    public void attackFireRain() {
        System.out.println("This is a Charmander FireRain Attack from PokemonClass");
    }
}
