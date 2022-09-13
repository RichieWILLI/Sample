package practice;

public class ReverseTheWordInString {

	public static void main(String[] args) {
		
		String s="Harish is very Brilliant Boy and Good Human Being";
		
		String[] sp = s.split(" ");
		for(int i=sp.length-1;i>=0;i--) {
			System.out.print(sp[i]+" ");
		}
	}

}
