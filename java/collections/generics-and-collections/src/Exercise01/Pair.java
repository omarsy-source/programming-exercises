package Exercise01;

public class Pair <T, U>{
	private T first;
	private U second;
	public Pair (T first, U second) {
		this.first = first;
		this.second = second;
		
	}
	// Den zugehörigen gespeicherten Wert zurückgeben.
	public T getFirst () {
		return first;
	}
	// Den zugehörigen gespeicherten Wert zurückgeben.
	public U getSecond () {
		return second;
	}
	@Override
	public String toString() {
		return "Pair [first=" + first + ", second=" + second + "]";
	}
	
	
	
}
