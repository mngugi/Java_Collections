package structures;

public class Counter {
	private int count;
	public Counter() {}
	public Counter(int initial) { count = initial; } // an alternate constructor 
	public int getCount( ) { return count; } // an accessory method 
	public void increment( ) { count++; } // an update method 
	public void increment(int delta) { count += delta; } // an update method 
	public void reset( ) { count = 0; }
}
	
