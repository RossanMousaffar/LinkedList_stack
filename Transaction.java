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

public class Transaction {

	private int id; // ID
    private int priority;// Priority
    private String description; //description
    private float amount; // amount

    
    public Transaction()//Input contructor
    {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter ID: ");
        id = s.nextInt();

        System.out.print("Enter priority: ");
        priority = s.nextInt();

        System.out.print("Enter the description : ");
        description = s.next();

        System.out.print("Enter the amount : ");
        amount = s.nextFloat();

    }

    public Transaction(int id, int priority, String description , float amount)//Parametize 
    {
        this.id=id;
        this.priority=priority;
        this.description=description;
        this.amount=amount;
    }
   
    public int getID() // Accessor
    {
        return id;
    }

    public void setID(int id)//Mutator
    {
        this.id = id;
    }

    public int getPriority()//Accessor
    {
        return priority;
    }

    public void setPriority(int priority)//Mutator
    {
        this.priority = priority;
    }

    public String getDescription()//Accessor
    {
        return description;
    }

    public void setDescription(String description)//Mutator
    {
        this.description = description;
    }

    public double getAmount()//Acceesor
    {
        return amount;
    }

    public void setAmount(float amount)//Mutator
    {
        this.amount = amount;
    }

    public void display()//display method
    {
        System.out.println("ID: "+id);
        System.out.println("Priority: "+ priority);
        System.out.println("Description : " + description);
        System.out.println("Amount : " + amount);
    }

   
    public static void main(String[] args)//test transaction
    {

        Transaction t = new Transaction();
        t.display();

    }

    

	
	
	
}
