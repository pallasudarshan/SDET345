package com.testyanra;

public class WithoutBubblesort {
	public static void main(String[] args) {
		int[] a= {2,7,6,4,3,5};
		int fmax=a[0];
		int smax=a[0];
		for (int i = 0; i < a.length; i++) {
		
			if(a[i]>fmax)
			{
				fmax=a[i];
				
			}
			else if(a[i]>smax)
			{
				smax=a[i];
			}
		}
		
		 System.out.println("second maximum number without using bubble sort"+"    "+smax);
	}

}

