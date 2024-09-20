package OOPConcepts.Aggregation1;

public class Desktop {

    private String brandDT;
    private String nameDT;
    private double priceDT;

    private WebCam webcam1;

    public Desktop(String brandDT, String nameDT, double priceDT, WebCam webcam1) { //HERE IS WHERE AGGREGATION WORKS
        this.brandDT = brandDT;
        this.nameDT = nameDT;
        this.priceDT = priceDT;
        this.webcam1 = webcam1; //HERE IS WHERE AGGREGATIONS WORKS
    }

    public String getBrandDT() {
        return brandDT;
    }

    public void setBrandDT(String brandDT) {
        this.brandDT = brandDT;
    }

    public String getNameDT() {
        return nameDT;
    }

    public void setNameDT(String nameDT) {
        this.nameDT = nameDT;
    }

    public double getPriceDT() {
        return priceDT;
    }

    public void setPriceDT(double priceDT) {
        this.priceDT = priceDT;
    }

    public WebCam getWebcam1() {
        return webcam1;
    }

    public void setWebcam1(WebCam webcam1) {
        this.webcam1 = webcam1;
    }

    public void showDesktopData(){
        System.out.println("Desktop name is: "+getNameDT());
        System.out.println("Desktop price is: "+getPriceDT());
        System.out.println("Desktop WebCam is: "+getWebcam1().toString());
    }
}
