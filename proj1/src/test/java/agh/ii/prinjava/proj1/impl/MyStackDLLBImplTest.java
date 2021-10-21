package agh.ii.prinjava.proj1.impl;

import agh.ii.prinjava.proj1.MyStack;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyStackDLLBImplTest {
    MyStack<Integer> stackOfInts = MyStack.create();

    /**
     * From the BeforeEach we have a Stack of 3 elements set for all the test: 1<->2<->3
     */
    @BeforeEach
    void setUp() {
        stackOfInts.push(3);
        stackOfInts.push(2);
        stackOfInts.push(1);
    }

    /**
     * The test will call the method 'pop' which add item in the beginning of the stack
     * But the method called modify the stack without returning anything
     * We are using a 2nd method which return the data of first element of queue to check if it has been correctly added
     */
    @Test
    void pushStack() {
        stackOfInts.push(78);
        Assertions.assertEquals(78, stackOfInts.peek());
        stackOfInts.push(56);
        Assertions.assertEquals(56, stackOfInts.peek());
        stackOfInts.push(34);
        Assertions.assertEquals(34, stackOfInts.peek());
    }

    /**
     * From the BeforeEach we have a stack of 3 elements: 1<->2<->3
     * We will remove them one by one and return the last elem each time: (2)<->(3)  ; then: <-(3)->
     * The third time we must have a null result
     * The last time we will have a throw exception message 'the list is empty'
     */
    @Test
    void popStack() {
        stackOfInts.pop();
        Assertions.assertEquals(2, stackOfInts.peek());
        stackOfInts.pop();
        Assertions.assertEquals(3, stackOfInts.peek());
    }

    /**
     * We add one element to the stack and count the size of the stack
     * We pop element of the stack one by one and count them each time
     * When the stack is empty we test the isEmpty method in an IF statement
     */
    @Test
    void countTheElemOfStack() {
        stackOfInts.push(4);
        Assertions.assertEquals(4, stackOfInts.numOfElems());
        stackOfInts.pop();
        Assertions.assertEquals(3, stackOfInts.numOfElems());
        stackOfInts.pop();
        Assertions.assertEquals(2, stackOfInts.numOfElems());
        stackOfInts.pop();
        Assertions.assertEquals(1, stackOfInts.numOfElems());
        stackOfInts.pop();
        if (stackOfInts.isEmpty()) { Assertions.assertEquals(0, stackOfInts.numOfElems()); }
    }


}