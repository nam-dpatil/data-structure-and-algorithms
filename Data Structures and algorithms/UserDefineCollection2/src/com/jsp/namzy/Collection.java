package com.jsp.namzy;

import java.util.Iterator;

public interface Collection extends Iterable {
	int size();
	
	boolean isEmpty();
	
	boolean add(String element);
	
	boolean addAll(String element);
	
	Iterator<Object> iterator();
	
	boolean contains(Object element);
	
	boolean containsAll(Object element);
	
	

}
