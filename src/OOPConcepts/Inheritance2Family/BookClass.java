package OOPConcepts.Inheritance2Family;

import java.util.Date;

public class BookClass extends PaperClass{

    private String titleBook;
    private int dateReleasedBook;
    private String authorBook;

    public BookClass() {}
    public BookClass(String titleBook, int dateReleasedBook, String authorBook) {
        this.titleBook = titleBook;
        this.dateReleasedBook = dateReleasedBook;
        this.authorBook = authorBook;
    }

    public void setTitleBook(String titleBook) {
        this.titleBook = titleBook;
    }

    public void setDateReleasedBook(int dateReleasedBook) {
        this.dateReleasedBook = dateReleasedBook;
    }

    public void setAuthorBook(String authorBook) {
        this.authorBook = authorBook;
    }

    public String getTitleBook() {
        return titleBook;
    }

    public int getDateReleasedBook() {
        return dateReleasedBook;
    }

    public String getAuthorBook() {
        return authorBook;
    }

    public void bookInfo(){
        System.out.println("The info abut the book is: \n"+
                           "Book Title: "+titleBook+" \n"+
                           "Book Date Released: "+dateReleasedBook+" \n"+
                           "Book Author: "+authorBook+" \n");
    }
}
