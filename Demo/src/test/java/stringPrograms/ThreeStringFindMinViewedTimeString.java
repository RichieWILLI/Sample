package stringPrograms;

import java.util.ArrayList;
import java.util.TreeSet;

import org.apache.commons.collections.bag.SynchronizedSortedBag;

public class ThreeStringFindMinViewedTimeString {

	public static void main(String[] args) {
		
		String s1="movie1 duration 2:30";
		
		String s2="movie2 duration 3:00";
		String s3="movie3 duration 2:10";
		
//		String[] str1 = s1.split(" ");
//		String[] str2 = s2.split(" ");
//		String[] str3 = s3.split(" ");
//		
//		TreeSet<String> t1=new TreeSet<String>();
//		TreeSet<String> t2=new TreeSet<String>();
//		TreeSet<String> t3=new TreeSet<String>();
//		
//		for(int i=0;i<str1.length;i++) {
//			t1.add(str1[i]);
//		}
//		for(int i=0;i<str2.length;i++) {
//			t2.add(str2[i]);
//		}
//		for(int i=0;i<str3.length;i++) {
//			t3.add(str3[i]);
//		}
//		
//		for (String set1 : t1) {
//			
//			
//		}
		
		
		String str=s1+" "+s2+" "+s3;
		
		String[] s = str.split(" ");
		TreeSet<Character> set=new TreeSet<Character>();
		
		System.out.println(str);
		for(int j=0;j<s.length;j++) {
			char[] ch = s[j].toCharArray();
			
			
		
		for(int i=0;i<ch.length;i++) {
			set.add(ch[i]);
		}
		
		
		
		
		}
		
		
	}

}
