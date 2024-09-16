package OOPConcepts.AbstractionInterface2;

/*
THIS EXAMPLE IT'S ABOUT POKEMONS ADN DIFFERENT TYPES OF ELEMENTS FOR EACH ONE OF THEM
 */
public class IntegratorClass {
    public static void main(String[] args) {

        Squirtle squirtle1 = new Squirtle();
        Charmander charmander2 = new Charmander();
        Bulbasaur bulbasaur3 = new Bulbasaur();
        Pikachu pikachu4 = new Pikachu();

        squirtle1.attackScratch();
        squirtle1.attackHydroBomb();

        charmander2.attackScratch();
        charmander2.attackFlamethrower();

        bulbasaur3.attackScratch();
        bulbasaur3.attackDrainage();

        pikachu4.attackScratch();
        pikachu4.attackLightingRod();
    }
}
