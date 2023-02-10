package model;

/**
 * @author stephaniesink - sisink
 * CIS175 - Spring 2022
 * Feb 6, 2023
 */
public class TruthOrDare {
	String truth;
	String dare;
	String answer;
	

	//no-arg default constructor
	public TruthOrDare() {
		super();
	}
	
	//constructor with parameters
	public TruthOrDare(String answer) {
		this.answer = answer; 
	}
	
	//getters and setters
	public String getTruth() {
		return "I am taking Java II";
	}
	public void setTruth(String truth) {
		this.truth = truth;
	}
	public String getDare() {
		return "I dare you to give me a 50/50";
	}

	public void setDare(String dare) {
		this.dare = dare;
	}
	
	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}
	
	//helper method
	public String setChoice(String answer) {	
		if(answer.equals ("truth")) {
			return getTruth();
		}
		else if (answer.equals ("dare")){
			return getDare();
		}
		else {
			return "Try Again";
		}
	}

}
