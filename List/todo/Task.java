public class Task {

    private String description;
    private boolean isDone;
    private int identifier;

    public Task(String description, int identifier) throws Exception {
        setDescription(description);
        setIdentifier(identifier);
    }

    public String getDescription() {
        return description;
    }

    public int getIdentifier() {
        return identifier;
    }

    public void setDescription(String description) throws Exception {
        if (description.equals("") || description == null) {
            throw new Exception("Invalid task description");
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

    public void modifyDescription(String description) throws Exception {
        setDescription(description);
    }
}