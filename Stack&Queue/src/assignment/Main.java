package assignment;

import java.util.EmptyStackException;
import java.util.LinkedList;

public class Main {
	public static void push(Stack st, String a){
		Stack.push(st, new String(a));
		System.out.println("push(" + a + ")");
	}
	public static String pop(Stack st){
		System.out.print("pop -> ");
		String a = (String) Stack.pop(st);
		System.out.println(a);
		return a;
		
	}
	public static void enqueue(LinkedList<String> queue, String word){
	       queue.add(word);
	       System.out.println("enqueue(" + word + ")");
	   }
	public static String dequeue(LinkedList<String> queue){
        String removed = (String)queue.remove();
        System.out.println("dequeue(" + removed + ")");
        return removed;
    }
	public static void transferFromStackToQueue(Stack st, LinkedList<String> queue){
		   while(!st.isEmpty()){
		   enqueue(queue, pop(st));
		   }
	}   
	public static void main(String[] args) {
		 
		Stack st = new Stack();
	        System.out.println("stack: " + st);
	        
	        push(st, "1");
	        push(st, "2");
	        push(st, "3");
	        System.out.println("stack: " + st);
	        
	        pop(st);
	        System.out.println("stack: " + st);
	        pop(st);
	        System.out.println("stack: " + st);
	        pop(st);
	        System.out.println("stack: " + st);
	        
	        try {
	             pop(st);
	        }catch (EmptyStackException e) {
	             System.out.println("empty stack");
	        }
	        LinkedList<String> queue=new LinkedList<String>(); 
	        
	        enqueue(queue, "This");
	        enqueue(queue, "is");
	        enqueue(queue, "the");
	        System.out.println("queue: " + queue.toString());
	        
	        enqueue(queue, "lab");
	        enqueue(queue, "8");
	        enqueue(queue, "assignment");
	        
	        System.out.println("queue: " + queue.toString());
	        System.out.println("Head:"+queue.element());
	        System.out.println("Head:"+queue.peek());  
	        
	        dequeue(queue);
	        dequeue(queue);
	        System.out.println("After removing two elements:");
	        System.out.println("queue: " + queue.toString());
	        queue.clear();
	        System.out.println("queue: " + queue.toString());
	        
	        push(st, "This");
	        push(st, "is");
	        push(st, "still");
	        push(st, "part");
	        push(st, "of");
	        push(st, "stacks");
	        push(st, "and");
	        push(st, "queues");
	        System.out.println("stack: "+ st);
	        transferFromStackToQueue(st, queue);
	        while(!st.isEmpty()){
	            pop(st);
	            System.out.println("stack: " + st);
	            dequeue(queue);
	            System.out.println("queue: " + queue.toString());
	        }
	}
}
