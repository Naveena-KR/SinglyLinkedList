package com.gl.linkedList.q4;

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

	public void displayReverselist(Node current) {

		if (head == null) {
			System.out.println("List is empty");
			return;
		} else {
			if (current.next == null) {
				System.out.print(current.data + " ");
				return;
			} else {
				displayReverselist(current.next);
				System.out.print(current.data + " ");
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
		list.displayReverselist(list.head);//Displaying reverse list
	}

}
