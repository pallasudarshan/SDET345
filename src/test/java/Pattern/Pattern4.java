package Pattern;

public class Pattern4 {
public static void main(String[] args) {
	int r=5;
	for(int i=1;i<=r;i++)
	{
		for(int s=r-i;s>=1;s--)
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
}
}
