package OOPConcepts.Aggregation1;


/*
                                                            AGGREGATION

DEFINITION: AGGREGATION IS THE CONCEPT WHERE A RELATION BETWEEN OBJECTS (CONTAINER AND COMPONENT) ESTABLISH A LINK BUT
NOT A DEPENDENCY, THEY ARE INDEPENDENT FROM THE CONTAINER.
IN AGGREGATION, COMPONENTS CAN EXIST WITHOUT THE CONTAINER, IF THE CONTAINER GETS DESTROY, THE COMPONENT STILL EXIST.
THIS RELATIONS IS WEAKER COMPARED TO THE COMPOSITION CONCEPT.

*/
public class Main {
    public static void main(String[] args) {

        WebCam webCamA = new WebCam("WebCam-Rizen","EagleEye",12.40);
        Desktop desktopB = new Desktop("HP","Desktop BLT-467",70.40,webCamA); //HERE IS WHERE AGGREGATION WORKS

        System.out.println("Info about WebCam through DesktopClass is: \n"+desktopB.getWebcam1().getNameWC()+"\n"
                                                                        +desktopB.getWebcam1().getBrandWC()+"\n"
                                                                        +desktopB.getWebcam1().getPriceWC());

    }
}
