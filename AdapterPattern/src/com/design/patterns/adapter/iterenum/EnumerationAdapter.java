package com.design.patterns.adapter.iterenum;

public class EnumerationAdapter implements Iterator {
	
	Enumeration enumeration;
	
	public EnumerationAdapter(Enumeration enumeration){
		this.enumeration = enumeration;
	}

	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return enumeration.hasMoreElements();
	}

	@Override
	public Object next() {
		// TODO Auto-generated method stub
		return enumeration.nextElement();
	}

	@Override
	public void remove() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException();
	}

}
