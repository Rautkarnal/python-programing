package com.cdac;

import java.util.Arrays;
import java.util.Scanner;

public class RecursionBinary {
	public static int recuBinary(int[]arr,int left,int right,int key)
	{
		if(right<left)
			return -1;
		int index,mid =(left + right)/2;
		if(key == arr[mid])
			return mid;
		if(key < arr[mid])
		index =	recuBinary(arr,left,mid-1,key);
		else
		index =	recuBinary(arr,mid+1,right,key);
		return index;
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
	int[] arr= {99,88,77,55,44,33,11,22};
	Arrays.sort(arr);
	System.out.println("Enter key to search:");
	int key = sc.nextInt();
	int index = recuBinary(arr,0,arr.length-1,key);
	
	if(index != -1)
		System.out.println("Key found at index:"+index);
	else
		System.out.println("Key not found");

	}

}
