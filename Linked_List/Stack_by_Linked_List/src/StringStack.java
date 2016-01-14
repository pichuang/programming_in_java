import java.util.LinkedList;

public class StringStack implements Stack {

    private LinkedList<String> stack;

    public StringStack() {
        stack = new LinkedList<String>();
    }

    @Override
    public void push(String str) {
        stack.addFirst(str);
    }

    @Override
    public String pop() {
        return stack.removeFirst();
    }

    @Override
    public String top() {
        return stack.getFirst();
    }

    @Override
    public boolean isEmpty() {
        return stack.isEmpty();
    }

    @Override
    public void print() {
        System.out.println(stack);
    }
}
