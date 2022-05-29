package com.testyanra;



public class SumofLastNum {
	public static void main(String[] args) {
		int[] a= {2,4,7,3,8};
		for(int i=0;i<a.length;i++)
		{
			  for(int j=i+1;j<a.length;j++) 
			  { 
				  if(a[i]< a[j]) //LastSum a[i]<a[j]
			         { 
					  int temp=a[i];
					    a[i]=a[j];
			            a[j]=temp;
			          } 
			  }
		}
		int sum=0;
		for(int k=0;k<3;k++)
	    {
		   sum=sum+a[k];
        }
	   System.out.println(sum);

   }
}
