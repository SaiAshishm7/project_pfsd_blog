class AgeRestrictionException extends Exception {
    AgeRestrictionException(String message) {
        super(message);
    }
}
public class usersign {
    public static void registerUser(int age) throws AgeRestrictionException {
        if(age < 18){
            throw new AgeRestrictionException("You are too young, minimum age 18 required");
        }
        System.out.println("You are successfully logged in");
    }

    public static void main(String[] args){
        try{
            registerUser(18);
        } catch(AgeRestrictionException e){
            System.out.println(e.getMessage());
        }
    }
}
