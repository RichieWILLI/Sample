package complex_Logical_Program;

public class AddTwoArraySimpleMethod {

	public static void main(String[] args) {
		
		int a[]= {2,4,6};
		
		int b[]= {1,3,5,9};
		
		int length=a.length;
		
		if(a.length<b.length) {
			length=b.length;
		}
		for(int i=0;i<length;i++) {
			
			
			try {
			System.out.print(a[i]+b[i]+" ");
			}
			catch (Exception e) {
				if(a.length<b.length) {
					System.out.print(b[i]);
				}
				else {
					System.out.print(a[i]);
				}
			}
			
		}
		
	}

}
