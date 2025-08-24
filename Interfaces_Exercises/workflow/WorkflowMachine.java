import activity.*;
import java.util.ArrayList;

public class WorkflowMachine {

    public void execute(Workflow workflow) {
        
        ArrayList<Activity> activitys = workflow.activitys;

        for (Activity activity: activitys) {
            activity.execute();
        }
    }
}