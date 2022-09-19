package PracticeLogicalProgramforMock;

public class FirstLetterCapital {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="welcome to bangalore";
		for(int i=0;i<s.length();i++) {
			
			String word = s.substring(0, 1).toUpperCase()+s.substring(1);
			System.out.println(word);
		}
		
	}

}
