package OOPConcepts.AbstractionInterface1;

public class Main {
    static double ratioForCircle=2.2;
    static double aSide=5;
    public static void main(String[] args) {
        CircleShape circle1= new CircleShape();
        SquareShape square1 = new SquareShape();


        circle1.setRatio(ratioForCircle);
        circle1.Draw();
        circle1.Rotate();
        System.out.println("The calculated Area for circle is: "+circle1.calculateArea());

        System.out.println("\n");
        square1.Draw();
        square1.setSide(aSide);
        System.out.println("The calculated area for a square is: "+square1.calculateArea());
    }
}
