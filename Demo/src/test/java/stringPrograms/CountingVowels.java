package stringPrograms;

public class CountingVowels {

	public static void main(String[] args) {
		String str="Richard";
		String s=str.toLowerCase();
		int count=0;
		System.out.println(s);
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='a'|| s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u') {
				count++;
				System.out.print(s.charAt(i)+" ");
			}
		}
		System.out.println();
		System.out.println("count is : "+count);
	}

}
