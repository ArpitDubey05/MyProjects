
public class insertonSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr= {34,45,33,42,22};
		int len=arr.length;
		int j;
		
		for(int i=1;i<len;i++)
		{
			for(j=i;j>0;j--)
			{
				if(arr[j] < arr[j-1])
				{
					int temp = arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=temp;
				}
				
			}
			//System.out.println(arr[i]);
		}
		for(int x=0;x<len;x++)
		{
			System.out.print(arr[x]+",");
		}
		
	}
}
