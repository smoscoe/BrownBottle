
public class SpacedLogger implements Logger {

	@Override
	public void Log(String str) {
		StringBuilder spacer = new StringBuilder();
		for (int i = 0; i<str.length(); i++) {
			spacer.append(str.charAt(i) + " ");
		}
		System.out.println(spacer);
			
		
	}

	@Override
	public void Error(String str) {
		StringBuilder spacer = new StringBuilder();
		for (int i = 0; i<str.length(); i++) {
			spacer.append(str.charAt(i) + " ");
		}
		System.out.println("ERROR: " + spacer);
	}

}
