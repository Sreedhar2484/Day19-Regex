import java.util.regex.Matcher; 
import java.util.regex.Pattern;

public class Rule5{
 
    public static boolean isValidPassword(String Password){
        String regex = "^(?=.*[0-9])"+"(?=.*[a-z])(?=.*[A-Z])"+"(?=.*[@#$%^&+=])"+"(?=\\S+$).{8,20}$";
        Pattern p =Pattern.compile(regex);

        if(Password==null){
            return false;
        }
        Matcher m =p.matcher(Password);
        return m.matches();
    }
    public static void main(String[] args){
        String Password = "Srid@1918";
        System.out.println(isValidPassword(Password));
    }
 }
