package easy;

public class Forms {

	// Das Beispiel starten und die vorbereiteten Eingaben bzw. Ausgaben ausführen.
	public static void main(String[] args) {
		String a = "10";
		String b = "4.5";
		String n = "Hallo";
		String er = input_type(b);
		System.out.println(er);

	}
	
	// Den vorgesehenen Eingabetyp des Formularelements liefern.
	public static String input_type(String value) {
		try {
			Integer.parseInt(value);
			value = "integer";
		} catch (NumberFormatException e) {
			try {
				Double.parseDouble(value);
				value = "double"; 
				
			} catch (NumberFormatException l) {
				value = "string";
			}
		}
		
		return value;
		
	}
}
