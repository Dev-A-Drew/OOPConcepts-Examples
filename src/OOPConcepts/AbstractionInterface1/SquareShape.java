package OOPConcepts.AbstractionInterface1;

public class SquareShape implements ShapeClass, DrawableClass{

    private double side;

    public SquareShape(){}

    public SquareShape(double side) {
        this.side = side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double calculateArea() {
        double result=side*side;
        return result;
    }

    @Override
    public void Draw() {
        System.out.println("This is the method that it is drawing A SQUARE");
    }
}
