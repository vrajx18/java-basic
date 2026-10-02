import java.util.*;
class IInvalidAgeException extends Exception {
    public IInvalidAgeException(String message) {
        super(message);
    }
}

public class Exception2 {
    public static void main(String[] args) {
        int age;
        System.out.println("enter your age :");
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();
        try {
            if (age < 18) {
                throw new IInvalidAgeException("you are not able to ");
            } else {
                System.out.println("you can vote dont worry !!");
            }
        } catch (IInvalidAgeException e) {
            System.out.println(e.getMessage());
        }
        }
    }
