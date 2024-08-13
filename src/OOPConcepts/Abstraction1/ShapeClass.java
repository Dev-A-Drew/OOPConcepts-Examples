package OOPConcepts.Abstraction1;

public abstract class ShapeClass {

    protected double x;  // x position
    protected  double y;  // Y position

    protected ShapeClass(){}

    protected ShapeClass(double xPosition, double yPosition)
    {
        this.x=xPosition;
        this.y=yPosition;
    }

    public abstract double areaCalculation();

}
