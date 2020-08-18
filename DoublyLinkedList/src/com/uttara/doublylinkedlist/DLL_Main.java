package com.uttara.doublylinkedlist;

public class DLL_Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DoublyLinkedList dll = new DoublyLinkedList();
		dll.insert(4);
		dll.insert(19);
		dll.insert(34);
		dll.insert(3);
		dll.insert(45);
		dll.insert(89);
		System.out.println("Traversal");
		dll.traverse();
		System.out.println("Reverse Traversal");
		dll.revTraverse();
		
		dll.delete(45);
		System.out.println("After Deletion");
		dll.traverse();
		System.out.println("Reverse Traversal");
		dll.revTraverse();
		
	}

}
