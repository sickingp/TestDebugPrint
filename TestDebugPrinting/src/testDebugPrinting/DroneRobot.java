package testDebugPrinting;

public class DroneRobot extends Robot {
	private double myMaxHeight;
	
	public DroneRobot(String name, int competitionYear, double maxHeight) {
		super(name, competitionYear);
		myMaxHeight = maxHeight;
	}
	
	public String toString() {
		String objectString;
		objectString = super.toString();
		objectString += "\nMaximum Height = " + myMaxHeight;
		return objectString;
	}

}