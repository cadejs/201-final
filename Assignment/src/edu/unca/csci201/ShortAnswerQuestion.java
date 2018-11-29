package edu.unca.csci201;

public class ShortAnswerQuestion implements Question {

	String answer;
	String question;
	String questionprompt = "This is a short answer question please input a short answer.";
	boolean pointsawarded = false;
	
	public ShortAnswerQuestion( String question, String answer) {
		this.answer = answer;
		this.question = question;
	} 
	
	
	public String getTheQuestionText() {
		System.out.println(this.questionprompt);		
		return this.question;
	}

	@Override
	public boolean isCorrectAnswer(String answer) {
		if (this.answer.toLowerCase().equals(answer.toLowerCase())) {
			return true;
		}else {
			return false;
		}
		
	}

	@Override
	public String getCorrectAnswer() {
		
		return this.answer;
	}
	
	

}
