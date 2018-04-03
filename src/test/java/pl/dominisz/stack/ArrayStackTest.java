package pl.dominisz.stack;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * http://dominisz.pl
 * 03.04.2018
 */
class ArrayStackTest {

    @Test
    @DisplayName("should contain one element after adding element to empty stack")
    void push() {
        Stack<String> stack = new ArrayStack<>();
        String element = "element";
        stack.push(element);
        String actualElement = stack.pop();
        assertEquals(element, actualElement);
        assertTrue(stack.isEmpty());
    }

    @Test
    void pop() {
    }

    @Test
    void isEmpty() {
    }
}