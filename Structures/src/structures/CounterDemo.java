package structures;

public class CounterDemo {
	public static void main(String[] args) {
		Counter c;
		c = new Counter();
		c.increment();
		c.increment(4);
		int temp = c.getCount();
		c.reset();
		Counter j = new Counter(5);
		j.increment();
		Counter i = j;
		temp = i.getCount();
		i.increment(2);
		
	}

}
