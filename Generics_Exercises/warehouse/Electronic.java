public class Electronic {

    private String description;
    private Double value;

    public Electronic(String description, Double value) {
        setDescription(description);
        setValue(value);
    }

    public String getDescription() {
        return description;
    }

    public Double getValue() {
        return value;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return String.format("[%s] $ %f", getDescription(), getValue()).replace(".", ",");
    }
 }