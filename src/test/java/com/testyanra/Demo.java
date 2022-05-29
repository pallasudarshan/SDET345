package com.testyanra;

import org.apache.poi.util.SystemOutLogger;

public class Demo {
	public static void main(String[] args) {
		int[] a= {2,4,1,3,9,5};
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]<a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		
		int sum=0;
		for (int k = 0; k < 3; k++) 
		{
			sum=sum+a[k];
		}
	       System.out.println(sum);	
	       
		}
	}



