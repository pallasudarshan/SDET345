package com.testyanra;

public class PrintFirstminandLastmax {

	public static void main(String[] args) {
		int[]a= {5,6,2,8,9};
		for (int i = 0; i < a.length; i++) 
		{
			for (int j =  i;j< a.length; j++)
			{
				if (a[i]<a[j]) 
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;	
				}
				
			}
			System.out.println(a[i]);
		}
		//System.out.println(a[2]);
	}
}