package Stringsprogramms;

import java.util.HashSet;

public class Hash {
	public static void main(String[] args) {
		
		String s="sudaad";
		HashSet<Character>hash=new HashSet<Character>();
		for(int i=0;i<s.length()-1;i++)
		{
			hash.add(s.charAt(i));
		}
		for(Character ch:hash) 
		{
			int count=0;
			for(int i=0;i<s.length();i++)
			{
				if(ch.equals(s.charAt(i)))
				{
					count++;
				}
			}
			if(count>1)
			System.out.println(ch+"======"+count);
		}
	}

}
