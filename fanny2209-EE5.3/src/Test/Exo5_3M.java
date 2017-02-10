package Test;

import CalcUtils.StatCalc;
import PairOfDice.PairOfDice;

/**
 * @author jammfa16
 *
 */
public class Exo5_3M {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PairOfDice dice = new PairOfDice();
		System.out.println(dice.toString());
		StatCalc stat;
		System.out.println("Dice		Average			Deviation");
		for(int i = 2 ; i < 13 ; i++){
			stat = new StatCalc();
			Runit10000(i, dice, stat);
			//System.out.println(stat.toString());
			String res = "";
			try{
				res += i + "            ";
				res += stat.getMean() + "               "; // aff average as gravity center
				res += stat.getStandardDeviation();
				
			} 
			catch (Exception exception){
				res += exception.getMessage() + "\nError of the total of dices ";
				res += i;
			}
			System.out.println(res);
		}
	}
	/**
	 * Fill the StatCalc with 10000 experiments of getting to the target.
	 * @param int nb the number i want to check
	 * @param dice Dices use to initialize my dices
	 * @param stat StatCalc to do all calcul.
	 */
	private static void Runit10000(int nb, PairOfDice dice, StatCalc stat){
		for (int i = 0 ; i < 10000 ; i++){
			int count = dice.count(nb);
			stat.enter(count);
		}
	}


}
