package hit.day6;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueuePriorityDemo {

	public static void main(String[] args) {
		Queue<String>queue=new PriorityQueue<String>();
		queue.offer("chocolates");
		queue.offer("candy");
		queue.offer("wafer");
		System.out.println("Queue :"+queue);
		
		
		String elements=queue.peek();
		System.out.println("elements to Access:"+elements);
		
		
		String elements1=queue.poll();
		System.out.println("elements to remove:"+elements1);
		
		
		String elements2=queue.element();
		System.out.println("elements:"+elements);

	}

}
