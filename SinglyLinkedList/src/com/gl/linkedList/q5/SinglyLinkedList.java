package com.gl.linkedList.q5;

import java.util.Scanner;

public class SinglyLinkedList {
	public class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	Node head = null;
	Node tail = null;

	public void insert(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			tail = newNode;
		} else {
			tail.next = newNode;
			tail = newNode;
		}
	}

	public void displaylist() {
		Node current = head;
		if (head == null) {
			System.out.println("List is empty");
			return;
		}
		while (current != null) {
			System.out.print(current.data + " ");
			current = current.next;
		}
		System.out.println();
	}

	public void delete() {
		if (head == null) {
			System.out.println("List is empty");
			return;
		} else {
			if (head != tail) {
				head = head.next;
			} else {
				head = null;
				tail = null;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SinglyLinkedList list = new SinglyLinkedList();
		Scanner scanner = new Scanner(System.in);
		int totalInputs = scanner.nextInt();// Holds total number of inputs
		for (int i = 0; i < totalInputs; i++) {
			list.insert(scanner.nextInt());
		}
		list.displaylist();// Displaying original list before deleting
		while (list.head != null) { //Deleting node from beginning
			list.delete();
			list.displaylist();// After deleting node, Displaying updated list
		}
	}

}
