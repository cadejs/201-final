package edu.unca.csci201;

import java.util.Scanner;

public class QuizTime {
	
	public static void main(String[] args) {
		//create all of the questions here
		String cade;
		ShortAnswerQuestion s1 = new ShortAnswerQuestion("what famous trilogoy(now expanded) was centered around a new branch of predictive mathematics that could predict the fall of intergalatic emprires?", "The Foundation");
		MultipleChoiceQuestion q1 = new MultipleChoiceQuestion("Who wrote left hand of darkness? ","Le Guin","Harvey","sam","me");
		TrueFalseQuestion t1 = new TrueFalseQuestion("In Enders Game the small friend of ender is known as Bean.", "true");
		System.out.print(t1);
		q1.getCorrectAnswer();
		q1.getTheQuestionText();
	Scanner scan = new Scanner(System.in);
	 cade = scan.nextLine();
if(q1.isCorrectAnswer(cade)==true) {
	System.out.println("nice");
}
System.out.println(q1.correctletter);	
System.out.println(q1.correctletter.equals(cade));

	}

	

}
