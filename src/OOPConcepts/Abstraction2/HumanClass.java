package OOPConcepts.Abstraction2;

public class HumanClass extends  ClassToSee{

    private int numberOfHumanEyes;
    private String clarityOfEyes;
    private double blurredPercentageEyes;
    private String pigmentColorEye;

    protected int positiveRangeX=10;
    protected int negativeRangeX=-10;
    //protected int positiveRangeY=10;
    //protected int negativeRangeY=-10;

    public HumanClass(){}

    public HumanClass(int xAxis, int yAxis, int zAxis, int numberOfHumanEyes, String clarityOfEyes, double blurredPercentageEyes, String pigmentColorEye) {
        super(xAxis,yAxis,zAxis);
        this.numberOfHumanEyes = numberOfHumanEyes;
        this.clarityOfEyes = clarityOfEyes;
        this.blurredPercentageEyes = blurredPercentageEyes;
        this.pigmentColorEye = pigmentColorEye;
    }

    @Override
    public boolean openEyes() {
        return false;
    }

    @Override
    public void lookToAThingUp() {
        //Move look to up or down
        if (xAxis>0)
        {
            if(xAxis<positiveRangeX)
            {
                int resp=positiveRangeX-xAxis;
                System.out.println("\n The rest of the range view in positive space is: "+resp);
            }
        }
        else
        {
            if(xAxis>negativeRangeX)
            {
                int resp=negativeRangeX-xAxis;
                System.out.println("\n The rest of the range view in negative space is: "+resp);
            }
        }
    }

    @Override
    public void blindView() {
        if (blurredPercentageEyes > 0.0 && blurredPercentageEyes < 40.0)
        {
            System.out.println("There is critical blurry eyes problem");
        }
        else if (blurredPercentageEyes > 40.0 && blurredPercentageEyes <60.0)
        {
            System.out.println("Eye needs to be treated with medical procedures or medical operation");
        }
        else{System.out.println("The eyes are completely blind to see");}
    }


}
