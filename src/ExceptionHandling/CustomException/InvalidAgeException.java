package ExceptionHandling.CustomException;

public class InvalidAgeException extends Exception {
    InvalidAgeException(String msg){
        super(msg);
    }

}
class Driver{
    static void vote(int age) throws InvalidAgeException{
        if(age<18){
            throw new InvalidAgeException("Age must be over 18!");
        }
        System.out.println("You can vote");
    }

    public static void main(String[] args) throws Exception{
        vote(13);
    }/* If we extend our custom exception from Exception class(Checked) we use throws otherwise
    if we extend from run time exception we handle it manually by using try catch block*/
}
