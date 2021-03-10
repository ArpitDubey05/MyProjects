
public class selectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr= {34,45,33,42,22};
		int len=arr.length;
		
		for(int i=0;i<len;i++)
		{
			for(int j=i+1;j<len;j++)
			{
				if(arr[i]>arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
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
