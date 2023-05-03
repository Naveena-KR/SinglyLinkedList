package com.gl.linkedList.q2;

import java.util.Scanner;

public class SinglyLinkedList {
	public static class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	static Node head = null;
	static Node tail = null;

	public static void insert(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			tail = newNode;
		} else {
			tail.next = newNode;
			tail = newNode;
		}
	}

	public static void displaylist() {
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

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int totalInputs = scanner.nextInt();// Holds total number of inputs
		for (int i = 0; i < totalInputs; i++) {
			SinglyLinkedList.insert(scanner.nextInt());
		}
		SinglyLinkedList.displaylist();// Displaying List
	}
}
