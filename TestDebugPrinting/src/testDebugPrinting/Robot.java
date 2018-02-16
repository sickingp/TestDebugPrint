package testDebugPrinting;

public class Robot extends BaseRobot {
	private int myCompetitionYear;
	
	public Robot(String name, int competitionYear) {
		super(name);
		myCompetitionYear = competitionYear;
	}
	
	public String toString() {
		String objectString;
		objectString = super.toString();
		objectString += "\nCompetition Year == " + myCompetitionYear;
		return objectString;
	}

}
