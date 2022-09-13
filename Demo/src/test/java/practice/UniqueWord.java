package practice;

import java.util.LinkedHashSet;

public class UniqueWord {

	public static void main(String[] args) {
		
		String s="what is your name and what is your work and where are you from";
		String[] sp = s.split(" ");
		
		for(int i=0;i<sp.length;i++) {
			String s1 = sp[i];
			String word = s1.substring(0, 1).toUpperCase()+s1.substring(1);
			System.out.print(word+" ");
			
			
		}
		System.out.println();
		
		LinkedHashSet hs=new LinkedHashSet();
		for(int i=0;i<sp.length;i++) {
			hs.add(sp[i]);
		}
		
		for (Object it : hs) {
			int count=0;
			for(int i=0;i<sp.length;i++) {
				if(it.equals(sp[i])) {
					count++;
				}
			}
			if(count==1) {
				System.out.println(it+" "+count);
			}
			
		}
		
	}

}
