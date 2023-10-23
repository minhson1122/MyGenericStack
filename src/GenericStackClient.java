public class GenericStackClient {
    public static void stackOfIstring(){
        MyGenericStack<String> stack = new MyGenericStack<>();
        stack.push("five");
        stack.push("for");
        stack.push("three");
        stack.push("two");
        stack.push("one");
        System.out.println("1.Size of stack after push operations :" + stack.size());
        System.out.println("2.Pop elements from stack :");
        while (!stack.isEmpty()) {
            System.out.printf(" %s", stack.pop());
        }
        System.out.println("\n3. Size of stack after pop operations : " + stack.size());
    }
    public static void stackOfInterger(){
        MyGenericStack<Integer> stack1 = new MyGenericStack<>();
        stack1.push(1);
        stack1.push(2);
        stack1.push(3);
        stack1.push(4);
        stack1.push(5);
        System.out.println("1.Size of stack after push operations :" + stack1.size());
        System.out.println("2.Pop elements from stack :");
        while (!stack1.isEmpty()) {
            System.out.printf(" %s", stack1.pop());
        }
        System.out.println("\n3. Size of stack after pop operations : " + stack1.size());
    }

    public static void main(String[] args) {
        System.out.println("1.Stack of Interger");
        stackOfInterger();
        System.out.println("2.Stack of String");
        stackOfIstring();

    }

}
