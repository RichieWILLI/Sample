package complex_Logical_Program;

public class SeperateZeroANdOnesFirstZeroSecondMethod {

	public static void main(String[] args) {
		
		int a[]= {0,1,0,1,1};
		
		for(int i=0;i<a.length;i++) {
			
			if(a[i]==0) {
			System.out.print(a[i]+" ");
			}
		}
		for(int i=0;i<a.length;i++) {
			
			if(a[i]!=0) {
			System.out.print(a[i]+" ");
			}
		}
		
	}

}
