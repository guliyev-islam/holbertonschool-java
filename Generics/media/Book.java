public class Book extends Media {

    private int edition;

    public Book(String name, int edition) {
        super(name);
        setEdition(edition);
    }

    public int getEdition() {
        return edition;
    }

    public void setEdition(int edition) {
        this.edition = edition;
    }


}