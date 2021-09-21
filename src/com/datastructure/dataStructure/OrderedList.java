package com.datastructure.dataStructure;

public class OrderedList<T> {
	public Node head;
	int count = 0;

	public class Node<T extends Comparable<T>> {
		public T data;
		public Node next;

		Node(T data) {
			this.data = data;
			next = null;
		}
	}

	public OrderedList() {
		this.head = null;
	}

	public <T extends Comparable<T>> T get(int index) {
		Node<T> temp = head;
		Node<T> prev = null;

		for (int i = 0; i <= index; i++) {
			prev = temp;
			temp = temp.next;
		}
		return (T) prev.data;
	}

	public <T extends Comparable<T>> void add(T data) {
		Node<T> newNode = new Node<T>(data);
		if (head == null || head.data.compareTo(data) > 0) {
			newNode.next = head;
			head = newNode;
			count++;
		} else {
			Node<T> temp = head;
			while (temp.next != null && temp.next.data.compareTo(data) < 0) {
				temp = temp.next;

			}
			newNode.next = temp.next;
			temp.next = newNode;
			count++;
		}
	}

	public <T extends Comparable<T>> boolean search(T input) {
		boolean flag = false;
		Node temp;
		temp = head;
		while (temp != null) {
			if (temp.data.equals(input)) {

				flag = true;
				// pop(input);

				break;
			} else {
				temp = temp.next;
			}

		}
		return flag;
	}

	public <T extends Comparable<T>> void display() {
		Node temp = head;
		while (temp.next != null) {
			System.out.print(temp.data + "->");
			temp = temp.next;
		}
		System.out.println(temp.data);
	}

	public boolean isEmpty() {
		if (head == null)
			return true;
		return false;
	}

	public int size() {
		return count;
	}

	public Node pop() {
		if (head == null) {
			System.out.println("List is empty");
			return null;
		}
		if (head.next == null) {
			Node temp = head;
			head = null;
			return temp;
		}
		Node temp = head;
		Node prev = null;
		while (temp.next != null) {
			prev = temp;
			temp = temp.next;
		}
		prev.next = null;
		return temp;
	}

	public Node pop(int pos) {
		if (head == null) {
			System.out.println("List is empty");
			return null;
		}
		if (pos == 1) {
			Node temp = head;
			head = null;
			return temp;
		}
		int index = 1;
		Node temp = head;
		Node prev = null;
		while (index < pos) {
			prev = temp;
			temp = temp.next;
			index++;
		}
		prev.next = temp.next;
		return temp;

	}

	public Node getHead() {
		return head;
	}
}
