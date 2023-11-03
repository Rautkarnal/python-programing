package com.cdac;

import java.util.Scanner;
class SinglyList{
	static class Node{
		private int data;
		private Node next;
		public Node() {
			data = 0;
			next = null;
		}
		public Node(int val) {
			data = val;
			next = null;
					
		}
	}
		private Node head;
		public SinglyList()
		{
			head = null;
			
		}
		void display()
		{
			System.out.println("List:");
			Node trav = head;
			while(trav != null)
			{
				System.out.println(trav.data);
				trav = trav.next;
			}
			System.out.println("");
		}
		void addFirst(int val)
		{
		Node newnode = new Node(val);
		newnode.next = head;
		head = newnode;
		}
		void addLast(int val)
		{
			Node newNode = new Node(val);
			//create new node
			//(if list is empty ,make new node as fist node of list
			if(head == null)
			{
				head = newNode;
			}
			else
			{//traverse till last node
				Node trav = head;
				while(trav.next != null)
					trav = trav.next;
				//add new node after trav(trav.next)
				trav.next = newNode;
			}
			
		}
		public void addAtPos(int val, int pos) {
			//special case if list is empty
			if(head == null ||pos<=1)
				addFirst(val);
			else {
			Node newnode = new Node(val);
			Node trav = head;
			for(int i=1;i<pos-1;i++) {
				if(trav.next == null)
					break;
			}
				trav = trav.next;
			newnode.next = trav.next;
			trav.next = newnode;
		       }
			}
		public void delFirst() {
			if(head == null)
				throw new RuntimeException("List is empty");
			head = head.next;
		}
		public void delAll() {
		head = null;
			
		}
		public void delAtPos( int pos) {
			if(pos == 1)
				delFirst();
			if(head == null)
				throw new RuntimeException("List is empty or invalid position");
			Node temp = null,
					trav = head;
			for(int i = 1;i<pos;i++) {
				if(trav == null)
			   throw new RuntimeException("invalid position");
				
				temp = trav;
				trav = trav.next;
			}
			temp.next = trav.next;
			//trav is node to be deleted & temp is node before that
		}
		public void dellast() {
			if(head == null)
				throw new RuntimeException("List is empty");
			Node temp = null, trav = head;
			while(trav.next != null)
			{
				temp = trav;
				trav = trav.next;
			}
			temp.next = null;
		}
	
}
public class SinglyListMain {
	public static void  main(String[]args)
	{
		int choice,val,pos;
		SinglyList list = new SinglyList();
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Options:\n0.exit\n1.Display\n2.Add First\n3.Add last\n4.Add at Postion\n5.Del first\n6.Delet last\n7.Del at Pos\n8.delet All");
			choice = sc.nextInt();
			switch(choice)
			{
			case 1:
				list.display();
			break;
			case 2:
				System.out.println("Enter new element to add");
				val = sc.nextInt();
				list.addFirst(val);
				break;
			case 3:
				System.out.println("Enter new element:");
				val = sc.nextInt();
				list.addLast(val);
				break;
			case 4:
				System.out.println("Enter new element:");
				val = sc.nextInt();
				System.out.println("Enter element position:");
				pos = sc .nextInt();
				list.addAtPos(val,pos);
				
				break;
			case 5:try {
				list.delFirst();
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}
			break;
			case 6:
				try {
				list.dellast();	
				}catch(Exception e)
				{
				 System.out.println(e.getMessage());	
				}
				break;
			case 7:
				System.out.println("Enter element position:");
				pos = sc .nextInt();
				try {
				list.delAtPos(pos);}catch(Exception e) {
					System.out.println(e.getMessage());
				}
				break;
			case 8:
				list.delAll();
				break;
			
			
			}
		}while(choice != 0);
		sc.close();
	}

}
