package OOPConcepts.Aggregation1;

public class WebCam {
    private String nameWC;
    private String brandWC;
    private double priceWC;

    public WebCam(String nameWC, String brandWC, double priceWC) {
        this.nameWC = nameWC;
        this.brandWC = brandWC;
        this.priceWC = priceWC;
    }

    public String getNameWC() {
        return nameWC;
    }

    public void setNameWC(String nameWC) {
        this.nameWC = nameWC;
    }

    public String getBrandWC() {
        return brandWC;
    }

    public void setBrandWC(String brandWC) {
        this.brandWC = brandWC;
    }

    public double getPriceWC() {
        return priceWC;
    }

    public void setPriceWC(double priceWC) {
        this.priceWC = priceWC;
    }

    public void showWebCamData(){
        System.out.println("WebCam name is: "+nameWC);
        System.out.println("WebCam brand is: "+brandWC);
        System.out.println("WebCam price is: "+priceWC);
    }
}
