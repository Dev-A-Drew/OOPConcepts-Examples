package OOPConcepts.Association1to1;

public class main {
    public static void main(String[] args) {

        CarClass carA = new CarClass();
        carA.setCarId(453560L);
        carA.setBrandCar("Toyota");
        carA.setModelCar("Corolla");


        OwnerClass ownerA = new OwnerClass();
        ownerA.setOwnerId(288299L);
        ownerA.setOwnerName("Alexander");
        ownerA.setOwnerLastName("Malfoy");
        carA.setOwnerA(ownerA);

        System.out.println("The info of the car is: \n"
                            +carA.getCarId()+"\n"
                            +carA.getBrandCar()+"\n"
                            +carA.getModelCar()+"\n"
                            +carA.getOwnerA().getOwnerDetails());
    }
}
