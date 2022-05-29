package com.testyanra;

public class Test {
	public static void main(String[] args) {
		int[] a= {2,5,7,9};
		int search =5;
		boolean flag =false;
		for(int i=0;i<=a.length;i++)
		{
			if(search==a[i])
			{
				System.out.println(search +" is present in Array");
				flag =true;
			}
			else{
				System.out.println(search +" is not present in Array");
			}
		}
		
	}

}
