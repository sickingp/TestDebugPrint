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
        
        DroneRobot droneRobot = new DroneRobot("Paul's Drone",2019, 1000.);
        System.out.println(droneRobot);
        
        System.exit( 0 ); //success
    }

}
