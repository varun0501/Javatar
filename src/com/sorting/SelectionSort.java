
/*----------------------------------------------------------------
 *  Author:        Varun Agarwal
 *  Written:       3/21/2015
 *  Last updated:  3/21/2015
 *
 *  Compilation:   javac SelectionSort.java
 *  Execution:     java SelectionSort
 *  
 *  This program is to perform Selection Sort on the ten numbers
 *  input by user
 *  Input: ten numbers from user
 *  Output: Sorted numbers using Selection Sort
 *----------------------------------------------------------------*/
package com.sorting;
import java.util.*;

public class SelectionSort
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int sizeOfArray = input.nextInt();
		System.out.println("Lets start entering array of numbers...");
		int[] numbers = new int[sizeOfArray];
		for(int i=0; i<sizeOfArray; i++)
		{
			System.out.println("Please enter " + (i+1) + "th number");
			numbers[i] = input.nextInt();
		}
		
		for(int j = 0; j < sizeOfArray; j++)
		{
			System.out.println(numbers[j]);
		}

	}

}
