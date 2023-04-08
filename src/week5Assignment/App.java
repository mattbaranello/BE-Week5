package week5Assignment;

public class App {

	public static void main(String[] args) {
		
		// When the AsterisksLogger and SpacedLogger
		Logger asteriskLogger = new AsteriskLogger();
        asteriskLogger.Log("Access Granted");
        asteriskLogger.Error("Access Denied");

        Logger spacedLogger = new SpacedLogger();
        spacedLogger.Log("Access Granted");
        spacedLogger.Error("Access Denied");
		
	}

}
