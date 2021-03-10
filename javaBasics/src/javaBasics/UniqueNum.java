package javaBasics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class UniqueNum {

	public static void main(String[] args) {
		int arr[]= {4,5,5,6,6,3,3,3,4,4,3,3,5,5,6,7,6};
		//Print which int is repeated how many times.
		
		//ArrayList a = new ArrayList();
		for(int i=0;i<arr.length; i++)
		{
			//int k=0;
			HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
			
			if(!hm.containsKey((arr[i])))
			{
				hm.put(i, (arr[i]));
				System.out.println(hm);
				/*Set<E> sn=hm.entrySet();
				sn.iterator();
				
				for(k=i+1; k<arr.length; k++)
				{
					if(hm.)
				}*/
			}
		}

	}

}
