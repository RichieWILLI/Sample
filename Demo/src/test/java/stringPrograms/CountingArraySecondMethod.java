package stringPrograms;

public class CountingArraySecondMethod {

	public static void main(String[] args) {
		
		String s="Tester";
		String str=s.toLowerCase();
		
		char[] ch = str.toCharArray();
		int count=0;
		
		for(int i=0;i<ch.length;i++) {
			if(ch[i]=='a' || ch[i]=='e' || ch[i]=='i' || ch[i]=='o' ||ch[i]=='u') {
				
				count++;
			}
		}
		System.out.println("the vowels count in the String is : "+count);
		
		
	}

}
