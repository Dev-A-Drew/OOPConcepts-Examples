package OOPConcepts.Association1to1;

public class OwnerClass {

    private Long ownerId;
    private String ownerName;
    private String ownerLastName;

    public OwnerClass(){}

    public OwnerClass(Long ownerId, String ownerName, String ownerLastName) {
        this.ownerId = ownerId;
        this.ownerName = ownerName;
        this.ownerLastName = ownerLastName;
    }

    public void setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public void setOwnerLastName(String ownerLastName) {
        this.ownerLastName = ownerLastName;
    }


    public Long getOwnerId() {
        return ownerId;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public String getOwnerLastName() {
        return ownerLastName;
    }

    public String getOwnerDetails(){
        return "Owner ID: "+ownerId+"\n"+"Owner Name: "+ownerName+"\n"+"Owner Last Name: "+ownerLastName;
    }
}
