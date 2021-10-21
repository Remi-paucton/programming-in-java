package agh.ii.prinjava.proj1.impl;

import agh.ii.prinjava.proj1.MyQueue;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyQueueDLLBImplTest {
    MyQueue<Integer> queueOfInts = MyQueue.create();

    /**
     * From the BeforeEach we have a queue of 3 elements set for all the test: (1)<->(2)<->(3)
     */
    @BeforeEach
    void setUp() {
        queueOfInts.enqueue(3);
        queueOfInts.enqueue(2);
        queueOfInts.enqueue(1);
    }


    /**
     * The test will call the method 'enqueue' which add item in the beginning of the queue
     * but the method called modify the queue without returning anything
     * We are using a 2nd method which return the data of first element of queue to check if it has been correctly added
     */
    @Test
    void enqueuList() {
        queueOfInts.enqueue(78);
        Assertions.assertEquals(78, queueOfInts.getFirstElem());
        queueOfInts.enqueue(56);
        Assertions.assertEquals(56, queueOfInts.getFirstElem());
        queueOfInts.enqueue(34);
        Assertions.assertEquals(34, queueOfInts.getFirstElem());
    }


    /**
     * From the BeforeEach we have a queue of 3 elements: 1<->2<->3
     * We will remove them one by one and return the last elem each time: (1)<->(2)  ; then: <-(1)->
     * The third time we must have a null result
     * The last time we will have a throw exception message 'the list is empty'
     */
    @Test
    void dequeueList() {
        queueOfInts.dequeue();
        Assertions.assertEquals(2, queueOfInts.peek());
        queueOfInts.dequeue();
        Assertions.assertEquals(1, queueOfInts.peek());
    }

    /**
     * We add one element to the queue and count the size of the queue
     * We dequeue element in the queue one by one and count them each time
     * When the queue is empty we test the isEmpty method in an IF statement
     */
    @Test
    void countTheElemOfQueue() {
        queueOfInts.enqueue(4);
        Assertions.assertEquals(4, queueOfInts.numOfElems());
        queueOfInts.dequeue();
        Assertions.assertEquals(3, queueOfInts.numOfElems());
        queueOfInts.dequeue();
        Assertions.assertEquals(2, queueOfInts.numOfElems());
        queueOfInts.dequeue();
        Assertions.assertEquals(1, queueOfInts.numOfElems());
        queueOfInts.dequeue();
        if (queueOfInts.isEmpty()) { Assertions.assertEquals(0, queueOfInts.numOfElems()); }
    }
}