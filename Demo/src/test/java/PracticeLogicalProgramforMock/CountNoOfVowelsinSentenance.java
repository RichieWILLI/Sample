package PracticeLogicalProgramforMock;

public class CountNoOfVowelsinSentenance {

	public static void main(String[] args) {
		
		
		String s="hello may i know your name and may i know where are you from";
		String[] wo=s.split(" ");
		for(int i=0;i<wo.length;i++) {
			String word = wo[i];
			int count=0;
			
			for(int j=0;j<word.length();j++) {
				if(word.charAt(j)=='a' || word.charAt(j)=='e' ||word.charAt(j)=='i' || word.charAt(j)=='o' || word.charAt(j)=='u') {
					count++;
				}
			}
			System.out.println(wo[i]+"===="+count);
		}
		
		
		
	}

}
