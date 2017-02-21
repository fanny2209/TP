import java.util.Scanner;
import java.util.TreeSet;

import TreeSet.SetCalculator;

public class Test {
	public static void main(String[] args) {
		SetCalculator calculator = new SetCalculator();
		//Scanner sc = new Scanner(System.in);
		
	
		TreeSet<Integer> set1 = new TreeSet<Integer>();
		set1.add(1);
		set1.add(2);
		set1.add(3);
		set1.add(4);
		
		TreeSet<Integer> set2 = new TreeSet<Integer>();
		set2.add(1);
		set2.add(2);
		set2.add(5);
		set2.add(6);

		calculator.setSet1(set1);
		calculator.setSet2(set2);
		System.out.println(calculator.toString());
		
		TreeSet<Integer> resultTest = new TreeSet<Integer>();
		System.out.println(resultTest=calculator.operation('+'));
		System.out.println(resultTest=calculator.operation('-'));
		System.out.println(resultTest=calculator.operation('*'));

	}
}
