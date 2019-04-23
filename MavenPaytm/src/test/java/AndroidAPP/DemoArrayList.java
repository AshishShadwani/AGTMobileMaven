package AndroidAPP;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.TreeSet;

public class DemoArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> ali = new ArrayList<Integer>();
		ali.add(11);
		System.out.println(ali.size());
		System.out.println(ali);
		ali.remove(0);
		//ali.add(5, 10);
		ArrayList<String> als = new ArrayList<String>();
		als.add("test");
		
		ArrayList<Object> alo = new ArrayList<Object>();
		
		LinkedList<String> lls = new LinkedList<String>();
		lls.addAll(als);
		lls.offer("test2");
		System.out.println(lls);
		lls.addFirst("test0");
		lls.clone();
		lls.toString();
		String s[] = new String[lls.size()];
		lls.toArray(s);
		System.out.println(s);
		
		TreeSet<Integer> ts = new TreeSet<Integer>();
		
	}

}
