package complex_Logical_Program;

import org.apache.commons.collections.bag.SynchronizedSortedBag;

public class FiboneciNumberProgram {

	public static void main(String[] args) {
		
		int previousNUM=0;
		int presentNum=1;
		int fab=0;
		int key=10;
		for(int i=0;i<key;i++) {
			fab=previousNUM+presentNum;
			
			System.out.println(fab);
			
			previousNUM=presentNum;
			presentNum=fab;
			
		}
		
	}

}
