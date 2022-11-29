import java.util.regex.Matcher; 
import java.util.regex.Pattern;

public class Rule2{
 
    public static boolean isValidEmail(String Rule1){
        String regex = "(?=.*[A-Z])";
        Pattern p =Pattern.compile(regex);

        if(Rule1==null){
            return false;
        }
        Matcher m =p.matcher(Rule1);
        return m.matches();
    }
    public static void main(String[] args){
        String Rule1 = "";
        System.out.println(isValidEmail(Rule1));
    }
 }
