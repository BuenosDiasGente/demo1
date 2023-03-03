package lesson1;

public class MainWork {
        public static void main(String[] args) {

            Author gaiman=new Author("Нил "," Гейман: ");
            Book fragileThings=new Book(" <<Хрупкие вещи>> ",gaiman,2006);
            System.out.println(gaiman);
            System.out.println(fragileThings);

            Author chirovici=new Author("Эуджен ", " Чировици: ");
            Book bookOfMirrors=new Book(" <<Книга зеркал>> ", chirovici,2017);
            System.out.println(chirovici);
            System.out.println(bookOfMirrors);
            System.out.println();
            fragileThings.setPublish(2023);
            System.out.println(" Год издания: "+fragileThings.getPublish());

        }
}
