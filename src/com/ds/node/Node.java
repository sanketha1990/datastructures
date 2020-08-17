package com.ds.node;

public class Node {
	private Object key;
	private Object value;
	private Node next;

	public Node(Object key, Object value) {
		System.out.println("Node arg constructor");
		this.key = key;
		this.value = value;
		this.next = null;
	}

	public Object getKey() {
		return key;
	}

	public void setKey(Object key) {
		this.key = key;
	}

	public Object getValue() {
		return value;
	}

	public void setValue(Object value) {
		this.value = value;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

}
