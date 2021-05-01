package interfaces;

public class EmailLogger implements Logger{
	public void log(String message) {
		System.out.println("email gönderildi : " + message);
	}
}
