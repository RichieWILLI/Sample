package practice;

public class AscendingOrderProgramUsingBubbleSort {

	public static void main(String[] args) {
		
		int ary[]= {12,45,11,2,1};
		
		for(int i=0;i<ary.length;i++) {
			for(int j=i+1;j<ary.length;j++) {
				if(ary[i]>ary[j]) {
					int temp=ary[i];
					ary[i]=ary[j];
					ary[j]=temp;
				}
			}
			System.out.print(ary[i]+" ");
		}
//		for(int i=0;i<ary.length;i++) {
//			
//		}
		
	}

}
