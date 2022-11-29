import java.util.regex.Matcher; 
import java.util.regex.Pattern;

public class MobileFormat{
 
    public static boolean isValidEmail(String Mobile){
        String regex = "^(?:(?:\\+|0{0,2})91(\\s*\\s*)?|[0]?)?[789]\\d{9}$";
        Pattern p =Pattern.compile(regex);

        if(Mobile==null){
            return false;
        }
        Matcher m =p.matcher(Mobile);
        return m.matches();
    }
    public static void main(String[] args){
        String Mobile = "91 9919819801";
        System.out.println(isValidEmail(Mobile));
    }
 }
