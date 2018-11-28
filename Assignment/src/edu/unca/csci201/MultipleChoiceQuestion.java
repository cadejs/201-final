package edu.unca.csci201;

import java.util.Random;

public class MultipleChoiceQuestion implements Question {
	String question;
	String correctanswer;
	String answer1;
	String answer2;
	String answer3;
	String correctletter;
	String answer1letter;
	String answer2letter;
	String answer3letter;
	//String returnanswer;
	
	int numchoser;
	boolean pointsawarded = false;
	Random rand = new Random();
	
	public MultipleChoiceQuestion(String question,String CorrectAnswer, String answer1, String answer2, String answer3) {
		this.question = question;
		this.correctanswer = CorrectAnswer;
		this.answer1 = answer1;
		this.answer2 = answer2;
		this.answer3 = answer3;
		numchoser = rand.nextInt(4)+1;
		//switch to set up generator to put questions answer choices in a random order
		switch(numchoser) {
		case 1: this.correctletter="a";
		this.answer1letter = "b";
		this.answer2letter = "c";
		this.answer3letter = "d";
		break;
		case 2: this.correctletter="b";
		this.answer1letter = "a";
		this.answer2letter = "c";
		this.answer3letter = "d";
		break;
		case 3: this.correctletter="c";
		this.answer1letter = "a";
		this.answer2letter = "b";
		this.answer3letter = "d";
		break;
		case 4: this.correctletter="d";
		this.answer1letter = "a";
		this.answer2letter = "b";
		this.answer3letter = "c";
		break;
		}
		
		
	}

	public String getTheQuestionText() {
		System.out.println(this.question);
		//System.out.println("what is the correct answer choice?");
		//using a switch to make sure the answers come out in the right order
		switch (this.numchoser) {
		case 1:
		System.out.println(this.correctletter + ": \t" + this.correctanswer);
		System.out.println(this.answer1letter + ": \t" + this.answer1 );
		System.out.println(this.answer2letter + ": \t" + this.answer2 );
		System.out.println(this.answer3letter + ": \t" + this.answer3 );
		break;
		case 2:
			System.out.println(this.answer1letter + ": \t" + this.answer1 );
			System.out.println(this.correctletter + ": \t" + this.correctanswer);
			System.out.println(this.answer2letter + ": \t" + this.answer2 );
			System.out.println(this.answer3letter + ": \t" + this.answer3 );
			break;
		case 3:
			System.out.println(this.answer1letter + ": \t" + this.answer1 );
			System.out.println(this.answer2letter + ": \t" + this.answer2 );
			System.out.println(this.correctletter + ": \t" + this.correctanswer);
			System.out.println(this.answer3letter + ": \t" + this.answer3 );
			break;
		case 4:
			System.out.println(this.answer1letter + ": \t" + this.answer1 );
			System.out.println(this.answer2letter + ": \t" + this.answer2 );
			System.out.println(this.answer3letter + ": \t" + this.answer3 );
			System.out.println(this.correctletter + ": \t" + this.correctanswer);
			break;
		}
		
		return "";
	}

	@Override
	public boolean isCorrectAnswer(String answer) {
		if(this.correctletter.toLowerCase().equals(answer.toLowerCase())) {
			this.pointsawarded = true;
			
			return true;
		}else {
			return false;
		}
		
		
	}

	@Override
	public String getCorrectAnswer() {
		System.out.print("The correct answer is : ");
		return (this.correctletter +":\t" + this.correctanswer);
		
		
	}

	
	
}
