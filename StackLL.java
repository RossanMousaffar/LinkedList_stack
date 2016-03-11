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

public class StackLL {
private LinkedList list;

	
	//default constructor
	public  StackLL()
	{
		list=new LinkedList();
	}
	//--------------------------------------------------------------------------------------------//
	//Empty function
	 public boolean isEmpty()
	 {
		 return list.isEmpty();
	 }
	//--------------------------------------------------------------------------------------------//
	 //display function
	 public void display()
	 {
			 list.display();
		 
	 }
	//--------------------------------------------------------------------------------------------//
	 //insert at start function
	 void push(Transaction t)
	 {	 
		 Node n= new Node(t);
		 list.insert(n);
		 
     }
	//--------------------------------------------------------------------------------------------//
	 //insert at the End
	 void pushAtEnd(Transaction t)
	 {
		 Node n = new Node(t);
		 list.append(n);
	 }
	//--------------------------------------------------------------------------------------------//
	 //insert at a specific position
	 void pushAtSpecific(Transaction t, int pos)
	 {	 
		 Node n = new Node(t);
		 list.insert(n, pos);
	 }
	//--------------------------------------------------------------------------------------------//
	 //Delete at a specific position
	 void pop (int pos)
	 {
		 if (isEmpty())
			System.out.print("Empty");
		 else
			 list.delete(pos);
		 
	 }
	//--------------------------------------------------------------------------------------------//
	 //Empty the list
    void reset()
    {
    	if (isEmpty())
    		System.out.print("Empty");
    	else
    		list.reset();
    }
  //--------------------------------------------------------------------------------------------//
    //Search for specific description
    void search()
    {
    	list.search();
    }
  //--------------------------------------------------------------------------------------------//
    //Display the top of the Stack
    void peek()
    {
    	list.peek();
    }
    
 //--------------------------------------------------------------------------------------------//
    public void menu() {
		Scanner s = new Scanner(System.in);
		int n = 0;
		// char i='o';
		// Stack stack=new Stack(i);
		while (true) {
			System.out.println("^^---------------------WELCOME-------------------------------^^");
			System.out.println("1.Push");
			System.out.println("2.Push at a specific position");
			System.out.println("3.Push at the end");
			System.out.println("4.Pop at a specific position");
			System.out.println("5.Peek");
			System.out.println("6.Search");
			System.out.println("7.Display");
			System.out.println("8.Reset");
			System.out.println("9.Exit");
			System.out.print("^^-----------------------------------------------------------^^");
			System.out.println("");
			System.out.println("\t " +">>>>>>>>>> CHOICE <<<<<<<<<");
			System.out.println("");
			System.out.print("Make a choice:- ");
			n = s.nextInt();

			switch (n) {

			case 1: { push(new Transaction());}break;
			case 2: { int x='i';
				      System.out.print("Enter the Specific Position to insert Transaction:  ");
					  x=s.nextInt();
				      pushAtSpecific(new Transaction(),x);
				    }break;
		
			case 3: { pushAtEnd(new Transaction());}break;
			case 4: { int x='i';
					  System.out.println("Enter the Specific Position:  ");
					  x=s.nextInt();
					  pop(x);
					}break;
			case 5: {peek();}break;
			case 6: {search();}break;
			case 7: {display();}break;
			case 8: {reset();}break;
			case 9: {System.exit(0);}break;
			default: {System.out.print("END");}
			}

		}
   
   
    }      

}
