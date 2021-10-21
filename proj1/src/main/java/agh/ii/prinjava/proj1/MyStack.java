package agh.ii.prinjava.proj1;

import agh.ii.prinjava.proj1.impl.MyStackDLLBImpl;

public interface MyStack<E> {

    /**
     * They are the main function of the MyStack class
     * @param x
     */
    void push(E x);
    void pop();


    default boolean isEmpty() {return numOfElems() == 0;}

    /**
     * @return int
     */
    int numOfElems();

    /**
     * We use it mainly in the test class
     * @return E
     */
    E peek();

    /** Consider pros and cons of having a factory method in the interface */
    static <T> MyStack<T> create() {return new MyStackDLLBImpl<T>();}
}
