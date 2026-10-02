import java.util.*;
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message){
        super(message);
    }
    public static void AgeHandler(int age) throws InvalidAgeException{
        if (age < 18 ){
            throw new InvalidAgeException("you are not eligible for voting !!");
        }
        else {
            System.out.println("you are eligible for voting !!");
        }
    }

}
public class Exception1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your age :");
        int age = sc.nextInt();
        try {
            InvalidAgeException.AgeHandler(age);
        }
        catch (InvalidAgeException e){
            System.out.println(e.getMessage());
        }
    }
}
