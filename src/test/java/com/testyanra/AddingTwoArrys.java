package com.testyanra;

public class AddingTwoArrys
{
	public static void main(String[] args) 
	{
		int[] a= {2,2,3,4,9};
		int[] b= {0,1,2,3,9,1};
		int count=a.length;     //5
		if(a.length<b.length)   //
		{
			count=b.length;
		}
			for (int i = 0; i < count; i++) {
				try {
					System.out.println(a[i]+b[i]);
				}
						catch(Exception e) {
							if(a.length>b.length)
							{
								System.out.println(a[i]);
							}else
							{
								System.out.println(b[i]);
						    }
			   }
				
		}
			
		
	}

}
