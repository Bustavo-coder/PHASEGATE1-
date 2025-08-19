public class task_three{
	public static String getAmountOfLikes(String [] arrayName){
		String feedBack = "";
		if (arrayName.length == 0) feedBack = "No One Like This";
		if (arrayName.length == 1) feedBack = arrayName[0] + " Like This";
		if (arrayName.length == 2)  feedBack = arrayName[0] + " , " + arrayName[1] + " Likes This";
		if (arrayName.length == 3)  feedBack = arrayName[0] + " , " + arrayName[1] +" and " + arrayName[2] + " Likes This";
		if (arrayName.length > 3)  feedBack = arrayName[0] + ", " + arrayName[1] +" and " + (arrayName.length - 2) + " Likes This";
			return feedBack;

			}


	}