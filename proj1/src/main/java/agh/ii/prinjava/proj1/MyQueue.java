package agh.ii.prinjava.proj1;

import agh.ii.prinjava.proj1.impl.MyQueueDLLBImpl;

public interface MyQueue<E> {

    /**
     * They are the main function of the MyQueue class
     * @param x
     */
    void enqueue(E x);
    void dequeue();

    /**
     * We use them mainly in the test class
     * @return E
     */
    E getFirstElem();

    /**
     * @return E
     */
    E peek();

    /**
     * @return int
     */
    int numOfElems();
    default boolean isEmpty() {return numOfElems() == 0;}


    /** Consider pros and cons of having a factory method in the interface */
    static <T> MyQueue<T> create() {return new MyQueueDLLBImpl<>();}
}
