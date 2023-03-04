package lesson2;

import lesson1.Author;
import lesson1.Book;

import java.util.Objects;

public class MainWork {
    public static void main(String[] args) {

        lesson1.Author gaiman=new lesson1.Author("Нил "," Гейман: ");
        lesson1.Book fragileThings=new lesson1.Book(" <<Хрупкие вещи>> ",gaiman,2006);
        System.out.println(gaiman);
        System.out.println(fragileThings);

        lesson1.Author chirovici=new Author("Эуджен ", " Чировици: ");
        lesson1.Book bookOfMirrors=new Book(" <<Книга зеркал>> ", chirovici,2017);
        System.out.println(chirovici);
        System.out.println(bookOfMirrors);
        System.out.println();
        fragileThings.setPublish(2023);
        System.out.println(" Год издания: "+fragileThings.getPublish());
        System.out.println("Эти два автора одинаковые?");
        System.out.println(gaiman.equals(chirovici));
        System.out.println("Какие у них хэш-коды?");
        System.out.println(gaiman.hashCode());
        System.out.println(chirovici.hashCode());
        System.out.println("Эти две книги одинаковые?");
        System.out.println(fragileThings.equals(bookOfMirrors));
        System.out.println("Какие у них хэш-коды?");
        System.out.println(fragileThings.hashCode());
        System.out.println(bookOfMirrors.hashCode());
        

    }



}
