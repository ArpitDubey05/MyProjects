package strings;

import java.util.Arrays;

public class DuplicateChar {

	public static void main(String[] args) {
		// how to find duplicate characters and their count
		String str = "pabccbcaaa";
		// aabc
		char[] ch = str.toCharArray();
		Arrays.sort(ch);

		for (char chx : ch) {
			System.out.print(chx);
		}
		int count = 1;
		
		for (int i = 0; i < ch.length; i = i + count) {
			count = 1;
			if (i == ch.length - 1)
			{
				System.out.println("count of " + ch[i] + " is 1");
			break;	
			}
			for (int x = i + 1; x < ch.length; x++) {
				if (ch[i] == ch[x]) {
					count++;

				} else {
					System.out.println("count of " + ch[i] + " is " + count);
					// i=i+count;

					break;
				}
				
			}

		}
	}
}
