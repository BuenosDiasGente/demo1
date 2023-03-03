package lesson2;

public class Author {
    private String name;
    private String surname;
    public Author (String name,String surname){
        this.name=name;
        this.surname=surname;
    }

    public String getName() {

        return this.name;
    }

    public String getSurname() {

        return this.surname;
    }

    @Override
    public boolean equals(Object other){
        if (this.getClass()!=other.getClass()||other==null){
            return false;
        }
        Author chirovici=(Author) other;
        return surname.equals(chirovici.surname);
    }
    @Override
    public int hashCode() {
        return java.util.Objects.hash(surname);
    }
    @Override
    public String toString(){
        return this.name +this.surname;
    }


}