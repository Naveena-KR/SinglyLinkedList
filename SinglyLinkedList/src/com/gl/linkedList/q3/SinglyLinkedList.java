package com.gl.linkedList.q3;

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

	public static int countNodes() {
		int count = 0;
		Node current = head;
		if (current == null) {
			return 0;
		}
		while (current != null) {
			count++;
			current = current.next;
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int totalInputs = scanner.nextInt();// Holds total number of inputs
		for (int i = 0; i < totalInputs; i++) {
			SinglyLinkedList.insert(scanner.nextInt());
		}
		int totalNodes = countNodes();
		System.out.println(totalNodes);// Displaying total count of nodes

	}

}
