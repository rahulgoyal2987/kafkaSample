package Spring.kafkaSample;

public class Test {
	String message = null;
	Test(String s){
		message = s;
	}
	public String getMessage() {
		return message;
	}
	@Override
	public String toString() {
		return "{message:" + this.message + "}";
	}
}
