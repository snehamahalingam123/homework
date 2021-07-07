package hit.day6;
import java.util.LinkedList;
import java.util.Queue;

public class QueueLinkedlistDemo {

	public static void main(String[] args) {
		Queue<String> queue=new LinkedList<String>();
		queue.offer("Dogs");
		queue.offer("cats");
		queue.offer("Squirrel");
		System.out.println("Queue:"+queue);
		
		String elements=queue.peek();
		System.out.println("Elements to Access:"+elements);
		
		String elements1=queue.poll();
		System.out.println("Elements to remove:"+elements1);
		
		
		String elements2=queue.element();
		System.out.println("elements:"+elements2);
		
		

	}

}
