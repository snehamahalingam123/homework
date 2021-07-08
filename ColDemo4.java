package homewrk;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class ColDemo4 {

	public static void main(String[] args) {
		
		Set<String> set=new TreeSet<String>(new MyComparator());
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
        int i=10;
        i+=10;
        System.out.println(i);
	}

}
class MyComparator implements Comparator<String>{
	public int compare(String o1,String o2) {
		return o2.compareTo(o1);
	}
}
