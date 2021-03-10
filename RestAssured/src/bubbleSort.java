
public class bubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr= {101,54,56,23,65};
		int len=arr.length;
		System.out.println(len);
		
		for(int i=0;i<len-1;i++)
		{
			for (int j=0;j<len-1-i;j++)
			{
				if (arr[j]>arr[j+1])
				{
					int temp = arr[j+1];
					arr[j+1]=arr[j];
					arr[j]=temp;
				}
			
		}
			
		}
		for(int x=0;x<len;x++)
		{
			System.out.print(arr[x]+",");
		}
		
	}

	
	
}
