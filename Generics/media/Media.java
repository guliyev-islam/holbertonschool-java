public class Media {

    private String name;

    public Media(String name) {
        setName(name);
    } 
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        String string = String.format("Type: %s - Name: %s", this.getClass().getName(), getName());
        return string;
    }
}