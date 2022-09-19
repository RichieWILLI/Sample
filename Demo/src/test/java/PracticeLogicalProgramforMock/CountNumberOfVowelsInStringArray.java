package PracticeLogicalProgramforMock;

public class CountNumberOfVowelsInStringArray {

	public static void main(String[] args) {
		
		String [] s= {"apple","green","quality","pineapple"};
		
		for(int i=0;i<s.length;i++) {
			String word=s[i];
			int count=0;
			for(int j=0;j<word.length();j++) {
				if(word.charAt(j)=='a' || word.charAt(j)=='e' || word.charAt(j)=='i' || word.charAt(j)=='o' || word.charAt(j)=='u') {
					count++;
				}
			}
			System.out.println(word+" "+count);
		}
		
		
//		for(int i=0;i<s.length;i++) {
//			char[] ch = s[i].toCharArray();
//			int count=0;
//			for(int j=0;j<ch.length;j++) {
//				if(ch[j]=='a' || ch[j]=='e' || ch[j]=='o' || ch[j]=='i' || ch[j]=='u') {
//					count++;
//				}
//			}
//			System.out.println(s[i]+" "+count);
//			
//		}
		
	}

}
