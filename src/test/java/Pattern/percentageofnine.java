package Pattern;

public class percentageofnine {
	public static void main(String[] args) {
		int[] a= {2,4,9,8,1};
		int fmax=a[0];
		int smax=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>fmax)
			{
				smax=fmax;
				
			}
			if(a[i]>smax)
			{
				
				smax =a[i];
			}
		
		}
		System.out.println(smax);
		
	}

}
