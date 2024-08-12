package OOPConcepts.Polimorfism1;

public class Main {
    public static void main(String[] args) {
        Animal theAnimal [] = new Animal[4];
        theAnimal[0] = new Fish("yes","Shark","Fish",4);
        theAnimal[1] = new Bird("yes","Falcon","Bird",true);
        theAnimal[2] = new Mammals("yes","Rhino","Mammal", 4);
        theAnimal[3] = new Mammals("yes","Homo Sapiens","Mammal",0);

        for (Animal animalCount: theAnimal) {
            System.out.println(animalCount.showAnimalData());
            System.out.println(" ");
        }
    }
}
