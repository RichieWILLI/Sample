package stringPrograms;

public class RemoveDuplicateInTwoStrings {

	public static void main(String[] args) {
		
		String s1="my name is Raj";
		String s2="my name is king";
		
		String[] str1 = s1.split(" ");
		String[] str2 = s2.split(" ");
		
		int count=0;
		for(int i=0;i<str1.length;i++) {
			for(int j=0;j<str2.length;j++) {
				
				if(str1[i]==str2[j] && i==j ){
					
					count++;
				}
				
				
			}
		}
		
		
	}

}
