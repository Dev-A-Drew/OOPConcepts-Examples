package OOPConcepts.Inheritance2Family;

public class PaperClass extends TreeClass{
    private double weightPaper;
    private double highPaper;
    private double widthPaper;
    private String typePaper;

    TreeClass aTreeObj = new TreeClass();


    public PaperClass(){}
    public PaperClass(double weightPaper, double highPaper, double widthPaper, String typePaper) {
        this.weightPaper = weightPaper;
        this.highPaper = highPaper;
        this.widthPaper = widthPaper;
        this.typePaper = typePaper;
    }

    public void setWeightPaper(double weightPaper) {
        this.weightPaper = weightPaper;
    }

    public void setHighPaper(double highPaper) {
        this.highPaper = highPaper;
    }

    public void setWidthPaper(double widthPaper) {
        this.widthPaper = widthPaper;
    }

    public void setTypePaper(String typePaper) {
        this.typePaper = typePaper;
    }

    public double getWeightPaper() {
        return weightPaper;
    }

    public double getHighPaper() {
        return highPaper;
    }

    public double getWidthPaper() {
        return widthPaper;
    }

    public String getTypePaper() {
        return typePaper;
    }

    public void paperInfo(){
        System.out.println("The info abut the paper is: \n"+
                           "Paper Weight: "+weightPaper+" \n"+
                           "Paper High: "+highPaper+" \n"+
                           "Paper Width: "+widthPaper+" \n"+
                           "Paper Type: "+typePaper);
    }



}
