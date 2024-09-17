import java.util.Iterator;
import java.util.NoSuchElementException;

public class Interval implements Iterable<Integer>{
	
	private final int min;
	private final int max;
	
	public Interval(int i, int j) {
		min=i;
		max=j;
	}

	public int size() {
		return max-min+1;
	}
	@Override
	public String toString() {
		if (empty())
			return "{}";
		return "Interval [min=" + min + ", max=" + max + "]";
	}

	public boolean empty() {
		return max<min;
	}
	
	public static Interval arrayIndexes(int[] v) {
		return new Interval(0,v.length-1);
	}
	
	public static Interval isEmpty() {
		return new Interval(0,-1);
	}
	
	public Iterator<Integer> iterator(){
		return new IntervalIterator();
	}
	

	public static Interval naturals(int size) {
		return new Interval(1,size);
	}


	private class IntervalIterator implements Iterator<Integer>{
		
		private int position = 0;
		
		@Override
		public boolean hasNext() {
			if(min+position > max)
				return false;
				return true;
		}

		@Override
		public Integer next() {
			if(!hasNext())
				throw new NoSuchElementException();
			position ++;
			return min+position;
		}
		
	}

	
	
	

	
	
}
