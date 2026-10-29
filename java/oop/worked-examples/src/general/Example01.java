package general;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example01 {

	// Das Beispiel starten und die vorbereiteten Eingaben bzw. Ausgaben ausführen.
	public static void main(String[] args) {
		String regex = "[-+]?[0-9]+,[0-9]+"; // Leerzeichen sind ebenfalls Zeichen und werden vom Muster berücksichtigt.
		String number =  "+10,5";
		
		Pattern pattern = Pattern.compile(regex);
		Matcher matchesMatcher = pattern.matcher(number);
		boolean matchCheck = matchesMatcher.matches();
		System.out.println("Result von matchCheck ist: " + matchCheck);
		
		// Für unabhängige Suchvorgänge getrennte Matcher verwenden, da ein Matcher seinen Zustand speichert.
		
		Matcher findMatcher = pattern.matcher(number);
		boolean findCheck = findMatcher.find();
		System.out.println("Result von findCheck ist: " + findCheck);
		
		String matchesResult = matchesMatcher.group();
		System.out.println(matchesResult);
		
		String findResult = findMatcher.group();
		System.out.println(findResult);
}

}