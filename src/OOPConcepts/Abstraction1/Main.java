package OOPConcepts.Abstraction1;

public class Main {
    public static void main(String[] args) {

        SquareShape square1 = new SquareShape(2,2,3);
        System.out.println(square1.areaCalculation());

        System.out.println(" ");
        CircleShape circle1 = new CircleShape(0,0,2);
        System.out.println(circle1.areaCalculation());

    }
}

