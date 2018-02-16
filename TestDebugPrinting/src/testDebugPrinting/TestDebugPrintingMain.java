package testDebugPrinting;

public class TestDebugPrintingMain {
		
    public static void main( String[] args ) {
        System.out.println( "Starting TestDebugPrinting" );
        
        BaseRobot baseRobot = new BaseRobot("Paul's Base Robot");
        System.out.println(baseRobot);
        
        Robot robot = new Robot("Paul's Robot",2018);
        Subsystem subsystem = new Subsystem("Drive");
        robot.add(subsystem);
        robot.add(new Subsystem("Lift"));
        System.out.println(robot);  
        
        SnakeRobot snakeRobot = new SnakeRobot("Paul's Snake",2019, "Rattle");
        System.out.println(snakeRobot);
        
        System.exit( 0 ); //success
    }

}
