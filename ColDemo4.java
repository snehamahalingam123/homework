package homewrk;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class ColDemo4 {

	public static void main(String[] args) {
		
		Set<String> set=new TreeSet<String>();
		set.add("hello");
		set.add("hai");
		set.add("hello");
		set.add("world");
		set.add("earth");
		
		System.out.println(set);
		set.add("zebra");
		set.add("almighty");
		
		
		Iterator iter=set.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		for(String ss:set) {
			System.out.println(ss);
		}

	}

}
