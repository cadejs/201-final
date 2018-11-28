package edu.unca.csci201;

import java.util.Scanner;

public class Quiz {
Question[] quiz = new Question[2];
static double correctquestions = 0;
static Question[] wrongarray = new Question[15];
	public Question addQuestion(Question q ) {
		
		return q;
		//for (int i = 0 ;i < thearray.lenght+1; i++ ){
		//	thearray[i] = input;
		//}
		
	}
	static Scanner scan = new Scanner(System.in);
	
	public static double giveQuiz(Question[] array) {
		int t = 0;
		//new array of wrong answers to give it to the quiz taker
		if(correctquestions!=0) {
			System.out.println("Here are the questions you missed.");
		//indicating quiz has already been run
			for (int i =0; i < wrongarray.length;i++) {
				if (wrongarray[i] ==  null) {
					
				}else {
			System.out.println(wrongarray[i].getTheQuestionText());
			System.out.println("");
			System.out.println(wrongarray[i].getCorrectAnswer());
			System.out.println("");
			}
			}
		} else {
		for (int i = 0 ;i < array.length; i++ ){
				System.out.println(array[i].getTheQuestionText());
				System.out.println("");
				String userinput = scan.nextLine();
				if(array[i].isCorrectAnswer(userinput)) {
					correctquestions ++;
					
				}else {
					wrongarray[t] = array[i];
					t++;
					
				}
				
				
			}
		
		
		
		
		}
		return correctquestions;
	}
}



