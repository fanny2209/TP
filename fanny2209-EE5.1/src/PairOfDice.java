

public class PairOfDice {
	private int die1;  
    private int die2;  
   
    public PairOfDice() {
        die1 = (int)(Math.random()*6) + 1;
        die2 = (int)(Math.random()*6) + 1;
    }
    
    public int getDie1() {
        return die1;
     }
    
    public int getDie2() {
        return die2;
        
     }
    public void setDie1( int val ) {
        if ( val < 1 || val > 6 )
           throw new IllegalArgumentException("Illegal dice value " + val);
        die1 = val;
     }
    public void setDie2( int val ) {
        if ( val < 1 || val > 6 )
           throw new IllegalArgumentException("Illegal dice value " + val);
        die2 = val;
     }
    
    public int getTotal() {
        return die1 + die2;
     }
    
    
    
}
