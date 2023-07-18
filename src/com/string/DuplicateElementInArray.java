package com.string;

public class DuplicateElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {3,2,3,5,8,4,5,2};
		System.out.println("Duplicate elements are:");
		 for(int i=0;i<arr.length;i++)
		 {
			 for(int j=i+1;j<arr.length;j++)
			 {
				 if(arr[i]==arr[j])
				 {
					 System.out.println(arr[j]);
				 }
			 }
		 }

	}

}
