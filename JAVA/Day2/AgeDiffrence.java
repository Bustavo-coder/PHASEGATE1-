public class AgeDiffrence{
	public int getageDiffrence(int fathersAge , int secondAge){
		int diffrence = 0;
		if (fathersAge < 0 || secondAge < 0) {diffrence = 0;}
		else{
		if ( fathersAge > 2 * secondAge) diffrence = fathersAge - 2 * secondAge;
		if ( fathersAge < 2 * secondAge) diffrence = 2 * secondAge - fathersAge;
		if (fathersAge  == 2 * secondAge) diffrence = 0;
		}
		return diffrence;
		
	}


	}