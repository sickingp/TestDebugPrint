package testDebugPrinting;


public class Subsystem {
	private String myName;
	
	public Subsystem(String name) {
			myName = name;
	}
	
	public String getName()	{
		return myName;
	}
	
	public String toString() {
		String objectString;
		objectString = "\n-----------------";
		objectString += "\nClass = " + this.getClass().getName();
		objectString += "\nName = " + myName;
		return objectString;
	}
	
}
