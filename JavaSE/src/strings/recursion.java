package strings;

public class recursion {
	 static int count=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String i="xyz";
		recursionex("xyz");
	}
 
	
	
	static void recursionex(String ip)
 {
	 if (count<5)
	 {count++;
	 System.out.println(ip+count);
	 recursionex(ip);
 }
}
}