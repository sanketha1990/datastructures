package com.uttara.genericqueue;

import java.util.Iterator;
import java.util.NoSuchElementException;


public class GenericQueue<T> implements Iterable<T> {

	private int size;
	private GenericNode<T> front;
	private GenericNode<T> rear;
	
	public boolean isEmpty() {
		return(null == front);
	}
	
	public int getSize() {
		return size;
	}
	
	public void enQueue(T data) {
		if(0==size) {
			front = rear = null;
		}
		
		GenericNode<T> newNode = new GenericNode<T>(data);
		if(front == rear) {
			if(null == front)  {
				front = rear = newNode;
			}
			else {
				rear.setNext(newNode);
				rear = newNode;
			}
			
		}
		else {
			rear.setNext(newNode);
			rear = newNode;
		}
		size++;
		
	}
	
	public T deQueue() {
		T value = null;
		GenericNode<T> temp = front;
		if(null == front) {
			System.out.println("Queue is Empty");
		}
		else {
			front = front.getNext();
			value = temp.getData();
			temp.setNext(null);
			temp = null;
		}
		size--;
		return value;
		
	}
	
	@Override
	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		return null;
	}
	
	private class ListIterator implements Iterator<T> {
        private GenericNode<T> current = front;
        public boolean hasNext()  { 
        	return current != null;                    
        }
        public void remove()      { 
        	throw new UnsupportedOperationException();  
        }

        public T next() {
            if (!hasNext()) throw new NoSuchElementException();
            T data = current.getData();
            current = current.getNext(); 
            return data;
        }
    }

}
