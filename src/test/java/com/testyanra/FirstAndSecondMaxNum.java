package com.testyanra;

public class FirstAndSecondMaxNum {
	public static void main(String[] args) {
		int[] a= {2,4,1,9,8};
		int fmax=a[0];
		int smax=a[0];
		for(int i=0;i<a.length;i++) 
		{
			if(a[i]<fmax)
			{
				smax=fmax;
				fmax=a[i];
				
			}else if(a[i]<smax)
			{
				smax=a[i];
				
			}
		}
		
		System.out.println("second max number "+smax);
		

    }
}
