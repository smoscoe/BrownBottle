
public class AsteriskLogger implements Logger{
	
	@Override
	public void Log(String str) { 
		System.out.println("***" + str + "***");
		
	}

	@Override
	public void Error(String str) {
		
		StringBuilder boxBuilder = new StringBuilder();
		String iterator = "ERROR: " + str;
	
		for (int i = 0; i < iterator.length() + 6; i++) {
			boxBuilder.append("*");
		}
		
		System.out.println(boxBuilder);
		System.out.println("***" + iterator + "***");
		System.out.println(boxBuilder);
		
		
	}

}
