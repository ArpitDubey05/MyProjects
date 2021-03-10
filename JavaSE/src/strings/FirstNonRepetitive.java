package strings;

public class FirstNonRepetitive {

	public static void main(String[] args) {
		String input="aabcddeebf";
		for (int i=0;i<input.length();i++)
		{char a=input.charAt(i);
		int b=input.lastIndexOf(input.charAt(i));
			if (i==input.lastIndexOf(input.charAt(i)))
			{
				
				System.out.println("First unique character is "+input.charAt(i));
				break;}
			
	}

		public int firstUniqChar(String s) {
		    int count=-1;
		    if(s == null || s.length() < 1) {
		        return -1;
		    }
		    else if (s.length() == 1) {
		        return 0;
		    }

		    for(Character ch:s.toCharArray()){
		        if(s.indexOf(ch)==s.lastIndexOf(ch)){
		            count=s.indexOf(ch);    
		            break;
		        }

		    }  
		    //If no unique character is found, count will still be -1  
		    return count;    
		}

}
}