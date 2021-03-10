package javaBasics;

public class Palindrome {

	public static void main(String[] args) {
		String s = new String("madam");
		String p = new String("");;
		int l= s.length();
		
		for(int i=l-1; i>=0; i--)
		{
			p=p+ s.charAt(i);;
			//System.out.println(p);;
		}
		System.out.println(s);;
		System.out.println(p);;
		
		if (s.equals(p))
				System.out.println("yes this is a palindrome");
			else
				System.out.println("not a palindrome");
	}

}
