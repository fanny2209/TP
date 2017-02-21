package TreeSet;

import java.util.TreeSet;

/**
 * @author jammfa16
 *For this exercise, you should write a program that can be used as a "set calculator" for simple operations on sets of non-negative integers. (Negative integers are not allowed.) A set of such integers will be represented as a list of integers, separated by commas and, optionally, spaces and enclosed in square brackets. For example: [1,2,3] or [17, 42, 9, 53, 108]. The characters +, *, and - will be used for the union, intersection, and difference operations. The user of the program will type in lines of input containing two sets, separated by an operator. The program should perform the operation and print the resulting set.
 */
public class SetCalculator {

	

	
	private TreeSet<Integer> set1;
	private TreeSet<Integer> set2;
	private Character operation;

	
	/**
	 * @param set1
	 * @param set2
	 * @param operation
	 */
	public SetCalculator(TreeSet<Integer> set1, TreeSet<Integer> set2, Character operation) {
		super();
		this.set1 = set1;
		this.set2 = set2;
		this.operation = operation;
	}
	
	/**
	 * constructor by default
	 */
	public SetCalculator() {
		
	}
	
	@Override
	public String toString() {
		return "SetCalculator [set1=" + set1 + ", set2=" + set2 + ", operation=" + operation + "]";
	}
	
	/**
	 * Method that takes two sets and returns the set representing their 
	 * intersection
	 * @param set1 the first set
	 * @param set2 the second set
	 * @return the intersection of the two sets
	 */
	private TreeSet<Integer> intersection() {	
		set1.retainAll(set2);
		return set1;
	}

	/**
	 * Method that takes two sets and returns the set representing their
	 * union
	 * @param set1 the first set
	 * @param set2 the second set
	 * @return the union of the two sets
	 */
	private TreeSet<Integer> union() {
		set1.addAll(set2);
		return set1;
	}

	/**
	 * Method that takes two sets and returns the set representing the
	 * subtraction of the second set from the first
	 * @param set1 the first set
	 * @param set2 the second set
	 * @return the subtraction of the second set from the first
	 */
	private TreeSet<Integer> subtraction() {
		set1.removeAll(set2);
		return set1;
	}

	public TreeSet<Integer> operation(Character operation) {
		switch (operation) {
		case '+':
			return this.union();
		case '-':
			return this.subtraction();
		case '*':
			return this.intersection();
		default:
		}
		return new TreeSet<Integer>();
	}
	
	public TreeSet<Integer> getSet1() {
		return set1;
	}

	public void setSet1(TreeSet<Integer> set1) {
		this.set1 = set1;
	}

	public TreeSet<Integer> getSet2() {
		return set2;
	}

	public void setSet2(TreeSet<Integer> set2) {
		this.set2 = set2;
	}

	public Character getOperation() {
		return operation;
	}

	public void setOperation(Character operation) {
		this.operation = operation;
	}

}

