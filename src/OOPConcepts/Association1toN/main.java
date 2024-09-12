package OOPConcepts.Association1toN;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {

        apartmentClass aparment1 = new apartmentClass();
        aparment1.setApartmentAddress("GRoove Street AV.");
        aparment1.setApartmentNumber(7);
        aparment1.setNumberRooms(3);



        List<ownerClass> listOfOwners = new ArrayList<ownerClass>();
        ownerClass owner1 = new ownerClass();
        ownerClass owner2 = new ownerClass();

        owner1.setOwnerAge(43);
        owner1.setOwnerName("Carlos");
        owner1.setOwnerLastName("Vialpando");

        owner2.setOwnerAge(34);
        owner2.setOwnerName("Alexander");
        owner2.setOwnerLastName("Smith");

        listOfOwners.add(owner1);
        listOfOwners.add(owner2);

        aparment1.setOwnerList(listOfOwners);

        System.out.println("Apartment: "+aparment1.getApartmentNumber()+" has as owners: \n"+aparment1.getOwnerList().toString());
    }
}
