
public class App  {

	public static void main(String[] args) {
		
		AsteriskLogger hello = new AsteriskLogger();
		hello.Log("Hello");
		
		AsteriskLogger rip = new AsteriskLogger();
		rip.Error("RIP");
		
		SpacedLogger loremIpsum = new SpacedLogger();
		loremIpsum.Log("Lorem Ipsum");
		
		SpacedLogger errorIpsum = new SpacedLogger();
		errorIpsum.Error("Lorem Ipsum");
	}
}
