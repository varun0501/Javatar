package com.storage;
import java.util.*;

import javax.print.event.PrintJobAttributeListener;

/**
 * This class is for implementing linked list to 
 * add elements so that list always stay sorted
 * @author Varun Agarwal
 *
 */
public class BuildList3
{
	public static void main(String[] args)
	{
		Node top = null;
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter numbers or 0 for stop entering");
		
		int number = in.nextInt();
		while(number!=0)
		{
			top = addInPlace(top, number);
			number = in.nextInt();
		}
		
		System.out.println("The list is printed below in sorted order");
		printList(top);
	}
	/**
	 * This function insert the element at the correct place so that
	 * list will always remain sorted in ascending order
	 * @param top Reference to the top of the list
	 * @param n New number to be inserted
	 * @return Reference to the top of the list
	 */
	public static Node addInPlace(Node top, int n)
	{
		Node np, prev = null, curr = null;
		np = new Node(n);
		curr = top;
		while(curr != null && n > curr.num)
		{
			prev = curr;
			curr = curr.next;
		}
		np.next = curr;
		if(prev == null)
		{
			return np;
		}
		else
		{
			prev.next = np;
		}
		return top;
	}
	
	/**
	 * This function prints the list
	 * @param top Reference to the top of the list
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
