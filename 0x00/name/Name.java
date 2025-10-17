public class Name {
    // Self-explanatory variables
    // A
    public Date modifiedDate;
    public List<Testcase> findAllTestcasesByUser(Name.User user){};
    // B
    // Correct Declarations
    // A
    public List<Account> AccountList;
    // B

    // No Prefixes
    // A
    // B
    public void deleteUser(Name.User user){};

    // Avoid mental mapping    
    // A
    // B
    public URL url;

    // Class names should be nouns, functions should have verbs
    // A
    public class TableRepresent {};
    public void saveCar(){};
    // B

    // One word per concept
    // A
    // B
    public saveUser(){}; createAccount(){}; generateContract(){};

    // Use constants or enums instead of magic numbers or abbreviations
    // A
    // B    
    public final int DAYS_IN_YEAR = 360;
    public final int HOURS_IN_WEEK = 168;
}
