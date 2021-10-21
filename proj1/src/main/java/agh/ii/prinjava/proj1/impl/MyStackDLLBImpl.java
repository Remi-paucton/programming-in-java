package agh.ii.prinjava.proj1.impl;

import agh.ii.prinjava.proj1.MyStack;

public class MyStackDLLBImpl<E> implements MyStack<E> {
    private DLinkList<E> elems;

    /**
     * The constructor allow the class MyStackDLLBImpl to create link with the DLinkList class
     * MyStackDLLBImpl is composed of a DLinkList object
     */
    public MyStackDLLBImpl() { this.elems = new DLinkList<>(); }

    /**
     * The method used for the class are just calling the ones of the DLinkList class
     * We push and pop at the beginning of the queue
     * @param x
     */
    @Override
    public void push(E x) { elems.addFirst(x); }
    @Override
    public void pop() { elems.removeFirst();}

    /**
     * A peek methode in a Stack returns the last element of the Stack
     * We also use this method in the test class to verify the enqueue correctly work
     * @return
     */
    @Override
    public E peek() { return elems.returnFirstElem(); }

    @Override
    public int numOfElems() { return elems.countElems(); }
}
