/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alang
 */
import java.text.SimpleDateFormat;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

public class validDate extends Validator {

    public validDate(String str) {
        super(str);

    }

    @Override
    public boolean checkValid() {
        String pattern = "[0-3][0-9]/[0-1][0-9]/[0-9]{4}";
        Pattern r = Pattern.compile(pattern);
        Matcher m = r.matcher(str);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        if (!m.find()) {
            //add message
            JOptionPane.showMessageDialog(MUI.getMUI(), "Enter a valid date");
            return false;
        } else {
            return true;
        }

    }
}
