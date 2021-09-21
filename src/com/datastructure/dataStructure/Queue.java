package com.datastructure.dataStructure;

class Queue<T> {
	Node<T> front;
	Node<T> rear;
	int count = 0;

	@SuppressWarnings("hiding")
	class Node<T> {
		T data;
		Node<T> next;

		Node(T data) {
			this.data = data;
			this.next = null;
		}
	}

	public Queue() {
		this.front = null;
		this.rear = null;
	}

	public void enqueue(T item) {
		Node<T> temp = new Node<T>(item);
		if (rear == null) {
			front = temp;
			rear = temp;
			count++;
			return;
		}
		rear.next = temp;
		rear = temp;
		count++;
	}

	public void dequeue() {
		if (front == null) {
			System.out.println("Queue is empty");
			return;
		}
		front = front.next;
		if (front == null) {
			rear = null;
		}
		count--;
	}

	public int size() {
		return count;
	}

	public boolean isEmpty() {
		if (front == null) {
			return true;
		}
		return false;
	}

	public void display() {
		if (isEmpty()) {
			System.out.println("Queue is emepty");
			return;
		} else {
			Node<T> temp = this.front;
			while (temp.next != null) {
				System.out.print(temp.data + "->");
				temp = temp.next;
			}
			System.out.println(temp.data);
		}
	}
}
