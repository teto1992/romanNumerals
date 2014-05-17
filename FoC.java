package foc;

/**
 *
 * @author Stefano
 */
public class FoC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String in = "MDCCCI";
        
        state dead = new state();
        
        //DFA from I to IX
        state o1 = new state();
        state o2 = new state();
        state o3 = new state();
        state o4 = new state();
        state o5 = new state();
        state o6 = new state();
        
        o1.stateSet(true, o2, o4, o4, dead, dead, dead, dead );
        o2.stateSet(true, o3, dead, dead, dead, dead, dead, dead);
        o3.stateSet(true, dead, dead, dead, dead, dead, dead, dead);
        o4.stateSet(true, dead, dead, dead, dead, dead, dead, dead);
        o5.stateSet(true, o6, dead, dead, dead, dead, dead, dead);
        o6.stateSet(true, o2, dead, dead, dead, dead, dead, dead);
        
        //DFA from X to XCIX
        state q1 = new state();
        state q2 = new state();
        state q3 = new state();
        state q4 = new state();
        state q5 = new state();
        state q6 = new state();
        
        q1.stateSet(true, o1, o5, q2 , q4, q4, dead, dead);
        q2.stateSet(true, o1, o5, q3, dead, dead, dead, dead);
        q3.stateSet(true, o1, o5, dead, dead, dead, dead, dead);
        q4.stateSet(true, o1, o5, dead, dead, dead, dead, dead);
        q5.stateSet(true, o1, o5, q6, dead, dead, dead, dead);
        q6.stateSet(true, o1, o5, q2, dead, dead, dead, dead);
        
        //DFA from C to CMXCIX
        state p1 = new state();
        state p2 = new state();
        state p3 = new state();
        state p4 = new state();
        state p5 = new state();
        state p6 = new state();
        
        p1.stateSet(true, o1, o5, q1, q5, p2, p4, p4);
        p2.stateSet(true, o1, o5, q1, q5, p3, dead, dead);
        p3.stateSet(true, o1, o5, q1, q5, dead, dead, dead);
        p4.stateSet(true, o1, o5, q1, dead, dead, dead, dead);
        p5.stateSet(true, o1, o5, q1, q5, p6, dead, dead);
        p6.stateSet(true, o1, o5, q1, q5, p2, dead, dead);
        
        //DFA from M to MMMCMXCIX
        state m1 = new state();
        state m2 = new state();
        state m3 = new state();
        state m4 = new state();
        
        m1.stateSet(false, o1, o5, q1, q5, p1, p5, m2);
        m2.stateSet(true, o1, o5, q1, q5, p1, p5, m3);
        m3.stateSet(true, o1, o5, q1, q5, p1, p5, m4);
        m4.stateSet(true, o1, o5, q1, q5, p1, p5, dead);
                 
        char[] input = in.toCharArray();
        state actual = m1;
        
        for (char c: input){
          if(!actual.dead())
               actual = actual.nextState(c);
        }
        
      
          System.out.println(actual.accept());
            
           
       
    }
}
