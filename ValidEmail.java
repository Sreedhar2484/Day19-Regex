import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidEmail{
    public static boolean isValidEmail(String Email){
        String regex = "^[(.+)@(.+)$";
        Pattern p =Pattern.compile(regex);

        if(Email==null){
            return false;
        }
        Matcher m =p.matcher(Email);
        return m.matches();
    }
    public static void main(String[] args){
        String Email = "nagalli@gmail.com";
        System.out.println(isValidEmail(Email));
    }
 }
