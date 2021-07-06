package homewrk;
import java.util.Arraylist;
import java.util.List;

public class GenericsInCollection {

	public static void main(String[] args) {
		List<String>list=new ArrayList<>();
		
		list.add("aaaa");
		list.add("bbbb");
		list.add("fdsafdsa");
		
		
		
		for(Object ob:list) {
			String s=(String)ob;
			System.out.println(s);
			
		}

	}

}
class Box{
	
}
