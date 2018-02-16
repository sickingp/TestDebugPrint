/**
 * 
 */
package testDebugPrinting;

/**
 * @author sicki
 *
 */
public class SnakeRobot extends Robot {
	
	private String m_type;

	/**
	 * @param name
	 * @param competitionYear
	 */
	public SnakeRobot(String name, int competitionYear, String typeOfSnake) {
		super(name, competitionYear);
		m_type = typeOfSnake;
		
		// TODO Auto-generated constructor stub
	}
	
	public String toString()
	{
		return "This is a Snake Robot of type: " + m_type;
	}
}
