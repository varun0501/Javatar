package com.sorting;
import java.util.*;

/**
 * This class implements the Selection sort algorithm
 * @author Varun Agarwal
 * @version 1.0
 */
public class SelectionSort
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int sizeOfArray = input.nextInt();//Size of an input array
		System.out.println("Lets start entering array of numbers...");
		int[] numbers = new int[sizeOfArray];
		for(int i=0; i<sizeOfArray; i++)//A loop for user to enter input array
		{
			System.out.println("Please enter " + (i+1) + "th number");
			numbers[i] = input.nextInt();
		}
		doSelectionSort(numbers);//Calling function to sort using Selection sort
		System.out.println("Below is the sorted array using Selection Sort");
		for(int j = 0; j < sizeOfArray; j++)// Printing sorted array
		{
			System.out.print(numbers[j] + " ");
		}
		
		input.close();

	}
	/**
	 * This function finds the smallest element in array between start
	 * and end position
	 * the corresponding index
	 * @param numbers The reference of the input array
	 * @param low Start position in the array
	 * @param high End position in the array
	 * @return index of the smallest element
	 */
	public static int findSmallest(int[] numbers, int low, int high)
	{
		int smallest = low;
		for(int i = low; i <= high; i++)
		{
			if(numbers[smallest] > numbers[i])
			{
				smallest = i;
			}
		}
		return smallest;
	}
	/**
	 * This function swap the elements at position a and b
	 * @param numbers the reference of the input array
	 * @param a position of first element
	 * @param b position of an element which needs to be swapped with first element
	 */
	public static void swap(int[] numbers, int a, int b)
	{
		numbers[a] = numbers[a] + numbers[b];
		numbers[b] = numbers[a] - numbers[b];
		numbers[a] = numbers[a] - numbers[b];
	}
	/**
	 * This function performs the Selection sort on the input array
	 * @param numbers the reference of the input array
	 */
	public static void doSelectionSort(int[] numbers)
	{
		for(int i = 0; i < numbers.length-1; i++)
		{
			swap(numbers, i, findSmallest(numbers, i, numbers.length-1));
		}
	}

}
