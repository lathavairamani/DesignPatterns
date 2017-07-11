package com.design.patterns.adapter.iterenum;

public class IteratorAdapter implements Enumeration {
	
	Iterator iter;
	
	public IteratorAdapter(Iterator iter) {
		this.iter = iter;
	}

	@Override
	public boolean hasMoreElements() {
		// TODO Auto-generated method stub
		return iter.hasNext();
	}

	@Override
	public Object nextElement() {
		// TODO Auto-generated method stub
		return iter.next();
	}

}
