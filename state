package foc;

/**
 *
 * @author Stefano
 */
public class state {
   
    private state outputI;
    private state outputV;
    private state outputX;
    private state outputL;
    private state outputC;
    private state outputD;
    private state outputM;
    
    boolean accepting;
    boolean dead;
    
    
    public state(){
        dead = true;
        accepting = false;
    }
    
    public void stateSet ( boolean b, state oI, state oV, state oX, state oL, state oC, state oD, state oM){
        
        //name = n;
        accepting = b;
        dead = false;
        
        outputI = oI;
        outputV = oV;
        outputX = oX;
        outputL = oL;
        outputC = oC;
        outputD = oD;
        outputM = oM;
        
    }
    
    public boolean accept(){
        return accepting;
    } 
    
     public boolean dead(){
        return dead;
    } 
    
    public state nextState(char i) {

        switch (i) {
            case 'I':   return outputI;
            case 'V':   return outputV;
            case 'X':   return outputX;
            case 'L':   return outputL;
            case 'C':   return outputC;
            case 'D':   return outputD;
            case 'M':   return outputM;  
            default:    return new state();
        }

}
    
}
