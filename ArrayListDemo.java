package homewrk;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
public class ArrayListDemo {
	public static void main(String[] args) {
	
				String s[]=new String[4];
				s[0]="hello";
				
				
				for(int i=0;i<s.length;i++) {
					System.out.println(s[i]);
				}
				
				for(String str:s) {
					System.out.println(str);
				}
				
				
		List list=new ArrayList();
		
		list.add("hello world");
		list.add("hai");
		list.add(120);
		list.add(new Stone());
		
		
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
		for(Object o:list) {
			System.out.println(o);
		}
		
		Iterator iter=list.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		ListIterator listIter=list.listIterator();
		
		
		while(listIter.hasNext()) {
			System.out.println(listIter.next());
		}
		while(listIter.hasPrevious()) {
			System.out.println(listIter.previous());
		}
	}
}
class Stone{
	
}


