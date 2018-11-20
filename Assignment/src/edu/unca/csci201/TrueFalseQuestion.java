package edu.unca.csci201;

public class TrueFalseQuestion implements Question {

	String question;
	String correctanswer;
	
	public TrueFalseQuestion(String question , String correctanswer ){
		this.question = question;
		this.correctanswer = correctanswer;
	}
	
	@Override
	public String getTheQuestionText() {
		
		return question;
	}

	@Override
	public boolean isCorrectAnswer(String answer) {
		if (this.correctanswer.equals(answer)) {
			return true;
		}else {
			return false;
		}
		
	}

	@Override
	public String getCorrectAnswer() {
		
		return this.correctanswer;
	}

}
