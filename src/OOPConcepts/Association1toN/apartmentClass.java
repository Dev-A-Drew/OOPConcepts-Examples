package OOPConcepts.Association1toN;

import java.util.List;

public class apartmentClass {

    int apartmentNumber;
    String apartmentAddress;
    int numberRooms;
    // HERE IS WHERE WE DEFINE THE LINK FORM ONE TO MANY, I THIS CLASS FOR PRACTICAL PURPOSES WE WILL SAY AN
    // APARTMENT IS OWNED BY MANY OWNERS
    private List<ownerClass> ownerList;


    @Override
    public String toString() {
        return "apartmentClass{" +
                "apartmentNumber=" + apartmentNumber +
                ", apartmentAddress='" + apartmentAddress + '\'' +
                ", numberRooms=" + numberRooms +
                ", ownerList=" + ownerList +
                '}';
    }

    public apartmentClass(){}

    public apartmentClass(int apartmentNumber, String apartmentAddress, int numberRooms, List<ownerClass> ownerList) {
        this.apartmentNumber = apartmentNumber;
        this.apartmentAddress = apartmentAddress;
        this.numberRooms = numberRooms;
        this.ownerList = ownerList;
    }

    public void setApartmentNumber(int apartmentNumber) {
        this.apartmentNumber = apartmentNumber;
    }

    public void setApartmentAddress(String apartmentAddress) {
        this.apartmentAddress = apartmentAddress;
    }

    public void setNumberRooms(int numberRooms) {
        this.numberRooms = numberRooms;
    }

    public void setOwnerList(List<ownerClass> ownerList) {
        this.ownerList = ownerList;
    }


    public int getApartmentNumber() {
        return apartmentNumber;
    }

    public String getApartmentAddress() {
        return apartmentAddress;
    }

    public int getNumberRooms() {
        return numberRooms;
    }

    public List<ownerClass> getOwnerList() {
        return ownerList;
    }
}

