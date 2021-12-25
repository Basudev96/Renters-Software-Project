package commoncode;

public class Validation {
    static public void onlyDigitAllowed(java.awt.event.KeyEvent evt) {                           
        char c=evt.getKeyChar();
        if(!Character.isDigit(c)){
            evt.consume();
        }
    }
    static public void onlyAlphabateAllowed(java.awt.event.KeyEvent evt){
        char c=evt.getKeyChar();
        if((!Character.isAlphabetic(c))&& !(c==' ')){
            evt.consume();
        }
    }
    
}
