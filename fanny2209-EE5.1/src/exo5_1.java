




public class exo5_1 {

    public static void main(String[] args) {
    	
        PairOfDice dice = new PairOfDice();
        int  rollCount = 1;
        
       while (dice.getTotal() != 2) {
            dice= new PairOfDice();
            rollCount++;
        }    
        
        System.out.println("\nIt took " + rollCount + " rolls to get a 2.");
        
    	
    }
}
