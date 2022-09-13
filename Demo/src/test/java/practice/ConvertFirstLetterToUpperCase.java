package practice;

public class ConvertFirstLetterToUpperCase {

	public static void main(String[] args) {
		
		String s="welcome to india";
		String[] str = s.split(" ");
		
		for(int i=0;i<str.length;i++) {
			String word=str[i];
			String upstr = word.substring(0, 1).toUpperCase()+word.substring(1);
			System.out.print(upstr+" ");
		}
		
		
	}

}
