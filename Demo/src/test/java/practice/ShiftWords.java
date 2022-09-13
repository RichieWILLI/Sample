package practice;

public class ShiftWords {

	public static void main(String[] args) {
		String s="how are you santruptha";
		String[] sp = s.split(" ");
		int key=3;
		for(int k=0;k<key;k++) {
			String temp=sp[0];
			for(int i=1;i<sp.length;i++) {
				sp[i-1]=sp[i];
			}
			sp[sp.length-1]=temp;
		}
		
		for (String it : sp) {
			System.out.print(it+" ");
			
		}
	}

}
