package complex_Logical_Program;

public class SeperateZeroAndOnesThirdMethod {

	public static void main(String[] args) {
		
		int a[]= {1,0,1,1,0};
		int count=2;
		int b[]=new int[a.length];
		int m=0;
		for(int i=0;i<a.length;i++) {
			
			if(a[i]==0) {
				b[m]=a[i];
				m++;
			}
			
		}
		for(int j=0;j<a.length;j++) {
			if(b[j]!=0) {
				b[count]=a[j];
				count++;
			}
		}
		
		for(int k=0;k<b.length;k++) {
			System.out.println(b[k]);
		}
		
		
	}

}
