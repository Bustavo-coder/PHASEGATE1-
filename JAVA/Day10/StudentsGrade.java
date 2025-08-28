 import java.util.*;
public class StudentsGrade{
	public static Scanner input = new Scanner(System.in);
	public static void main(String [] args){
		System.out.println("How Many Students do You Have");
		int amountOfStudents = input.nextInt();
		System.out.println("How Many Subject Do They Offer");
		int amountOfSubjects = input.nextInt();
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>\nSaved Succesfully");

		int [][]studentsScore = new int [amountOfStudents][amountOfSubjects];
		collectScoreOfStudent(studentsScore);

		int [] getTotalScoreOfStudents =  getTotalScoreOfEachStudent(studentsScore);
		double [] getAverageOfStudent = getAverageScoreOfEachStudent(studentsScore);
		double []  sorted = sortArray(getAverageOfStudent);



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
					studentsScore[count][counter] = subjectScore;
						}
					}
				}

	public static int [] getTotalScoreOfEachStudent(int [] [] studentsScore ){
			int [] totalScore = new int [studentsScore.length];
			for(int count = 0; count < totalScore.length;count++){
			totalScore[count] = calculateTotalScoreOfStudents(studentsScore[count]);
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

		public static double [] sortArray(double [] array){
			double store = 0;
			for(int count = 0; count < array.length;count++){
				for(int counter = count ; counter < array.length;counter++){
						if(array[count] < array[counter]){
							store = array[count];
							array[count] = array[counter];	
							array[counter] = store;
							}
				
						}
					}
				return  array;
				}

	}
	
