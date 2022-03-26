

public class AsteriskLogger implements Logger {

	@Override
	public void log(String log) {
		// TODO Auto-generated method stub
		System.out.println("***" + log + "***");
		
	}

	@Override
	public void error(String error) {
		// TODO Auto-generated method stub
		System.err.println("****************" + "\n");
		System.err.println("***" + "ERROR: " + error + "***\n");
		System.err.println("**************** " + "\n");
		
		
	}

	
	

}
