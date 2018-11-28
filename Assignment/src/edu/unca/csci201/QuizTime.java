package edu.unca.csci201;

import java.text.DecimalFormat;

public class QuizTime {
	//create twenty-five question
	//test one of each type of each questions methods
	//create the array of 25
	//figure out how to add questions to array
	
	public static void main(String[] args) {
		//create all of the questions here //go back and spell check
		double quizgrade = 0;
		DecimalFormat df = new DecimalFormat("#0.##");
		
		
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

		Question[] quizarray = new Question[15];
		quizarray[0] = s1;
		quizarray[1] = s2;
		quizarray[2] = s3;
		quizarray[3] = s4;
		quizarray[4] = s5;
		quizarray[5] = q1;
		quizarray[6] = q2;
		quizarray[7] = q3;
		quizarray[8] = q4;
		quizarray[9] = q5;
		quizarray[10] = t1;
		quizarray[11] = t2;
		quizarray[12] = t3;
		quizarray[13] = t4;
		quizarray[14] = t5;
		
		quizgrade = Quiz.giveQuiz(quizarray);
		System.out.println("You got a " + df.format(quizgrade/quizarray.length*100) + "%");
		
		//System.out.println(quizarray[1].getClass().);


	}

	

}
