package Stringsprogramms;

public class Pattern {
	public static void main(String[] args) {
		int k=0;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;i++)
			{
				System.out.println(k+" ");
				if(k>=9)
				{
					k=0;
				}
				k++;
			}
			System.out.println(k);
		}
	}

}
