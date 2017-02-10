package Test;
import PairOfDice.PairOfDice;

public class exo5_1 {

    public static void main(String[] args) {
    	
        PairOfDice dice = new PairOfDice();
        int  count = 1;
        while (dice.getTotal() != 2) {
            dice.roll();
            System.out.println("The dice come up " + dice );
            count++;
        }
        
        System.out.println("\nIt took " + count + " rolls to get a 2.");
        
    	
    }
}
