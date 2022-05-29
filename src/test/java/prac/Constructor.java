package prac;

public class Constructor {
	
	
	Constructor(int a)
	{
	  
	 
	  System.out.println("1st constructor");
	}
	Constructor(String s)
	{
	 this(100);
	 System.out.println("2n constructor");
	}
	Constructor(int x,int y)
	{
		this("hai");
		
		System.out.println("3 constructor");
	}
	

	public static void main(String[] args) {
		Constructor c=new Constructor(10,10);
	}
		
	}


