package org.juarez.euler;
import java.util.Iterator;

public class Fibonacci implements Iterator<Integer> {
	int a = 0;
	int b = 1;
	
	@Override
	public Integer next() {
		int n = a + b;
		a = b;		
		b = n;
		return n;
	}

	@Override
	public boolean hasNext() {
		return true;
	}

	@Override
	public void remove() {
		throw new UnsupportedOperationException();
	}
}
