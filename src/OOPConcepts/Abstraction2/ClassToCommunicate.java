package OOPConcepts.Abstraction2;

public abstract class ClassToCommunicate {

    private String soundToCommunicate;

    protected ClassToCommunicate(){}

    protected ClassToCommunicate(String soundToCommunicate) {
        this.soundToCommunicate = soundToCommunicate;
    }

    public abstract String generateASound();
}
