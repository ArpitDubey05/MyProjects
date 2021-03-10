package javaBasics;

public class MinimumoutoffArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int b[][]= {{10,23,13},{4,15,60},{17,84,90}};
		int min=b[0][0];
		int mincolumn=0;
		int max=min;
		for(int i=0;i<3;i++)
		{
			for(int x=0;x<3;x++)
			{
				//System.out.print(b[i][x]);
				if (b[i][x]<min)
					{
					min=b[i][x];
					mincolumn=x;
					}
					
			}
			
			int k=0;
			
		while(k<2)
		{
			if (b[k][mincolumn]>max)
			{
			max=b[k][mincolumn];;
			//mincolumn=x;
			k++;
			}
		}
		
		}
		System.out.println(min);
		System.out.print(mincolumn);
		System.out.print(max);
	}

}
