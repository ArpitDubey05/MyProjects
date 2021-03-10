package javaBasics;

import java.util.HashSet;
import java.util.Iterator;

public class ExampleHashSet {

	public static void main(String[] args) {
		
		HashSet<String> hs = new HashSet<String>();
		hs.add("INDIA");
		hs.add("USA");
		hs.add("UK");
		System.out.println(hs);
		Iterator<String> i = hs.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}

}
