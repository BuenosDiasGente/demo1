package lesson1;

public class Book {
    private String nameBook;
    private Author authorBook;
    private int publish;
    public Book(String nameBook, Author authorBook, int publish){
        this.nameBook=nameBook;
        this.authorBook=authorBook;
        this.publish=publish;
    }
    public String getNameBook(){

        return this.nameBook;
    }
    public Author getAuthorBook(){

        return this.authorBook;
    }

    public int getPublish() {

        return this.publish;
    }
    public void setPublish(int publish){

        this.publish=publish;
    }
    public String toString() {
        return this.nameBook +" год издания: "+ this.publish;
    }

}
