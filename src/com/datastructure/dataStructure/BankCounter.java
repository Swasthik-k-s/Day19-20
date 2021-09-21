package com.datastructure.dataStructure;

import java.util.*;

public class BankCounter {
	Scanner scanner = new Scanner(System.in);
	long minBalance = 5000;
	Queue queue = new Queue();

	public void addPerson() {
		System.out.println("How many people you want to add?");
		int count = scanner.nextInt();

		for(int i = 0; i < count; i++) {
			queue.enqueue(i);
		}
		option(count);
	}

	private void option(int count) {
		int num = 0;

		while( num != count) {
			long cash = minBalance;
			int option = 0;
			boolean done = false;

			while(!done) {
				System.out.println("Person " + (num + 1) + " at the counter");
				System.out.println("Available cash " + cash);
				System.out.println("You want to \n1: Withdraw \n2: Deposit");
				option = scanner.nextInt();

				switch(option) {
				case 1:
					System.out.println("Enter the amount to withdraw");
					long amount = scanner.nextInt();
					if (amount > cash) {
						System.out.println("Not enough balance to withdraw");
					} else
						cash = cash - amount;
					done = true;
					queue.dequeue();
					num++;
					System.out.println("Available cash " + cash);
					break;
				case 2:
					System.out.println("Enter the amount to deposit");
					long amount1 = scanner.nextInt();
					System.out.println("Amount deposited successfully");
					queue.dequeue();
					cash = cash + amount1;
					done = true;
					num++;
					System.out.println("Available cash " + cash);
					break;
				default:
					System.out.println("Invalid Option");
				}
			}
		}
	}
}
