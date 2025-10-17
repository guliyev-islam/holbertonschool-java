public class Name {
    // Self-explanatory variables
    // A
    public Date modifiedDate;
    public List<Testcase> findAllTestcasesByUser(Name.User user){};
    // B
    public Date d; // modified date
    public List<Testcase> find(Name.User user){}; //find all Testcases by User

    // Correct Declarations
    // A
    public List<Account> AccountList;
    // B
    public Account[] AccountList; 

    // No Prefixes
    // A
    public void deleteUser(Name.User pUser){}; 
    // B
    public void deleteUser(Name.User user){};

    // Avoid mental mapping    
    // A
    public URL r;
    // B
    public URL url;

    // Class names should be nouns, functions should have verbs
    // A
    public class TableRepresent {};
    public void saveCar(){};
    // B
    public class TableRepresenter{};
    public void car(){}; 

    // One word per concept
    // A
    public saveUser(){}; saveAccount(){}; saveContract(){};
    // B
    public saveUser(){}; createAccount(){}; generateContract(){};

    // Use constants or enums instead of magic numbers or abbreviations
    // A
    public int daysInYear = 360;
    public int hoursInWeek = 168;
    // B    
    public final int DAYS_IN_YEAR = 360;
    public final int HOURS_IN_WEEK = 168;
}
