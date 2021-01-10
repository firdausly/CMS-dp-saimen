
import java.text.SimpleDateFormat;
import java.util.regex.Matcher;
import java.util.regex.Pattern; 

public class validDate extends Validator{
 public validDate(String str) {
 super(str);

}
 @Override
 public boolean checkValid() {
 String pattern = "[0-3][0-9]/[0-1][0-9]/[0-9]{4}";
 Pattern r = Pattern.compile(pattern);
 Matcher m = r.matcher(str);
 SimpleDateFormat sdf = new
SimpleDateFormat("dd/MM/yyyy");
 if(!m.find()){
 return false;
 }else
 return true;

}
}
