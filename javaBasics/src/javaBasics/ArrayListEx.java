package javaBasics;
//import java.util.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListEx {

	public static void main(String[] args) {
//		ArrayList<String> a = new ArrayList<String>();
//		a.add("subhanallah");
//		a.add("MashaAllah");
//		a.add("jai siya raam");
//		
//		a.add(1, "beechme");
//		System.out.println(a);
//		//a.clear();
//		System.out.println(a+" khali hogya");
//		ArrayList<String> b = new ArrayList<String>();
//		//b=a.clone();
//		System.out.println(b);
//		System.out.println(a.get(2));
//		System.out.println(a.contains("hgf"));
		
		ArrayList<Integer> x=new ArrayList<Integer>();
		x.add(1);
		x.add(2);
		x.add(3);
		
		Iterator<Integer> i=x.iterator();
		while(i.hasNext())
			System.out.println(i.next());

	}

}
