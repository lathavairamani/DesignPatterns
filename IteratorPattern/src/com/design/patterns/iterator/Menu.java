package com.design.patterns.iterator;

import java.util.Iterator;

public interface Menu {
	public Iterator<MenuItem> createIterator();
}
