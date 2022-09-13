package practice;

public class SeggregateTheAlphabetsNumbersSpecialCharacter {

	public static void main(String[] args) {
		String st="j&9012a*v1a";
		String alpha="";
		String num="";
		String splch="";
		
		for(int i=0;i<st.length();i++) {
			if(st.charAt(i)>='A' && st.charAt(i)<='Z' || st.charAt(i)>='a' && st.charAt(i)<='z') {
				alpha=alpha+st.charAt(i);
			}
			else if (st.charAt(i)>='0' && st.charAt(i)<='9') {
				num=num+st.charAt(i);
				
			}
			else {
				splch=splch+st.charAt(i);
			}
			
		}
		System.out.println(alpha+num+splch);

		
		
		
		
		
	}

}
