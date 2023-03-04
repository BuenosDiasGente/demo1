package lesson2;

import lesson1.Author;

import java.util.Objects;

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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return publish == book.publish && nameBook.equals(book.nameBook) && authorBook.equals(book.authorBook);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameBook, authorBook, publish);
    }

    @Override
    public String toString() {
        return this.nameBook +" год издания: "+ this.publish;
    }

}
