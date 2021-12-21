
package queueproject;

import java.util.regex.Pattern;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class QueueProject {
    public static void main(String[] args) {
        
       // try {
            DD1kFram d1kFram = new DD1kFram();
            d1kFram.setVisible(true);
           /* queueMM1K mM1 = new queueMM1K(5,6,5);
            System.out.println("w = "+ mM1.getL());
            System.out.println(validateNumber2("1+(2*3)"));*/
            //simple list test code
            /**
            String[] optionsToChoose = {"DD1K", "MM1", "MM1K", "MMC", "MMCK"};

        String getFavFruit = (String) JOptionPane.showInputDialog(
                null,
                "What fruit do you like the most?",
                "Choose Fruit",
                JOptionPane.QUESTION_MESSAGE,
                null,
                optionsToChoose,
                optionsToChoose[0]);

        System.out.println("Your chosen fruit: " + getFavFruit);
        * */
       /* } catch (ScriptException ex) {
            System.out.println(""+ex.getMessage());
        }
            //TO-DO validate useing regex and Uitlity class
            String regx = "[0-9]*";  // VaildateEmail ="[a-zA-Z]+@[a-zA-Z]+.[a-zA-Z]"
            //VaildatNumber [0-9]*(\\+|-|\\*|/)[0-9]*
            Boolean isValid = Pattern.matches(regx, "73");
            System.out.println(isValid);
            //TO-DO ploit the jFleatShart
            */
    }
    
    // by identifying a strict pattern of what is permitted and rejecting any input that does not meet it
    //so [0-9] or +,*,-,/,(,),SPACE accept and the length string is less than 20 ,
    //then send the string to eval() from javascript
   
    private static double validateNumber2(String s) throws ScriptException {
        for(int i=0;i<s.length();i++){
            if(!isAacceptedChar(s.charAt(i)))
                return -1;
        }
        if(s.length()>20)return -1;
        ScriptEngineManager scriptEngineManager = new ScriptEngineManager();
        ScriptEngine scriptEngine = scriptEngineManager.getEngineByName("JavaScript");
        // JavaScript code from String
        Object ob = scriptEngine.eval(s);
        return Double.valueOf(ob.toString());
    }
    static String accepted = " .123456789+-*/()";  //reqular exp ==>[0-9]*/[0-9]
    private static boolean isAacceptedChar(char c){
        for(int i=0;i<accepted.length();i++)
            if(accepted.charAt(i) == c)
                return true;
        return false;
    }
    
    
     //To-Do finsh the idea(recerseve methode while haveAMultiOrDvSymbol then clc and replace 11*4/2 ==> 22
     //if not clc the other opreatios like (- or +)
//    private static int haveAMultiOrDvSymbol(String s){
//        for(int i=0;i<s.length();i++){
//            if(s.charAt(i)=='/' || s.charAt(i) == '*')
//                return i;
//        }
//        return -1;       
//    }
//    
//    private static String upgradeString(String s){
//        if(haveAMultiOrDvSymbol(s) != -1)
//            
//        return s;
//        
//    }
//    private static subCalc(String s, int symbleINndex){
//        double tmp = 
//    }
//    private static int firstNumber(String s, int symbleINndex){
//        char c;
//        for(int i=symbleINndex;i>=0;--i){
//            c=s.charAt(i);
//            if(c =='+' || c =='-' || c =='/' ||c =='*'){
//                return i;
//            }
//        }
//    }
//    private static double validateNumber1(String s){
//         return -1;
//    }
    private static double validateNumber(String s){
    double number;
    s=s.trim();
        try {
            number = Double.parseDouble(s);
            return number;
        } catch (Exception e) {
           // System.err.println("Exception : "+e.getMessage());
            number = -1;
        }
        if(s.indexOf('/')!=-1 && !s.isEmpty()){
            try {
                double firstPart = Double.parseDouble(s.split("/")[0]);
                double LastPart = Double.parseDouble(s.split("/")[1]);
                number = firstPart / LastPart;                
            } catch (Exception e) {
              //  System.err.println("Exception : "+e.getMessage());
                number = -1;
            }
        }
    return number;
    }
    
}
