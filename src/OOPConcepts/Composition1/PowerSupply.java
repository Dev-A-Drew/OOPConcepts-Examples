package OOPConcepts.Composition1;

public class PowerSupply {

    private String namePS;
    private String brandPS;
    private double pricePS;

    public PowerSupply(String namePS, String brandPS, double pricePS) {
        this.namePS = namePS;
        this.brandPS = brandPS;
        this.pricePS = pricePS;
    }

    public String showPowerSupplyData(){
        return ("Power Supply name is: "+namePS+"\n"
               +"Power Supply brand is: "+brandPS+"\n"
               +"Power Supply price is: "+pricePS);
    }

    public void setNamePS(String namePS) {
        this.namePS = namePS;
    }

    public void setBrandPS(String brandPS) {
        this.brandPS = brandPS;
    }

    public void setPricePS(double pricePS) {
        this.pricePS = pricePS;
    }

    public String getNamePS() {
        return namePS;
    }

    public String getBrandPS() {
        return brandPS;
    }

    public double getPricePS() {
        return pricePS;
    }

}
