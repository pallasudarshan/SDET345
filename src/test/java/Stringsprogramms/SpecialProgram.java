package Stringsprogramms;

public class SpecialProgram {

	public static void main(String[] args) {
		String s="Khatam ta ta bye bye";
		String[] str = s.split(" ");
		
		for(int i=0;i<str.length;i++)
		{
			
			String s1 = str[i];
			//System.out.print(str[i]+" ");
			String rev="";
			for(int j=s1.length()-1;j>=0;j--)
			{
				rev=rev+s1.charAt(j);
			}
			
			System.out.print(rev+" " );
		}
		//System.out.println();
		
	}
}
