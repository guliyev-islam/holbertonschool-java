import java.util.ArrayList;

public class TodoList {

    private ArrayList<Task> tasks;

    public TodoList() {
        setTasks(new ArrayList<Task>());
    }
    
    public ArrayList<Task> getTasks() {
        return tasks;
    }
    
    public void setTasks(ArrayList<Task> tasks) {
        this.tasks = tasks;
    }

    public void addTask(Task task) throws Exception {
        if (getTasks().stream().anyMatch(
                t -> t.getIdentifier() == task.getIdentifier()
            )
        ) {
            throw new Exception(String.format("Task with identifier %d already exists in the list", task.getIdentifier()));
        }

        getTasks().add(task);
    }

    public boolean markTaskDone(int identifier) {
        for (Task task: tasks) {
            if (task.getIdentifier() == identifier) {
                task.setDone(true);
                return true;
            }
        }
        return false;
    }

    public boolean undoTask(int identifier) {
        for (Task task: getTasks()) {
            if (task.getIdentifier() == identifier) {
                task.setDone(false);
                return true;
            }
        }
        return false;
    }

    public void undoAll() {
        for (Task task: getTasks()) {
                task.setDone(false);
        }
    }

    public void completeAll() {
        for (Task task: getTasks()) {
                task.setDone(true);
        }
    }

    public void listTasks() {
        for (Task task: getTasks()) {
            if (task.isDone()) {
                System.out.print("[X] ");
            } else {
                System.out.print("[ ] ");
            }

            System.out.printf("Id: %d - Description: %s\n", task.getIdentifier(), task.getDescription());
        }
    }
}