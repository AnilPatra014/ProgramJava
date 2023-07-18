package com.string;

public class ArraySum {

	public static void main(String[] args) {
		//  
		int a[]= {5,6,7,8};
		int sum=0;
		for(int i=0;i<=a.length-1;i++)
		{
			sum=sum+a[i];
			
		}
		System.out.println("Array sum is:"+sum);
	}

}
