package stringPrograms;

public class ReverseString {

	public static void main(String[] args) {
			
		String s="Tester";
		String rev = "";
		for(int i=s.length()-1;i>=0;i--) {
			System.out.print(s.charAt(i));
		}
		
	}

}
