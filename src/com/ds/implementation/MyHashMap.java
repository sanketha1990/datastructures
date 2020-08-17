package com.ds.implementation;

import java.util.Map.Entry;

import com.ds.map.MyMap;
import com.ds.sll.SinglyLinkedList;

public class MyHashMap implements MyMap{

	Entry[] table = new Entry[15];
	SinglyLinkedList sll=new SinglyLinkedList();

	@Override
	public boolean put(Object key, Object value) {
		int tableIndex=this.getIndex(key.hashCode());
		    for (Entry<Object,Object> e = table[tableIndex]; e != null; e = e.next) 
		    {
		        Object k;
		        if (e.hashCode() == tableIndex && ((k = e.getKey()) == key || key.equals(k))) 
		         {
		             Object oldValue = e.getValue();
		             e. = value;
		             e(this);
		             return oldValue;
		          }
		     }
		     modCount++;
		     addEntry(hash, key, value, i);
		     return null;
	}

	@Override
	public Object get(Object key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object remove(Object key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean containsKey(Object key) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean containsValue(Object value) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	private int getIndex(int hashcode) {
		int index = hashcode % 16;
		return index;
	}

}
