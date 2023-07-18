package com.string;

import java.util.Scanner;

public class CountString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn= new Scanner(System.in);
		System.out.println("Enter a String");
		String s=scn.nextLine();
		char[] ch=s.toCharArray();
		int count=0;
		for(int i=0;i<=ch.length-1;i++)
		{
			if(ch[i]!=' ')
			count++;
		}
		System.out.println(count);
	}

}
