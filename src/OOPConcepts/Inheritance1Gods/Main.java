package OOPConcepts.Inheritance1Gods;

public class Main {
    public static void main(String[] args) {

        HumanClass human = new HumanClass();

        System.out.println("the name of god is: "+human.nameOfGod);
        human.attackOfAGod();
        System.out.println("the name of demigod is: "+human.nameOfDemigod);
        human.attackOfADemigod();
        System.out.println("the name of human is :"+human.nameOfAHuman);
        human.attackOfAHuman();
    }
}
