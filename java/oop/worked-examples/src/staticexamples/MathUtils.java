package staticexamples;

public class MathUtils {
		public static int add(int a, int b) {
			return a + b;
		}
		// Die übergebenen Zahlen miteinander multiplizieren.
		public static int multiply(int a, int b) {
			return a * b;
		}
		// Mit dem Rest bei Division durch zwei auf eine gerade Zahl prüfen.
		public static boolean isEven(int n) {
			if (n % 2 == 0 ) {
				return true;
			}
			return false;
		}


}
