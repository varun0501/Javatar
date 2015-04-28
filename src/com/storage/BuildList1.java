package com.storage;
import java.util.*;

/**
 * This class is for implementing a list to add elements
 * at the end of the list
 * @author Varun Agarwal
 *
 */
public class BuildList1
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		Node top, np, last = null;
		top = null;
		System.out.printf("Enter some integer ending with 0\n");
		int n = in.nextInt();
		while(n!=0)
		{
			np = new Node(n);
			if(top == null)
			{
				top = np;
			}
			else
			{
				last.next = np;
			}
			last = np;
			n = in.nextInt();
		}
		in.close();
		System.out.printf("The items in the list are \n");
		printList(top);
	}
	/**
	 * A function to print the linked list
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
		System.out.println();
	}
}