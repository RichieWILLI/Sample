package practice;

import java.util.LinkedHashSet;

public class CombinationOfSimilarCharacter2ndMethod {

	public static void main(String[] args) {
		
		String st="gghhjjkbhnalaaaqbcbcbdhdz";
		
		LinkedHashSet<Character> hs=new LinkedHashSet<Character>();
		
		for(int i=0;i<st.length();i++) {
			hs.add(st.charAt(i));
		}
		
		for (Character ch : hs) {
			for(int i=0;i<st.length();i++) {
				if(ch.equals(st.charAt(i))) {
					System.out.print(ch);
				}
			}
			System.out.print(",");
		}
	}

}
