
public class Addelement {

	
	public static int[] adde(int len, int arr[],int tobeadded)
	{
		
		int newarr[]=new int[len+1];
		System.out.println("new array length" + newarr.length);
		for(int i=0;i<len;i++)
		{
			newarr[i]=arr[i];
		}
		newarr[len]=tobeadded;
		
		return newarr;
		
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int []arr= {3,54,23,65,34};
		int len=arr.length;
		int tobeadded=77;
		
		int newarr[]=adde(len,arr,tobeadded);
		int newlen=newarr.length;
		
		
		for(int i=0;i<newlen;i++)
		{
			for(int n=0;n<newlen-1;n++)
			{
				if (newarr[n] > newarr[n+1])
				{
					int temp = newarr[n+1];
					newarr[n+1]=newarr[n];
					newarr[n]=temp;
				}
			}
		}
		
		for(int x=0;x<=len;x++)
		{
			System.out.print(newarr[x]+",");
		}
		
		
	}

}
