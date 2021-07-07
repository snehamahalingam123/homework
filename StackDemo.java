package hit.day6;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
	Stack<String> stack=new Stack<String>();
	stack.push("java");
	stack.push("python");
	stack.push("ruby");
	stack.push("java script");
	stack.push("c");
	System.out.println("Stack :"+stack);
	
	String element=stack.pop();
	System.out.println(" Remove the element :"+element);
	
	String element1=stack.peek();
	System.out.println("Element on the top :"+element1);
	
	int position = stack.search("java");
	System.out.println("position  of java :"+position);
	
	boolean programs=stack.empty();
	System.out.println("Is stack is empty?:" +programs);

	}

}
