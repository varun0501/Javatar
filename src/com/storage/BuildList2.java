package com.storage;
import java.util.*;

/**
 * This class is for implementing a list to add
 * items at the top of the list
 * @author Varun Agarwal
 *
 */
public class BuildList2
{
	public static void main(String[] args)
	{
		Node top = null, current, last = null;
		Scanner in = new Scanner(System.in);
		System.out.println("Please Enter numbers or 0 to end inputting");
		int n = in.nextInt();
		while(n!=0)
		{
			current = new Node(n);
			if(top==null)
			{
				top = current;
				last = current;
			}
			else
			{
				current.next = top;
				top = current;
			}
			n = in.nextInt();
		}
		in.close();
		
		System.out.println("The linked list is printed as below ");
		printList(top);
		
	}
	/**
	 * The function is for printing the linked list 
	 * @param top Header of the list needs to be passed as parameter
	 */
	public static void printList(Node top)
	{
		boolean isFirst = true;
		while(top != null)
		{
			if(isFirst)
			{
				System.out.print(top.num);
				top = top.next;
				isFirst = false;
			}
			else
			{
				System.out.print("->" + top.num);
				top = top.next;
			}
		}
	}
}