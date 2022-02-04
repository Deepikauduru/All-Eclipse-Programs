package com.simplilearn.linkedlist;

public class LinkedList {

	
		Node head;
		static class Node
		{
			int data;
			Node next;
			{
				data =d;
				next=null;
				
			}
		}
		public static LinkedList insert(LinkedList,int data) {
			
			Node new_node=new Node(data);
			new_node.next=null;
			
			if(list.head===null) {
				list.head=new_node;
				
			}
			else {
				
				Node last=list.head;
				while(last.next !=null) {
					last=last.next;
				}
				last.next=new_node;
			}
			return list;
			
		}
		

	}
public static void printlist(LlinkedList list)
	Node currNode=list.head;
	System.out.println("LinkedList:");
	
	while(currNode!=null) {
		System.out.println(currNode.data+" ");
		curr
	

}
