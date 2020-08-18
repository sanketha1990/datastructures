package com.uttara.genericqueue;

public class GenericQueueMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericQueue<String> strQueue = new GenericQueue<>();
		strQueue.enQueue("Naanu");
		strQueue.enQueue("Neenu");
		strQueue.enQueue("Aanu");
		strQueue.enQueue("Tanu");
		strQueue.enQueue("NakuTanthi");
		
		while(!strQueue.isEmpty()) 
			System.out.println("Deque : "+strQueue.deQueue());

	}

}
