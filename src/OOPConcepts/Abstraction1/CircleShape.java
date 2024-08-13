package OOPConcepts.Abstraction1;

public class CircleShape extends ShapeClass {

    private double ratio;
    private double diameter=ratio*2;

    public CircleShape (){}

    public CircleShape(double xPosition, double yPosition, double ratio) {
        super(xPosition, yPosition);
        this.ratio = ratio;
    }

    //To clarify,this method from ShapeClass is making the circle area calculation process from the superclass
    //so the abstraction concept is displayed here, by taking an abstract method into an overrated method for a
    //subclass executing an unknown process for the superclass but with enough info for a calculation in the subclass
    @Override
    public double areaCalculation() {
        double pi=3.14;
        double result=pi*ratio*ratio;
        return result;
    }
}
