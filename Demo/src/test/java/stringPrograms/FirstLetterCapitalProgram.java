package stringPrograms;

public class FirstLetterCapitalProgram {

	public static void main(String[] args) {
		
		String s="my name is richard";
		
		String[] str = s.split(" ");
		for(int i=0;i<str.length;i++) {
			String word=str[i];
			String word2 = word.substring(0, 1).toUpperCase()+word.substring(1);
			System.out.print(word2+" ");
		}
		
		
	}

}
