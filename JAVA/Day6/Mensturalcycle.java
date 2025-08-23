public class Mensturalcycle{
	public static int getFirstPeriodDate(int date){
		return date;	
		}
	public static int getCycleLength(int firstPeriodDate, int firstPeriodDateOfNextPeriod ){
			int CycleLength = firstPeriodDate + firstPeriodDateOfNextPeriod ;
			return CycleLength;
				}
	public static int getOvulationDate(int cycleLength){
		int ovulationDate =  cycleLength - 14;
			return ovulationDate;
			}
	public static int getFlowDate(int getStopDate,int getFirstDate){
		int getFlow = getStopDate - getFirstDate;
		return  getFlow;
		}

	}