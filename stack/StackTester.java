package stack;

public class StackTester {

    public static void runTests(Stack<String> stack) {

        stack.push("Paul");															//Adding to stack
        stack.push("Sean");
        stack.push("Jasiu");
        stack.push("Ronny");

        System.out.println("Stack size: " + stack.size());								//Displaying stack size
        stack.display();

        System.out.println("");

        System.out.println("Peek: " + stack.peek());									//Displaying top of stack

        System.out.println("");

        System.out.println("Pop: " + stack.pop());										//Pop stack

        stack.push("Jeffrey");														//Adding 2 entries to stack									
        stack.push("Jared");

        System.out.println("");

        System.out.println("Peek: " + stack.peek());									//Displaying top of stack

        System.out.println("");
        
        while (!stack.isEmpty()) {                                                      //Popping all entries from stack
            								                                            
            System.out.println("Pop: " + stack.pop());
            
        }
        
		System.out.println("Is empty: "+ stack.isEmpty());								//Checking if stack is empty

    }

}
