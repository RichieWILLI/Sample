package complex_Logical_Program;

public class PatternProgram {

	public static void main(String[] args) {
		
//		System.out.println("  1  ");
//		System.out.println(" 121 ");
//		System.out.println("12321");
		
		int n=5;
		n=(n+1)/2;
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n-1-i;j++) {
				System.out.print(" ");
			}
			int k=1;
			for(int j=0;j<2*i+1;j++) {
				System.out.print(""+k);
				if(j<((2*i+1)/2)){
					k++;
				}
				else
					k--;
		
			}
			System.out.println();
		}
		
		

}
}
