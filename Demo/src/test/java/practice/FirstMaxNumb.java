package practice;

public class FirstMaxNumb {

	public static void main(String[] args) {
		
int a[]= {2,0,7,9,22};
		
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]<a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			
		}
		
		System.out.println(a[0]);
		System.out.println(a[1]);//second max
	}

}
