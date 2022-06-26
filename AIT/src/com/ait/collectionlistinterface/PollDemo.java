package com.ait.collectionlistinterface;

import java.util.LinkedList;

public class PollDemo {

	public static void main(String[] args) {
		LinkedList list = new LinkedList(); 
		 list.add("GeM"); 
		 list.add(4); 
		 list.add("GREY"); 
		 list.add(8); 
		 System.out.println("The initial Linked List is : " + list); 
		 System.out.println(list.poll());
		 System.out.println("The Linked List is : " + list);
		 System.out.println("The Linked List is : " + list.pollFirst());
		 System.out.println("The Linked List is : " + list.pollLast());

	}

}
