package agh.ii.prinjava.proj1.impl;

import agh.ii.prinjava.proj1.MyQueue;

public class MyQueueDLLBImpl<E> implements MyQueue<E> {

    private DLinkList<E> elems;

    /**
     * The constructor allow the class MyQueueDLLBImpl to create link with the DLinkList class
     * MyQueueDLLBImpl is composed of a DLinkList object
     */
    public MyQueueDLLBImpl() { this.elems = new DLinkList<>(); }

    /**
     * The method used for the class are just calling the ones of the DLinkList class
     * We enqueue at the beginning of the queue, so we dequeue at the end
     * @param x
     */
    @Override
    public void enqueue(E x) {elems.addFirst(x);}

    @Override
    public void dequeue() { elems.removeLast();}

    /**
     * This method is used to simplify verifications for the enqueue method in the test class
     * @return E
     */
    @Override
    public E getFirstElem() { return elems.returnFirstElem();}

    /**
     * A peek methode in a Queue returns the last element of the list because we dequeue at the end
     * We also use this method in the test class to verify that the dequeue method is correctly working
     * @return E
     */
    @Override
    public E peek() { return elems.returnLastElem(); }

    /**
     * @return int
     */
    @Override
    public int numOfElems() { return elems.countElems(); }

}
