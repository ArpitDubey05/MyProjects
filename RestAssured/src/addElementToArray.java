
public class addElementToArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=8;
		int x=23;
		int arr[]= {29,33,43,77,455,677,65,12};
		int newarr[]=addelement(n, arr,x);
		
		
		int len=newarr.length;
		
		for(int y=0;y<len;y++)
		{
			//System.out.print(newarr[y]+",");
		}
		
		for(int z=0;z<len;z++)
		{
			for(int a=z;a<len;a++)
			{
				if (newarr[z]>newarr[a])
				{
					int temp = newarr[z];
					newarr[z]=newarr[a];
					newarr[a]=temp;
					
					
				}
			}
			System.out.println(newarr[z]);
		}
		System.out.println("Second smallest number is "+newarr[1]);
		System.out.println("Second largest number is "+newarr[len-2]);
		for(int m=0;m<len;m++)
		{
			System.out.print(newarr[m]+",");
		}
		
	}

	
	public static int[] addelement(int n, int arr[], int x)
	{
	
		int newarr[]=new int[n+1];
		int len=newarr.length;
		System.out.println(len);
		
		for(int i=0;i<len-1;i++)
		{
			newarr[i]=arr[i];
			
		}
		
		newarr[n]=x;

		return newarr;

	}
}
