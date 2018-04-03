package pl.dominisz.stack;

/**
 * http://dominisz.pl
 * 03.04.2018
 */
public interface Stack<E> {

    void push(E element);
    E pop();
    boolean isEmpty();

}
