package Pattern;

public class Pattern2 {
public static void main(String[] args) {
	int r=5;
	for(int i=1;i<=r;i++)
	{
		for(int s=1;s<i;s++)
		{
			System.out.print(" ");
		}
		for(int j=r;j>=i;j--)
		{
			System.out.print("*");
		}
		System.out.println();
	}
}
}
