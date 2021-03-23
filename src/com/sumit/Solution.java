package com.sumit;


public class Solution {
	
	private int[] plusOne(int[] a){
		
		
		for(int i = a.length-1 ; i>=0; i--) 
		{
			if(a[i]<9) 
			{
				a[i] = a[i] + 1;
				return a;
			}
			
			a[i] = 0;
		}
		
		int[] new_array = new int[a.length+1];
		new_array[0] = 1;
		
		return new_array;
	}
	

}
