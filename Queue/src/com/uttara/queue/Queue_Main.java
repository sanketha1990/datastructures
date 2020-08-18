/**
 * 
 */
package com.uttara.queue;

/**
 * @author A
 *
 */
public class Queue_Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Queue Example
		MyQueue queue = new MyQueue();
		queue.enQueue(3);
		queue.enQueue(5);
		queue.enQueue(7);
		queue.enQueue(9);
		queue.enQueue(30);
		queue.traverse();
		
		while(!queue.isEmpty()) {
			System.out.println("DeQueuing  "+queue.deQueue());
			queue.traverse();
			System.out.println("Size = " +queue.getSize());
		}		
		
		System.out.println("Enqueuing Again : ");
		queue.enQueue(9);
		queue.enQueue(18);
		queue.traverse();
		// Queue using Stacks Example
		QueueUsingStacks queueUsingStacks = new QueueUsingStacks();
		System.out.print("Queuing : ");
		for (int i = 1; i <= 5; i++) {
			System.out.print(" " +i);
			queueUsingStacks.enQueue(i);	
		}
		System.out.println();
		System.out.println("QueueUsingStacks size : " +queueUsingStacks.getSize());
		queueUsingStacks.deQueue();
		queueUsingStacks.deQueue();
		queueUsingStacks.enQueue(8);
		System.out.println("QueueUsingStacks size : " +queueUsingStacks.getSize());
		System.out.println();
		System.out.print("De Queuing : ");
		while(!queueUsingStacks.isEmpty()) {
			System.out.print(" " +queueUsingStacks.deQueue());
		}
		
	}

}
