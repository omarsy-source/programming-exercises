package staticexamples;

public class Counter {

		private static int count = 0;
		public Counter () {
			count++;
		}
		// Den zugehörigen gespeicherten Wert zurückgeben.
		public static int getCount () {
			return count;
		}
	}
	


