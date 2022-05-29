package Patterns;

public class WithoutBu {
	public static void main(String[] args) {
		int[]a = {2,5,1,4};
		int fmax=a[0];
		int smax=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<fmax)
			{
				
				fmax=a[i];
			}
		}
		System.out.println(smax);
	}

}
