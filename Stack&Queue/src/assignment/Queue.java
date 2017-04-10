package assignment;

public class Queue {
	
	 /**
	    * Adds a String element to the queue
	    * @param queue
	    * @param word 
	    */
	public static void enqueue(Queue queue, String word){
	       queue.add(word);
	       System.out.println("enqueue(" + word + ")");
	   }
	
	public void add(String word) {
		
	}

	public static String dequeue(Queue queue){
        String removed = (String)queue.remove();
        System.out.println("dequeue(" + removed + ")");
        return removed;
    }

	public String remove() {
		return null;
	}
	
	public static String peek(String word){
		System.out.println("Peek -> ");
		return word;
	}

}
