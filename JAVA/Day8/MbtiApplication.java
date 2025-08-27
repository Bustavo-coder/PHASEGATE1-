import java.util.Scanner;
public class MbtiApplication{
	public static Scanner input = new Scanner(System.in);
	public static String [] []  listOfQuestions = {	
				{"0 .>>> Expend Energy, enjoy groups", "1.>>> Conserve energy,enjoy one-on-one"},
				{"0 .>>> Interpret Literally", "1.>>>Looking for Meaning,and Possibilities"},
				{"0 .>>> Logical Thinking , Questioning", "1.>>> Empathetic Feeling , and Accomodating"},
				{"0 .>>> Organized, Orderly", "1.>>> Flexible, Adaptable"},
				{"0 .>>> More Outgoing, Think out loud", "1.>>> More Reserved, Think To Yourself"},
				{"0 .>>> Practical, Realistic, Experiential", "1.>>> Imaginative, Innovative, Theoretical"},
				{"0 .>>>  Candid, Straight Forward, Frank", "1.>>>  Tactful, Kind, Encouraging"},
				{"0 .>>> Plan, Schedule", "1.>>> Unplanned, Spontaneous"},
				{"0 .>>> Seek Many Tasks, Public Activities, Interaction With Others", "1.>>>Seek Private, Solitary Activities With Quiet to Concentrate"},
				{"0 .>>> Standard, Usual, Conventionals", "1.>>> Different, Novel, Unique"},
				{"0 .>>> Firm, tend to Criticize, hold the line", "1.>>> Gentle, Tend to Appreciate, Conciliate"},
				{"0 .>>> Regulated, Structured", "1.>>> Easy-Going, Live and Let Live"},
				{"0 .>>>External, Communicative, Express Yourselfs", "1.>>> Internal, Reticent, Keep to Yourself"},
				{"0 .>>> Focus on here-and-now", "1.>>> Look to The Future, Global Perspective, Big picture"},
				{"0 .>>> Tough-Minded, Just", "1.>>> Tender-hearted, merciful"},
				{"0 .>>>Preparation, Plan Ahead", "1.>>> Go With the Flow, Adapt as you Go"},
				{"0 .>>> Active, Initiate", "1.>>> Reflective, Deliberate"},
				{"0 .>>> Facts, Things, What Is", "1.>>> Ideas, Dreams, What Could Be"},
				{"0 .>>> Matter of Fact, Issue-Oriented", "1.>>> Sensitive, People-Oriented"},
				{"0 .>>>Control, Govern", "1.>>>Latitude, Freedom"},
				};
	public static void main(String [] args){
			String personality = DisplayuserChoice();
			System.out.println(personality);
			}
		

				
	public static char getInput(){
		char userInput = input.next().charAt(0);
		return userInput;
			}
	
	public static char validateUserInput(char userPrompt){
			while(true){
				if(userPrompt == '0' || userPrompt == '1') break;
				else {
					System.out.println("Expected 0 or 1 as Response,\n I Know this is an Error Please Try again");
					userPrompt = input.next().charAt(0);
					}
			
				}
			return userPrompt;
		}
	public static char[] displayquestionandStoreResponse(String [] [] qustions){
		char [] storeResponse = new char[qustions.length];
			for(int count = 0 ; count < qustions.length;count++){
				for (String object : qustions[count]) System.out.println(object);
				System.out.println("Choose 0 or 1 ");
				char response = getInput();
				char validRespnse = validateUserInput(response);
				storeResponse[count] = validRespnse;
					}
			return storeResponse;
	}
	
	public static String getPersonality(int score1,int score2,char firstPersnality,char seconpersonalty){
			String personality = "";
			if(score1 > score2) personality += firstPersnality;
			else  personality  += seconpersonalty;
			return personality;
			}

	public static String DisplayuserChoice(){
			System.out.println("Enter Your Name");
			String userName = input.next();
			char [] response = displayquestionandStoreResponse(listOfQuestions);
			System.out.printf("%s%s%n", userName , " Your Choices are");
			String personality = "";
			for(int count = 0; count < 4;count++){
				int option_0 = 0; int option_1 = 0;
				for(int counter = count; counter < listOfQuestions.length; counter+=4){
						System.out.println( listOfQuestions[counter][(response[counter] - '0')]);
						if(response[counter] == '0') option_0++;
						else option_1++;
						}
					if(count == 0) personality += getPersonality(option_0++,option_1 ,'E', 'I');
					if(count == 1) personality += getPersonality(option_0++,option_1 ,'S', 'N');
					if(count == 2) personality += getPersonality(option_0++,option_1 ,'T', 'F');
					if(count == 3) personality += getPersonality(option_0++,option_1 ,'J', 'P');
					System.out.printf("%s%d%s%n", "You picked Number 0 ", option_0 , " Times");
					System.out.printf("%s%d%s%n", "You picked Number 1 " ,option_1 , " Times");
				}
		
				return personality;
			}


}