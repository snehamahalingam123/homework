package homewrk;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ColDemo1 {

	public static void main(String[] args) {
		List <String> list=new ArrayList<>(10);
		list.add("hello");
		list.add("world");
		list.add("hai");
		
		
		System.out.println(list.get(0));
		System.out.println(list.size());
		System.out.println(list.contains("haiii"));
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list.isEmpty());
		list.remove(0);
		System.out.println(list);
		list.set(1," newvalue");
		System.out.println(list);
		Object s[]=list.toArray();
		
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		for(String ss:list) {
			System.out.println(ss);
		}
		Iterator<String> iter=list.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		System.out.println(iter.hasNext());
		ListIterator<String> listiter=list.listIterator();
		while(listiter.hasNext()) {
			System.out.println(listiter.next());
		}
		while(listiter.hasPrevious()) {
			System.out.println(listiter.previous());
		}
		

	}

}
