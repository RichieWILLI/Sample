package complex_Logical_Program;

public class AddTwoArray {

	public static void main(String[] args) {
		
		int a[]= {2,4,6,7};
		int b[]= {1,3,5};
		int[] c=new int[a.length+b.length];
		
		if(a.length>b.length) {
		for(int i=0;i<b.length;i++) {
			c[i]=a[i]+b[i];
			System.out.print(c[i]+" ");
			
		}
		
		for(int i=b.length;i<a.length;i++) {
			c[i]=c[i]+a[i];
			System.out.print(c[i]+" ");
		}
		
		
		for(int i=0;i<a.length;i++) {
			System.out.print(c[i]+" ");
		}
		
		}
		
		//for second condition
		else if(a.length<b.length) {
			for(int i=0;i<a.length;i++) {
				c[i]=a[i]+b[i];
				
			}
			
			for(int i=a.length;i<b.length;i++) {
				c[i]=c[i]+b[i];
				
			}
			
			
			for(int i=0;i<b.length;i++) {
				System.out.print(c[i]+" ");
			}
			
			}
		else {
			for(int i=0;i<a.length;i++) {
				c[i]=a[i]+b[i];
				System.out.print(c[i]+" ");
				
			}
			
				}
			
		
		
		
	}

}
