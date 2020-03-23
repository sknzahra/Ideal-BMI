/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package idealbmi.Function;

import idealbmi.Model.ModelProgram;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


/**
 *
 * @author Asus
 */
public class ProgramLogic extends ModelProgram{
    ModelProgram mp = new ModelProgram();
    
    public Boolean checkName(String name){
        Pattern pattern = Pattern.compile("^[a-zA-Z\\s-]+$");
        Matcher matcher = pattern.matcher(name);
        return matcher.matches();
    }
    
    public Boolean checkAge(String age){
        Pattern pattern = Pattern.compile("^[1-9]?[0-9]{1}$|^100$");
        Matcher matcher = pattern.matcher(age);
        return matcher.matches();
    }
    
    public int BMI = mp.getWeight()/mp.getHeight();
    
    public String returnBMI(int BMI){
        if(BMI >= 30){
            return "For the information you entered:"
                    + "\nHeight: " + height + "centimeters"
                    + "\nWeight: " + weight + "meters"
                    + "\nYour BMI is " + BMI + ", indicating your weight is in"
                    + " the Normal category."
                    + "Gemuk, Kelebihan berat badan tingkat berat";
        }
        else if ((BMI >= 25.0) && (BMI <= 29.9)){
            return "Normal";
        }
        else if ((BMI >= 18.5) && (BMI <= 24.9)){
            return "For the information you entered:"
                    + "\nHeight: " + height + "centimeters"
                    + "\nWeight: " + weight + "meters"
                    + "\nYour BMI is " + BMI + ", indicating your weight is in"
                    + " the Normal category.";
        }
        else if (BMI < 18.5){
            return "Kurus, Kekurangan berat badan tingkat berat";
        }
        return "Periksa lagi";
    }
}

