package OOPConcepts.Inheritance2Family;

public class TreeClass {

    private double highTree;
    private int yearsOld;
    private String sectorTree;

    public TreeClass(){}

    public TreeClass(double highTree, int yearsOld, String sectorTree) {
        this.highTree = highTree;
        this.yearsOld = yearsOld;
        this.sectorTree = sectorTree;
    }

    public void setHighTree(double highTree) {
        this.highTree = highTree;
    }

    public void setYearsOld(int yearsOld) {
        this.yearsOld = yearsOld;
    }

    public void setSectorTree(String sectorTree) {
        this.sectorTree = sectorTree;
    }

    public double getHighTree() {
        return highTree;
    }

    public int getYearsOld() {
        return yearsOld;
    }

    public String getSectorTree() {
        return sectorTree;
    }

    public void treeInfoAbout(){
        System.out.println("The info abut the tree is: \n"+
                           "High: "+highTree+" \n"+
                           "Years Odl: "+yearsOld+" \n"+
                           "sector where it was felled: "+sectorTree);
    }
    public void riskOfNature(){
        if(yearsOld<10 && sectorTree !=null)
        {
            System.out.println("tree was felled before time, there is a risk against the nature");
        }
        else
        {
            System.out.println("No risk against the nature, Tree was felled according the procedures");
        }
    }

}
