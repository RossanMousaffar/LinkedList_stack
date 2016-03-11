/**
 * Name: Rossan Mousaffar A.M
 * Group: SE 2.2 
 * Course: BSc(Hons) Software Engineering 
 * Module: Data Structure and Algorithm 
 * Lecturer: Mr, AMic 
 * Date of submitted: 30/10/2015
 **/
package linkedList_Stack;

import java.util.Scanner;

public class LinkedList {
	private Node head; // head of list
	int noOfElements; // current no of nodes in list

	// default constructor
	public LinkedList() {
		head = null;
		noOfElements = 0;
	}

	// check if list is empty
	public boolean isEmpty() {
		return head == null;
	}

	// display list elements and number of elements
	public void display() {
		if (isEmpty())
			System.out.println("List is Empty");
		else {
			System.out.println("\nList Elements ... 	");
			Node current = head;
			while (current != null) {
				current.display();
				current = current.next;
			}
			System.out.println("\nNo of elements : " + noOfElements);
		}
	}

	// insert a node at the beginning of list
	public void insert(Node n) {
		if (head == null)
			head = n;
		else {
			n.next = head;
			head = n;
		}
		noOfElements++;
	}

	// add a node at the end of list
	public void append(Node n) {
		Node current = head;
		if (head == null)
			head = n;
		else {
			while (current.next != null)
				current = current.next;
			current.next = n;
		}
		noOfElements++;
	}

	// insert a node at a specified position
	public void insert(Node n, int pos) {
		if (isEmpty())
			head = n;
		else if (pos == 1) {
			n.next = head;
			head = n;
		} else {
			Node current = head;
			for (int i = 1; i < pos - 1 && i < noOfElements; i++)
				current = current.next;

			n.next = current.next;
			current.next = n;
		}
		noOfElements++;
	}

	// remove x from the list, duplicate values shall be also removed
	public void remove(Transaction x) {
		Node previous = head;
		for (Node current = head; current != null; current = current.next) {
			if (current.data == x) {
				// node to be deleted is at the head
				if (previous == current)
					head = current.next;
				// node to be deleted is in between first and last
				else if (current.next != null)
					previous.next = current.next;
				// node is at the end
				else if (current.next == null)
					previous.next = null;
				noOfElements--;
			} else
				previous = current;
		}
	}

	// Delete a node at a given position
	public Node delete(int pos) {
		// delete at pos 1
		Node n = null;
		if (noOfElements > 0) {
			if (pos <= 1) {
				n = head.clone();
				head = head.next;
				noOfElements--;
			} else if (pos <= noOfElements) {
				Node current = head;
				Node previous = head;
				for (int i = 1; (i < pos && i < noOfElements); i++) {
					previous = current;
					current = current.next;
				}

				previous.next = current.next;
				n = current;
				noOfElements--;
			} else
				System.out
						.println("Incorrect position, should be between 1 and "
								+ noOfElements);
		} else
			System.out.println("List is empty");
		return n;
	}

	// finds first occurrence and returns position of the value to be
	// searched
	public void search() {
		// checking if list is empty first
		boolean found = false;
		if (isEmpty())
			System.out.print("Empty queue");
		else {
			Scanner s = new Scanner(System.in);
			System.out.print("Enter the Transaction Description: ");
			String description = s.next();
			Node current = head;
			int i = 0;
			while (i <= noOfElements && !found){

				if (current.data.getDescription().contains(description))
					System.out.println("Transaction found");
				else
					System.out.println("Transaction not found");
				found = true;
			}

		}

	}

	// reset list
	public void reset() {
		System.out.println("All data will be erased!");
		head = null;
		noOfElements = 0;
	}

	// get the size of the list
	public int getsSize() {
		return noOfElements;
	}

	public void peek() {
		// checking if list is empty
		if (isEmpty())
			System.out.println("list is Empty");
		else {
			head.display();
		}
	}

} // LinkedList : end of class definition

