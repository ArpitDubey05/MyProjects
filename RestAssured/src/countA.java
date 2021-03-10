import java.util.Arrays;

public class countA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		char arr[]= {'a','b','d','a','c','a','d','b','e'};
		Arrays.sort(arr);
		int len=arr.length;
		for(int i=0;i<len;i++)
		{
			System.out.println(arr[i]+",");
		}
		
		//int fcount=0;
		for(int i=0;i<len;)
		{
			int count=0;
			char value=arr[i];
			
			while(i<len && value==arr[i])
			{
				//mout.println("i is "+i);
				count++;
				i++;
				
			}
			System.out.println("count of " +value+" is " + count);
			
			
			
			
			
			
		/*		{
			if(arr[i]==value)
				{
				count++;
				}
			else
				{
				System.out.println("count of " +value+" is " + count);
				//count=0;
				//fcount=count;
				}*/	
		
		
		}
		//System.out.println("there are "+count+ " A's in this array");
		}
}


