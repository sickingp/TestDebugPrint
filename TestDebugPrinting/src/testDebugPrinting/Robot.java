package testDebugPrinting;

// Explain why the Robot class is so important as a base class for all Robots

public class Robot extends BaseRobot {
	private int myCompetitionYear;
	
	public Robot(String name, int competitionYear) {
		super(name);
		myCompetitionYear = competitionYear;
		if (myCompetitionYear <100) myCompetitionYear += 2000;
	}
	
	public String toString() {
		String objectString;
		objectString = super.toString();
		objectString += "\nCompetition Year = " + myCompetitionYear;
		return objectString;
	}

}
