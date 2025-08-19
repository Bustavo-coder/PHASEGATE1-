public class SecondTask{
	public static char getGrade(int score1,int score2, int score3){
		int average = (score1 + score2 + score3) / 3;
			char grade  = '1';
			if (average >= 90  && average <= 100) grade = 'A';
			else if (average >= 80  && average < 90) grade = 'B';
			else if (average >= 70 && average < 80) grade = 'C';
			else if (average >= 60 && average < 70) grade = 'D';
			else if (average >= 0 && average < 60) grade = 'F';ra
			else 
			return grade;

		}



	}