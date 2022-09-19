package PracticeLogicalProgramforMock;

public class OCcuraneInSenetence {

	public static void main(String[] args) {
		
		String s="welcome welcome thank thank you";
		String[] str = s.split(" ");
		for(int i=0;i<str.length;i++) {
			String word = str[i];
			int count=0;
			for(int j=0;j<str.length;j++) {
				if(str[i]==str[j] && i!=j) {
					count++;
					break;
				}
			}
			if(count==0) {
				System.out.println(str[i]+" "+count);
			}
		}
		
	}

}
