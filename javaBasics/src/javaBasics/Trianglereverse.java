package javaBasics;

public class Trianglereverse {

	public static void main(String[] args) {
	
		int a=3;
		int b=1;
		
		for(int i=4;i>0; i--)
		{
			for(int j=0;j<b; j++ )
			{
				System.out.print(a + "\t");
				a=a+3;
			}
			System.out.println();
			b++;
		}		
}
}
