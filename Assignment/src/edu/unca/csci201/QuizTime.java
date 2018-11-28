package edu.unca.csci201;

import java.util.Scanner;

public class QuizTime {
	//create twenty-five question
	//test one of each type of each questions methods
	//create the array of 25
	//figure out how to add questions to array
	
	public static void main(String[] args) {
		//create all of the questions here
		String cade;
		ShortAnswerQuestion s1 = new ShortAnswerQuestion("what famous trilogoy(now expanded) was centered around a new branch of predictive mathematics that could predict the fall of intergalatic emprires?", "The Foundation");
		ShortAnswerQuestion s2 = new ShortAnswerQuestion("What book by Issac Asimov shares a name with a featuring Will Smith?", "I Robot");
		ShortAnswerQuestion s3 = new ShortAnswerQuestion("In Douglas Adams Hitch Hikers Guide to Galaxy what is the meaning of life?", "42");
		ShortAnswerQuestion s4 = new ShortAnswerQuestion("In the third sequel to the Hitch Hiekrs Guide to the Galaxy what animal serves itself in the restraunt at the end of the galaxy?", "a cow");
		ShortAnswerQuestion s5 = new ShortAnswerQuestion("The story Dune was based on the fall of what emprire? ", "The roman");
		
		MultipleChoiceQuestion q1 = new MultipleChoiceQuestion("Who wrote left hand of darkness? ","Le Guin","Harvey","sam","me");
		MultipleChoiceQuestion q2 = new MultipleChoiceQuestion("Which movie staring Natalie Portman recently dealth with mutating bears ","Annihilation","twilight","Rocky VII","Paddington the Bear");
		MultipleChoiceQuestion q3 = new MultipleChoiceQuestion("The movie Brazil, showcases which young actor who is killed by being engulfued by buracratic forms ? ","Deniro","Freeman","Cummberbatch","DeVito");
		MultipleChoiceQuestion q4 = new MultipleChoiceQuestion("What actual city is the fictional character Ender in Enders Game from? ","Greensboro","Asheville","Wake Forest","Durham");
		MultipleChoiceQuestion q5 = new MultipleChoiceQuestion("What is the genere of science fiction that attempts to only use proved or theoretically possible science? ","Hard Scienct Fiction","I swear its true science fiction","Boolean Fiction","Nerd Fiction");
		
		TrueFalseQuestion t1 = new TrueFalseQuestion("In Enders Game the small friend of ender is known as Bean.", "true");
		TrueFalseQuestion t2 = new TrueFalseQuestion("Pendragon is a series of book focusing on the writing of a mutated lizard." , "false");
		TrueFalseQuestion t3 = new TrueFalseQuestion("The Mule is a character from The Foundation who is really ugly so no one bothers him and thats why he is strong." , "false");
		TrueFalseQuestion t4 = new TrueFalseQuestion("The first animated french movie was a science fiction piece called \"The Fantastic Planet\""  , "true");

		TrueFalseQuestion t5 = new TrueFalseQuestion("Bonus: If the case of a goverment collapse the supreme court will be transported to Asheville, North Caroline" , "true");

		q1.getTheQuestionText();
	Scanner scan = new Scanner(System.in);
	 cade = scan.nextLine();
if(q1.isCorrectAnswer(cade)==true) {
	System.out.println("nice");
}



	}

	

}
