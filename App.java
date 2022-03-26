
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Logger logger = new AsteriskLogger();
		
		logger.log("Hello");
		System.out.println();
		logger.error("Hello");
		System.out.println();
		
		Logger spacedLogger = new SpacedLogger();
		
		spacedLogger.log("Hello\n");
		System.out.println();
		spacedLogger.error("Hello\n");
		System.out.println();
	
	}

}
