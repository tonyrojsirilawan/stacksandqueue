package assignment;

public class Stack {

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
	
	public static Stack peek(Stack st){
		System.out.println("Peek -> ");
		return st;
	}
	
}
