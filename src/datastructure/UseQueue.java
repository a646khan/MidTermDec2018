package datastructure;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class UseQueue {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Queue that includes add,peek,remove,pool elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */

		Queue<String> queue = new LinkedList<>();
		queue.add("VA");
		queue.add("CA");
		queue.add("MD");
		queue.add("LA");
		queue.add("PA");
		queue.add("NY");


		System.out.println(queue.peek());// peek from queue
		System.out.println(queue.remove());//remove from queue
		System.out.println(queue.peek());
		System.out.println(queue.poll());// poll from queue
		System.out.println(queue.peek());

		//Use of For Each loop  to retrieve data.

		System.out.println("Use of for each loop to retrieve data: ");
		for (String st : queue) {
			System.out.println(st);
		}

		//Use of while loop with Iterator to retrieve data.
		System.out.println("Use of while loop to retrieve data: ");
		Iterator itr = queue.iterator();
		while (itr.hasNext()) {
			String i = (String) itr.next();
			System.out.println(i);
		}
	}

}
