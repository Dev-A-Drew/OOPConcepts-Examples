package OOPConcepts.Abstraction2;

public class CameraClass extends ClassToSee{

    private int numberOfEyes;
    private String cameraType;

    private CameraClass(){}

    public CameraClass(int xAxis, int yAxis, int zAxis, int numberOfEyes, String cameraType) {
        super(xAxis, yAxis, zAxis);
        this.numberOfEyes = numberOfEyes;
        this.cameraType = cameraType;
    }

    @Override
    public boolean openEyes() {
        if(xAxis!=0 && yAxis!=0 && zAxis!=0 && numberOfEyes>0 && cameraType!=null)
        {
            System.out.println("\n Valid parameters to start eye function for CAMERA");
            return true;}
        else
        {   System.out.println("\n Invalid parameters, couldn't start eye function for CAMERA, check parameters please");
            return false;}
    }

    @Override
    public void lookToAThingUp() {}

    @Override
    public void blindView() {
    }


}
