package com.ds.sll;

import com.ds.node.Node;

public class SinglyLinkedList {

	private Node head;

	public void append(Object key,Object value) {
		if (head == null) {
			head.setKey(key);
			head.setValue(value);
		} else {
			Node temp = head;
			while (temp.getNext() != null) {
				temp = temp.getNext();
			}
			temp.setKey(key);
			temp.setValue(value);
			head = temp;
		}

	}

	public void display() {
		if (head == null) {
			System.out.println("No data in SLL");
		} else {
			Node temp = head;
			while (temp != null) {
				System.out.print(temp.getKey() + "="+temp.getValue());
				temp = temp.getNext();
			}
			System.out.println();
		}
	}
}
