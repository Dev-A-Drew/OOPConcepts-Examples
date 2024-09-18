package OOPConcepts.Association1to1;

public class CarClass {

    private Long carId;
    private String brandCar;
    private String modelCar;

    private OwnerClass ownerA;

    public CarClass(){}

    public CarClass(Long carId, String brandCar, String modelCar, OwnerClass ownerA) {
        this.carId = carId;
        this.brandCar = brandCar;
        this.modelCar = modelCar;
        this.ownerA = ownerA;
    }

    public void setCarId(Long carId) {
        this.carId = carId;
    }

    public void setBrandCar(String brandCar) {
        this.brandCar = brandCar;
    }

    public void setModelCar(String modelCar) {
        this.modelCar = modelCar;
    }

    public void setOwnerA(OwnerClass ownerA) {
        this.ownerA = ownerA;
    }


    public Long getCarId() {
        return carId;
    }

    public String getBrandCar() {
        return brandCar;
    }

    public String getModelCar() {
        return modelCar;
    }

    public OwnerClass getOwnerA(){
        return ownerA;
    }
}
