public class Functions {
    // Do only 1 thing
    // A
    // B
    public void saveIncome(Income income){
        inRepo.save(income);
    }
    public void saveExpense(Expense expense){
        outRepo.save(expense);
    }

    // Only 1 level of abstraction
    // A
    @PostMapping("/user")
    public User saveUser(User user){
        return userService.save(user);
    }
    // B

    // Arguments
    // A
    public void saveUser(User user){};
    // B
    // No side effects
    // A
    // B
    public User saveUser(User user){
        return userRepository.save(user);
    }
    public void setRole(User user){
        user.setRole(user);     
    }

    // Avoid duplicates by extracting into new methods
    // A
    // B
    public Environment getEnvironment(){
        return environmentService.getEnvironment(getVersion());
    }
    public Release getRelease(){
        return releaseService.getRelease(getVersion());
    }
    private String getVersion(){ 
        return versionService.getVersion();
    }

}
