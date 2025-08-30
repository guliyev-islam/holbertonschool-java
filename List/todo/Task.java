public class Task {

    private String description;
    private boolean isDone;
    private int identifier;

    public Task(String description, int identifier) throws IllegalArgumentException {
        setDescription(description);
        setIdentifier(identifier);
    }

    public String getDescription() {
        return description;
    }

    public int getIdentifier() {
        return identifier;
    }

    public void setDescription(String description) throws IllegalArgumentException {
        if (description.equals("") || description == null) {
            throw new IllegalArgumentException("Invalid task description");
        } 
        this.description = description;
    }

    public void setIdentifier(int identifier) {
        this.identifier = identifier;
    }

    public boolean isDone() {
        return isDone;
    }

    public void setDone(boolean isDone) {
        this.isDone = isDone;
    }

    public void modifyDescription(String description) throws IllegalArgumentException {
        setDescription(description);
    }
}