import java.util.ArrayList;
import activity.*;

public class Workflow {

    public ArrayList<Activity> activitys = new ArrayList<Activity>();

    public void registerActivity(Activity activity) {
        activitys.add(activity);
    }
}