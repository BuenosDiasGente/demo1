package lesson2;

import lesson1.Author;

public class Book {
    private String nameBook;
    private lesson1.Author authorBook;
    private int publish;
    public Book(String nameBook, lesson1.Author authorBook, int publish){
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
    public void setPublish(int publish) {

        this.publish = publish;
    }
    
    @Override
    public boolean equals(Object other){
        if (this.getClass()!=other.getClass()||other==null){
            return false;
        }
        Book bookOfMirrors=(Book) other;
        return nameBook.equals(bookOfMirrors.nameBook);
    }
    @Override
    public int hashCode() {
        return java.util.Objects.hash(nameBook);
    }
    @Override
    public String toString() {
        return this.nameBook +" год издания: "+ this.publish;
    }

}
