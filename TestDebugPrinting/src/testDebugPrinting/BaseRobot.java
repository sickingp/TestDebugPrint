package testDebugPrinting;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;



public class BaseRobot {
	private String myName;
	private Hashtable<String,Subsystem> subsystems;

	public BaseRobot(String name) {
		myName = name;
    	this.subsystems=new Hashtable<String,Subsystem>();

	}
	
	//register subsystems
    public void add(Subsystem subsystem){
    	this.subsystems.put(subsystem.getName(),subsystem);
    }
	
	public String toString() {
		String objectString;
		objectString = "\n===========================================";
		objectString += "\nObject Type = " + this.getClass().getName();
		objectString += "\nName = " + myName;

		if (subsystems != null) {
			// get set of subsystem keys
	        Set<String> setOfSubsystemKeys = subsystems.keySet();
	        
			objectString += "\nNumber of subsystems = " + setOfSubsystemKeys.size();
			int i = 1;
			
	        // Loop over keys
		    for (String key : setOfSubsystemKeys) {
	    		objectString += "\nSubsystem #" + i;
	    		// Print Subsystem
	    		objectString += subsystems.get(key).toString();
	    		++i;
	        }
	        objectString += "\nEnd of Subsystems";
	        objectString += "\n-----------------";
		}
		else {
			objectString += "Warning: subsystems hashtable not defined!";
		}
		
		return objectString;
	}

}
