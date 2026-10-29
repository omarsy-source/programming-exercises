package Exercise02;


// Unterklasse: erweitert das Verhalten ihrer Basisklasse.


public class InvalidInputException extends Exception  {
	public InvalidInputException (String messageValue) {
		super(messageValue);
	}
}
