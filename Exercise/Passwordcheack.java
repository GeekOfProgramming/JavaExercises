import java.util.Scanner;

public class Passwordcheack{
    
    public static final int PASSWORD_LENGTH = 8;

    public static void main(String[] args) {

        System.out.println("Enter your password ");
        System.out.println("Password must have at least eight characters.");
        System.out.println("Password consists of only letters and digits ");
        System.out.println("Password must contain at least two digits");

        Scanner in = new Scanner(System.in);
        String password = in.nextLine();

        if (isValidPassword(password)) {
            System.out.println("Password is valid: " + password);
        } else {
            System.out.println("Not a valid password: " + password);
        }

        in.close();
    }

    public static boolean isValidPassword(String check){

        if(check.length() < PASSWORD_LENGTH){
            return false;
        }

        int charCount = 0;
        int numCount = 0;

        for(int i = 0 ; i <= check.length()-1 ; i++){
            
            char ch = check.charAt(i);

            if(isNumeric(ch)) numCount++;
            else if(isLetter(ch))   charCount++;
            else return false;

        }
        return (charCount >= 2 && numCount >= 2);
    }

    public static boolean isLetter(char ch) {
        ch = Character.toUpperCase(ch);
        return (ch >= 'A' && ch <= 'Z');
    }


    public static boolean isNumeric(char ch) {

        return (ch >= '0' && ch <= '9');
    }

    
}