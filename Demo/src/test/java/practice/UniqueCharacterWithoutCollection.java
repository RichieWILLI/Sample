package practice;

public class UniqueCharacterWithoutCollection {

	public static void main(String[] args) {
		
		String s="Prasanna";
		for(int i=0;i<s.length();i++) {
			int count=0;
			for(int j=0;j<s.length();j++) {
				if(s.charAt(j)==s.charAt(i) && i!=j) {
					count++;
					break;
				}
				
				
			}
			if(count==0)
				System.out.println(s.charAt(i));
		}
		
		
	}

}
