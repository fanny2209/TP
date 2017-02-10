package PairOfDice;

import java.util.Random;

public class PairOfDice {
	
	private int dice1;
	private int dice2;
	private Random rand;
	/**
	 * Constructor for PairOfDice.
	 */
	public PairOfDice(){
		rand = new Random();
		roll();
	}
	/**
	 * Roll the dices.
	 */
	public void roll(){
		dice1 = rand.nextInt(6) + 1;
		dice2 = rand.nextInt(6) + 1;
	}
	/**
	 * Getter of the dice1 values.
	 * @return Value of dice 1.
	 */
	public int getDice1(){
		return dice1;
	}
	/**
	 * Getter of the dice2 values.
	 * @return Value of dice 2.
	 */
	public int getDice2(){
		return dice2;
	}


    /**
     * Set the value of the first die. 
       * @return the dice 1
     */
    public void setDie1( int value ) {
       if ( value < 1 || value > 6 )
          throw new IllegalArgumentException("not ok value " + value);
       dice1 = value;
    }
    
    /**
     * Set the value of the first die. 
       * @return the dice 2
     */
    public void setDie2( int value ) {
       if ( value < 1 || value > 6 )
          throw new IllegalArgumentException("not ok value " + value);
       dice2 = value;
    }
    
    
	/**
	 * Get a summary of the instance.
	 * @return A summary of the instance.
	 */
	@Override 
	public String toString(){
		String res = "First dice value : ";
		res += dice1 + "\n";
		res +="Second dice value : ";
		res += dice2 + "\n";
		return res;
	}
	
	/**
	 * Print the number of tries necessary to get a snake eyes.
	 */
	public void snakeEyes(){
		int counter = 1;
		while(dice1 + dice2 != 2){
			roll();
			counter++;
		}
		String res = "To get a snake eyes, it took ";
		if(counter == 1){
			res += "only one try!";
		}else{
			res += " : " + counter + " tries.";
		}
		System.out.println(res);
	}
	/**
	 * Get the number of tries to get i.
	 * @param i number wanted.
	 * @return The number of tries to get i.
	 */
	public int count(int i){
		int count = 1;
		while(dice1 + dice2 != i){
			roll();
			count++;
		}
		return count;
	}
	
	public int getTotal() {
        return dice1 + dice2;
     }
}