package Test;


import java.util.Scanner;

import javax.swing.plaf.synth.SynthSpinnerUI;

import CalcUtils.StatCalc;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
				StatCalc  calc;   
		calc = new StatCalc();
		double nb;
				do {
					System.out.print("? ");
					nb = sc.nextDouble();
					if (nb != 0)
						calc.enter(nb);
				} while (nb != 0);

		System.out.println("\nStatistics about your calc:\n");
		System.out.println("   Count:              " + calc.getCount());
		System.out.println("   Sum:                " + calc.getSum());
		System.out.println("   Minimum:            " + calc.getMin());
		System.out.println("   Maximum:            " + calc.getMax());
		System.out.println("   Average:            " + calc.getMean());
		System.out.println("   Standard Deviation: " + calc.getStandardDeviation());

	}

}
