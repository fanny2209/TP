import java.util.Scanner;


/**
 * @author Fanny
 *
 */
public class exo4_3M{
	/**
	 * @param nb The number represent the sum of 2 dice needed
	 * @return how many times did we rolled the dice to achieve the snakes eyes 
	 * @throws IllegalArgumentException If we don't have a numer wich represent a number of a dice valid
	 */
	public static int SimulateRolling(int nb){
		if(nb<2 || nb> 12){
			throw new IllegalArgumentException("You must indicate a number between 2 and 12.");		
		}

		int de1=0;
		int de2=0;
		int SnakeEyeGoal=0;

		while ((de1+de2)!=nb){
			de1=(int)(Math.random()*6)+1; //(max-min)+min avec borne min incluse max exclue
			de2=(int)(Math.random()*6)+1;
			SnakeEyeGoal++;
		}
		return SnakeEyeGoal;
	}
	
/**
 * Write a function that simulates rolling a pair of dice until the total on the dice comes up to be a given number. The number that you are rolling for is a parameter to the function. The number of times you have to roll the dice is the return value of the function. The parameter should be one of the possible totals: 2, 3, ..., 12. The function should throw an IllegalArgumentException if this is not the case. Use your function in a program that computes and prints the number of rolls it takes to get snake eyes. (Snake eyes means that the total showing on the dice is 2.)
 * 
 */

	public static void main(String[] args) {
		System.out.println("Enter your number");
		Scanner sc= new Scanner(System.in);
		int nb=sc.nextInt();
		int SNG=SimulateRolling(nb);
		System.out.println("We rolled "+SNG+" for getting your number man !" );
		
	}

}
