package QuizzUtils;



public class AdditionQuestion implements IntQuestion {
	private int a;
	private int b;

	/**
	 * COntstructior
	 * @param null
	 * 
	 */
	public AdditionQuestion() { 
		a = (int)(Math.random() * 10 + 1);
		b = (int)(Math.random() * 10);
	}

	/**
	 * getteur
	 * @return string question type
	 */
	public String getQuestion() {
		return "What is " + a + " + " + b + " ?";
	}

	/**
	 * getteur
	 * @return string answer 
	 */
	public int getCorrectAnswer() {
		return a + b;
	}
}

