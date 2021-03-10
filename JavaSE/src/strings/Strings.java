package strings;

public class Strings {

	public static void main(String[] args) {
		//How to compare strings
		
		String str1="vidisha";
		String str2="vidisha";
		System.out.println(str1==str2);
		System.out.println(str1.equals(str2));
		
		//find last occurrence of a substring
		
		String str3="ABABAB";
		int len =str3.lastIndexOf("BA");
		System.out.println(len);
		
		//Remove a particular character from string
		
		String str4=str3.substring(3);
		String str5=str3.substring(0, 2);
		str5=str5+str4;
		
		System.out.println(str5);
		
		//replace a substring
		
		str3=str3.replace("AB", "CD");
		System.out.println(str3);
		
		//reverse a string
		
		StringBuilder sb=new StringBuilder("abcdefg");
		StringBuilder RSB=sb.reverse();
		System.out.println(RSB);
		String rev="";
		for(int i=str3.length();i<0;i--)
		{
			rev=rev+(str3.charAt(i));
		}
		
		System.out.println(rev);
		
		//anagrams
		
		StringBuilder sb1=new StringBuilder("abcba");
		StringBuilder RSB1=sb1.reverse();
		
		if (sb1.equals(RSB1))
			System.out.println("String "+ RSB1 + " is anagram");
		else
			System.out.println("String "+ RSB1 + " is not anagram");
		
		//print first non repetitive character
		
		
		
		

	}

}
