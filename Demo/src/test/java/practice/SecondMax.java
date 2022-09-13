package practice;

public class SecondMax {

	public static void main(String[] args) {
int arr[]= {1,8,2,10};
		
int temp=0;
for(int i=0;i<arr.length;i++) {
	for(int j=i+1;j<arr.length;j++) {
		if(arr[i]<arr[j]) {
			temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
		}
	}
}


System.out.println(arr[1]);

//another method to find the second max


System.out.println("======another method======");

int a[]= {2,4,1,5};
int fmax=a[0];
int smax=a[0];
for(int i=0;i<a.length;i++) {
	if(fmax<a[i]) {
		smax=fmax;
		fmax=a[i];
	}
	else if(smax<a[i]) {
		smax=a[i];
		
	}
}
	System.out.println(fmax);
	System.out.println(smax);


		
	
	
	}
	

}
