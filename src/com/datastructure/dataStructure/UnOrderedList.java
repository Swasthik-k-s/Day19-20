package com.datastructure.dataStructure;

public class UnOrderedList<T> {
	Node head;
	int count = 0;

	public class Node<T> {
		public T data;
		public Node next;

		Node(T data) {
			this.data = data;
			next = null;
		}
	}

	public <T> void add(T data) {

		Node newNode = new Node(data);

		if (head == null) {
			head = newNode;
			count++;
		} else {
			Node temp;
			temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = newNode;
			count++;
		}
	}

	public <T> void display() {
		if (head == null) {
			System.out.println("List is empty");
			return;
		}
		Node temp = head;
		while (temp.next != null) {
			System.out.print(temp.data + "-->");
			temp = temp.next;
		}
		System.out.println(temp.data);
	}

	public <T> boolean search(T input) {
		Node temp;
		temp = head;
		boolean flag = false;
		if (head == null) {
			return false;
		}
		while (temp != null) {
			if (temp.data.equals(input)) {

				flag = true;
				break;
			} else {
				temp = temp.next;
			}
		}
		return flag;
	}

	public <T> void remove(T input) {

		if (input.equals(head.data)) { // Removing the first element
			head = head.next;
			count--;
			return;
		}
		Node temp = head.next;
		Node q = head;
		while (temp != null) {

			if (temp.data.equals(input)) {
				// System.out.println(temp.data);
				if (temp.next == null) {
					temp = temp.next;
					q.next = null;
				} else {
					q.next = temp.next;
					temp = temp.next;
				}
				count--;
			}
			else {
				q = temp;
				temp = temp.next;
			}
		}
	}

	public int size() {
		return count;
	}

	public boolean isEmpty() {
		if (head == null)
			return true;
		return false;
	}

	public <T> int index(T item) {
		boolean flag = search(item);
		if (!flag) {
			System.out.println("Not found");
			return -1;
		} else {
			int index = 0;
			Node temp;
			temp = head;
			while (temp != null) {
				if (temp.data.equals(item)) {
					break;

				} else {
					temp = temp.next;
					index++;
				}
			}
			return index;
		}
	}

	public <T> Node pop() {
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

	public <T> Node pop(int pos) {
		if (head == null) {
			System.out.println("Empty");
			return null;
		}
		if (pos == 1) {
			Node temp = head;
			head = head.next;
			return temp;
		} else {
			int count = 1;
			Node temp = head;
			Node q = temp;
			while (count < pos) {
				q = temp;
				temp = temp.next;
				count++;
			}
			q.next = temp.next;
			return temp;
		}
	}

	public <T> void insert(int pos, T item) {
		Node newNode = new Node(item);
		if (pos == 1) {
			newNode.next = head;
			head = newNode;
		} else {
			int count = 1;
			Node temp = head;
			Node q = temp;
			while (count < pos) {
				q = temp;
				temp = temp.next;
				count++;
			}
			q.next = newNode;
			newNode.next = temp;
		}
	}

	public <T> void append(T item) {
		add(item);
	}

	public Node getList() {
		return head;
	}

}
