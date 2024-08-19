package OOPConcepts.Abstraction2;

public abstract class ClassToSee {

    protected int xAxis;
    protected int yAxis;
    protected int zAxis;


    protected ClassToSee()
    {}

    protected ClassToSee(int xAxis, int yAxis, int zAxis) {
        this.xAxis = xAxis;
        this.yAxis = yAxis;
        this.zAxis = zAxis;
    }

    public abstract boolean openEyes();
    public abstract void lookToAThingUp();
    public abstract void blindView();
}
