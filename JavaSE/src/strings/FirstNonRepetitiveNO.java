package strings;

public class FirstNonRepetitiveNO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input="aabcdceeb";
		char a = 0;
		outerloop:
		for (int i=0;i<input.length();i++)
		{
			for(int x=i+1;x<input.length();x++)
			{
				if(input.charAt(i)==input.charAt(x)) {
					i++;
					break;
					}
				else
					if(x==input.length()-1) {
						System.out.println("First unique character is "+a);
						break outerloop;}
					else
				    a=input.charAt(i);
			
			}
			
		}
		
		//System.out.println("First unique character is "+a);
	}

}
