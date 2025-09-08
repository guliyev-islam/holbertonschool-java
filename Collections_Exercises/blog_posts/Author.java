import java.util.Objects;

public class Author implements Comparable<Author> {

    String name;
    String surname;

    public Author(String name, String surname) {
        setName(name);
        setSurname(surname);
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public String toString() {
        String string = String.format("%s %s", getName(), getSurname());
        return string;
    }

    @Override
    public int compareTo(Author arg0) {
        
        return getName().compareTo(arg0.getName());
    }

    @Override
    public boolean equals(Object obj) {
        
        if (this == obj) {
            return true;
        }

        if (getClass() != obj.getClass()) {
            return false;
        }

        Author author = (Author)obj;

        return getName().equals(author.getName()) && getSurname().equals(author.getSurname());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getSurname());
    }
}