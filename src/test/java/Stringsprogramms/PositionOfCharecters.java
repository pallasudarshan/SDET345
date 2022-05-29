package Stringsprogramms;


import java.util.HashSet;

public class PositionOfCharecters {
	public static void main(String[] args) {
		String s="Tester";
		s=s.toLowerCase();
		
	HashSet<Character> cs=new HashSet<Character>();
		for(int i=0;i<s.length();i++)
		{
			cs.add(s.charAt(i));
		}
		for(Character ch:cs)
		{   
			int cout=0;
			for (int i = 1; i < s.length(); i++)
			{
				if(ch.equals(s.charAt(i)))
				{
				System.out.println(ch+" "+"present at position"+i);
				break;
				
				}
			
			}
			
			
		}
	}
 }


