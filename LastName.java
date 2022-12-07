
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LastName{
    public static boolean isValidFirstName(String name){
        String regex = "^[A-Z]\\w{3,29}$";
        Pattern p =Pattern.compile(regex);

        if(name==null){
            return false;
        }
        Matcher m =p.matcher(name);
        return m.matches();
    }
    public static void main(String[] args){
        String Lname = "Sreedhar";
        System.out.println(isValidFirstName(Lname));
    }
 }