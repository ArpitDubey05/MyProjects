package practice;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="{}}{{{}}";
		char[] c=s.toCharArray();
		int l=s.length();
		//System.out.println("ENtering");
//		if (c[0]=='}')
//			System.out.println("String is not balanced as it starts with "+s.charAt(1));
//		else {
//			if(c[l-1]=='{' )
//				{
//				System.out.println("String is not balanced as it ends with "+s.charAt(l-1));
//				}
//			 }
		int closing=0;
		int opening=0;
		for(int i=0;i<l;i++)
		{
			if (c[0]=='}')
			{
				System.out.println("String is not balanced as it starts with "+s.charAt(1));
				break;
			}
			else {
				if(c[l-1]=='{' )
					{
					System.out.println("String is not balanced as it ends with "+s.charAt(l-1));
					break;
					}
				 }
			
			if(c[i]=='}')
				closing++;
			else
				if(c[i]=='{')
					opening++;
				
		}
		if(closing!=opening)
			System.out.println("string is not balanced");
		
		for(int y=0;y<l-1;y++)
		{
			int m=0;
			int n=0;
			char[][] x= {};
			if(c[y]=='{')
			{
				x[m][n]='{'; m++;
			}
			else 
				{if(c[y]=='}')
					x[m][n+1]='}'; n++;
				}
			System.out.println(x[y][y+1]);
		}
//		set<String> hs;   {}}{{{}}
//		=c Hashset<char>;
//		
	}

}










