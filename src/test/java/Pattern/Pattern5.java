package Pattern;

public class Pattern5 {
public static void main(String[] args) {
	int r=5;
	for(int i=1;i<=r;i++)
	{
		for(int s=i;s<r;s++ )
		{
			System.out.print(" ");
		}
		for(int j=1;j<=i;j++)
		{
			System.out.print("*");
		}
		for(int j=1;j<i;j++)
		{
			System.out.print("*");
		}
		System.out.println();
	}
	for(int i=1;i<=r;i++)
	{
		for(int s=1;s<=i;s++)
		{
			System.out.print(" ");
		}
		for(int j=i;j<r;j++)
		{
			System.out.print("*");
		}
		for(int j=i;j<=  r;j++)
		{
			System.out.print("*");
		}
		System.out.println();
	}
}
}
