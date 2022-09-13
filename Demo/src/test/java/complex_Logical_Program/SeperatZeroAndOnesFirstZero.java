package complex_Logical_Program;

public class SeperatZeroAndOnesFirstZero {

	public static void main(String[] args) {
		
		int a[]= {0,1,1,0,1};
		int m=0;
		int count=2;
		
		
		int b[]=new int[a.length];
		for(int i=0;i<a.length;i++) {
			
			if(a[i]==0) {
				b[m]=a[i];
				m++;
			}
			else
			{
				b[count]=a[i];
				count++;
			}
			
		}
		
		for (int j=0;j<b.length;j++) {
		System.out.print(b[j]+" ");
		}
		
	}

}
