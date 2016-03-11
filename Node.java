/**
 * Name: Rossan Mousaffar A.M
 * Group: SE 2.2 
 * Course: BSc(Hons) Software Engineering 
 * Module: Data Structure and Algorithm 
 * Lecturer: Mr, AMic 
 * Date of submitted: 30/10/2015
 **/
package linkedList_Stack;

public class Node {
	Transaction data; // actual data store in node
	Node next; // reference to next element

	// constructor to create a node with value x
	public Node(Transaction t) {
		data = t;
		next = null; // next reference null
	}

	// clones and returns the current node
	public Node clone() {
		return new Node(this.data);
	}

	// display node value
	public void display() {
		data.display();
	}

	public Transaction getData() {
		return data;
	}

}
