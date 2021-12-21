package queueproject;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

public final class validateUserInput {
    public static double validateNumber(String s) {
        for(int i=0;i<s.length();i++){
            if(!isAacceptedChar(s.charAt(i)))
                return -1;
        }
        if(s.length()>20)return -1;
        ScriptEngineManager scriptEngineManager = new ScriptEngineManager();
        ScriptEngine scriptEngine = scriptEngineManager.getEngineByName("JavaScript");
        // JavaScript code from String
        try {
        Object ob = scriptEngine.eval(s);
        return Double.valueOf(ob.toString());
        } catch (Exception e) {
        }
        return -1;
    }
    private static String accepted = " .0123456789+-*/()";  //reqular exp ==>[0-9]*/[0-9]
    private static boolean isAacceptedChar(char c){
        for(int i=0;i<accepted.length();i++)
            if(accepted.charAt(i) == c)
                return true;
        return false;
    }
}
