package edu.unca.csci201;

import java.util.Scanner;

public class Quiz {
Question[] quiz = new Question[2];
	public Question addQuestion(Question q ) {
		
		return q;
		//for (int i = 0 ;i < thearray.lenght+1; i++ ){
		//	thearray[i] = input;
		//}
		
	}
	static Scanner scan = new Scanner(System.in);
	 
	public static double giveQuiz(Question[] array) {
		double correctquestions = 0;
		//new array of wrong answers to give it to the quiz taker
		for (int i = 0 ;i < array.length; i++ ){
				System.out.println(array[i].getTheQuestionText());
				System.out.println("");
				String userinput = scan.nextLine();
				if(array[i].isCorrectAnswer(userinput)) {
					correctquestions ++;
					
				}
				
				
			}
		
		
		
		return correctquestions;
		
	}
	
}

