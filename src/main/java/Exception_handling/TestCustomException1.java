package Exception_handling;

class invalidAgeException extends Exception{
    public invalidAgeException(String str){
        super(str);
    }
}

public class TestCustomException1 {
    public static void validate (int age) throws invalidAgeException{
        if(age<18){
             throw new invalidAgeException("you are not eligable for vote");
        }
        else{
            System.out.println("eligble for vote");
        }
    } 
    
    public static void main(String[] args) {
        try {
            validate(19);
        } catch (invalidAgeException ex) {
           System.out.println("exception handled");
           System.out.println("exception occured"+ex);
           //ex.getMessage();
        }
    }
}
