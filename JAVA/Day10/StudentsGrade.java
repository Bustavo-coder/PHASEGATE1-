 import java.util.*;
public class StudentsGrade{
	public static Scanner input = new Scanner(System.in);
	public static ArrayList<Integer> getPosition = new ArrayList<Integer>();
	public static void main(String [] args){
		System.out.println("How Many Students do You Have");
		int amountOfStudents = input.nextInt();
		System.out.println("How Many Subject Do They Offer");
		int amountOfSubjects = input.nextInt();
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>\nSaved Succesfully");

		int [][]studentsScore = new int [amountOfStudents][amountOfSubjects];
		collectScoreOfStudent(studentsScore); // loop to collectScores

		int [] getTotalScoreOfStudents =  getTotalScoreOfEachStudent(studentsScore);
		double [] getAverageOfStudent = getAverageScoreOfEachStudent(studentsScore);
		int [] sorted = sortArrray(getTotalScoreOfStudents);
		for(int element = 0; element < sorted.length;element++) getPosition.add(sorted[element]); //Passing the sortedArray to an arrayListTo Get Position
		



		printHeader(amountOfSubjects);
	//Displaying Table
		int displayIndex = 1;
		for(int count = 0; count < studentsScore.length;count++){
				System.out.printf("%30s%d","Student",displayIndex);
			for(int counter = 0; counter < studentsScore[count].length;counter++){
				System.out.print("\t ");
				System.out.print(studentsScore[count][counter]);
						}

				System.out.print("\t ");
				System.out.print(getTotalScoreOfStudents[count]);
				System.out.print("\t ");
				System.out.print(getAverageOfStudent[count]);
				System.out.print("\t ");

				// storing each sorted element in an array to 
				int totalScore = sorted[count]
				int position = getPosition.indexOf(totalScore) + 1;
				System.out.print(position );
				System.out.print("\n");
				displayIndex++;
					}
			
		

			}

	public static int calculateTotalScoreOfStudents(int [] arrayScores){
		int total = 0;
		for(int score :  arrayScores) total+= score;
			return total;
			}

	public static double calculateAverageScore(int [] arrayScore){
		double avergeScore = calculateTotalScoreOfStudents(arrayScore) /arrayScore.length ;
			return avergeScore;
				}
	

	public static void collectScoreOfStudent(int [] [] studentsScore ){
			for(int count = 0 ; count < studentsScore.length;count++){
				System.out.println("Enter the score input for Student " + (count + 1));
			for(int counter = 0; counter < studentsScore[count].length; counter++){
					System.out.println("Enter the score input for Subject " + (counter + 1));
					int subjectScore = input.nextInt();
					if(subjectScore <= 0 || subjectScore > 100){
					while(true){
					System.out.println("Invalid Score Must Not Be Less Than 1 and greater than 100");
					System.out.println("Enter the score input for Subject " + (counter + 1));
					subjectScore = input.nextInt();
					if(subjectScore > 0 && subjectScore <= 100) break;
						}
							}
					studentsScore[count][counter] = subjectScore;
						}
					}
				}

	public static int [] getTotalScoreOfEachStudent(int [] [] studentsScore ){
			int [] totalScore = new int [studentsScore.length];
			for(int count = 0; count < totalScore.length;count++){
			totalScore[count] = calculateTotalScoreOfStudents(studentsScore[count]);
			getPosition.add(calculateTotalScoreOfStudents(studentsScore[count]));
					}
			return totalScore;
				}

	public static double [] getAverageScoreOfEachStudent(int [] [] studentsScore ){
			double [] getAverageScore = new double[studentsScore.length];
			for(int count = 0; count < getAverageScore.length;count++){
			double avregeScores = calculateAverageScore(studentsScore[count]);
			getAverageScore[count] = avregeScores;
					}
			return getAverageScore;
				}

		public static void printHeader(int length){
			System.out.printf("%s","==================================================================================================\n");
			System.out.printf("%30s","STUDENT\t");
			int dis = 1;
			for(int count = 0; count < length;count++){
			System.out.printf("%s%d\t", "Sub",dis);
					dis++;
					}
			System.out.printf("%s\t%s\t%s\n", "Tot","Ave","POS");
			System.out.printf("%s","==================================================================================================\n");
				}

		public static int [] sortArrray(int [] position){
				int store = 0;	
				int [] newArray = new int[position.length];
				for(int count = 0; count < position.length;count++){
					for(int counter = 0; counter < position.length;counter++){
							if( position[count] > position[counter]){
									store = position[count];
									position[count] = position[counter];
									position[counter] = store;
								}
							}
					newArray[count] =  position[count];
						}
				return newArray;
				}

		


	
	}
	
