package OOPConcepts.Inheritance2Family;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        BookClass bookA = new BookClass("Song of Winter and Fire", 20011212,"Chris Potter Wreck");
        PaperClass paperA = new PaperClass(0.07,20.3,15.9,"Office");
        TreeClass treeA = new TreeClass(290.2,12,"AM1");

        System.out.println("\n");
        bookA.bookInfo();
        System.out.println("\n");
        paperA.paperInfo();
        System.out.println("\n");
        treeA.treeInfoAbout();
        treeA.riskOfNature();

    }
}
