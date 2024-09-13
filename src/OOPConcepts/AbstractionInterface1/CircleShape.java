package OOPConcepts.AbstractionInterface1;

public class CircleShape implements ShapeClass, DrawableClass,RotableClass{

    private double ratio;

    public CircleShape (){}

    public CircleShape(double ratio) {
        this.ratio = ratio;
    }

    public double getRatio() {
        return ratio;
    }

    public void setRatio(double ratio) {
        this.ratio = ratio;
    }

    @Override
    public double calculateArea() {
        double pi=3.14;
        double result=pi*ratio;
        return result;
    }

    @Override
    public void Draw() {
        System.out.println("This is the method that it is drawing A CIRCLE");
    }

    @Override
    public void Rotate() {
        System.out.println("This is the method that it is rotating A CIRCLE");
    }
}
