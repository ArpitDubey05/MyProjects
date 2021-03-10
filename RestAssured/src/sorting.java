
public class sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr= {101,54,56,23,65};
		int len=arr.length;
		
		for(int i=0;i<len;i++)
		{
			for(int j=i+1;j<len;j++)
			{
				if (arr[i]>arr[j])
				{
					int temp = arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
				}
			}
			System.out.println(arr[i]);
	    }

}
}