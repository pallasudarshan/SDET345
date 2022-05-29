package Stringsprogramms;

public class AmanStringPRo {

	public static void main(String[] args) {
		
		String str="i am naina";
		String[]s=str.split(" ");
		
		for (String st :s) {
			String rev="";
			for(int i=st.length()-1;i>=0;i--)
			{
				rev=rev+st.charAt(i);
			}
			System.out.print(rev+" ");
		}
		
	}
}
