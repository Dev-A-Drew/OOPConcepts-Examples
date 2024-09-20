package OOPConcepts.Composition1;

import java.io.PipedWriter;

public class MotherBoard {

    private String brandMB;
    private double priceMB;
    private String nameMB;

    private PowerSupply powerSupA;

    public MotherBoard(String brandMB, double priceMB, String nameMB,String namePS, String brandPS, double pricePS) {
        this.brandMB = brandMB;
        this.priceMB = priceMB;
        this.nameMB = nameMB;
        this.powerSupA = new PowerSupply(namePS, brandPS, pricePS); //HERE IS WHERE COMPOSITION WORKS
    }

    public void setBrandMB(String brandMB) {
        this.brandMB = brandMB;
    }

    public void setPriceMB(double priceMB) {
        this.priceMB = priceMB;
    }

    public void setNameMB(String nameMB) {
        this.nameMB = nameMB;
    }

    public String getBrandMB() {
        return brandMB;
    }

    public double getPriceMB() {
        return priceMB;
    }

    public String getNameMB() {
        return nameMB;
    }

    public void showDetails(){
        System.out.println("Mother Board brand is: "+brandMB);
        System.out.println("Mother Board price is: "+priceMB);
        System.out.println("Mother Board name is: "+nameMB);
        System.out.println(powerSupA.showPowerSupplyData());
        //System.out.println("Power Supply data are: \n"+powerSupA.getBrandPS()+"\n"+powerSupA.getNamePS()+"\n"+powerSupA.getPricePS());
    }

}
