package OOPConcepts.Abstraction1;

public class SquareShape extends ShapeClass{

    private double side;

    public SquareShape(){}

    public SquareShape(double xPosition, double yPosition, double side) {
        super(xPosition, yPosition);
        this.side = side;
    }
    @Override
    public double areaCalculation() {
        double result=side*side;
        return result;
    }

}
