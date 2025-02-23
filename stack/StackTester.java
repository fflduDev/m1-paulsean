package stack;

public class StackTester {
	
	public static void runTests(Stack<String> stack) {

		System.out.println(stack.isEmpty()); // true 

		stack.push("first");

		System.out.println(stack.isEmpty()); // false
		
		System.out.println(stack.peek()); // first
		System.out.println(stack.pop()); // returns first, now nothing in stack

		System.out.println(stack.isEmpty()); // true

		stack.push("second");
		stack.push("third");
		stack.push("fourth");

		System.out.println(stack.isEmpty()); // false
		
		System.out.println(stack.isFull()); // will never return true on a linked list implementation

		System.out.println(stack.peek()); // fourth

		System.out.println(stack.pop()); // fourth
		System.out.println(stack.pop()); // third
		System.out.println(stack.pop()); // second

		System.out.println(stack.isEmpty()); // true
		
	}

}
