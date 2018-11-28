package edu.unca.csci201;

public class TrueFalseQuestion implements Question {

	String question;
	String correctanswer;
	boolean canswer = false;
	boolean pointsawarded = false;
	
	public TrueFalseQuestion(String question , String correctanswer ){
		this.question = question;
		this.correctanswer = correctanswer;
		if (this.correctanswer.equals("true")) {
			canswer=true;
		}
	}
	
	@Override
	public String getTheQuestionText() {
		
		return question;
	}

	@Override
	public boolean isCorrectAnswer(String answer) {
		if (this.correctanswer.equals(answer)) {
			this.pointsawarded = true;
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
