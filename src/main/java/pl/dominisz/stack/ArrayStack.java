package pl.dominisz.stack;

/**
 * http://dominisz.pl
 * 03.04.2018
 */
public class ArrayStack<E> implements Stack<E> {

    private static final int DEFAULT_SIZE = 10;
    private Object[] elements;
    private int count;

    public ArrayStack() {
        elements = new Object[DEFAULT_SIZE];
        count = 0;
    }

    @Override
    public void push(E element) {
        elements[count] = element;
        count++;
    }

    @Override
    @SuppressWarnings("unchecked")
    public E pop() {
        if (count > 0) {
            count--;
            return (E)elements[count];
        } else {
            throw new IllegalStateException("Stack is empty");
        }
    }

    @Override
    public boolean isEmpty() {
        return count == 0;
    }

}
