package agh.ii.prinjava.proj1.impl;


/**
 * The structure of the linked list is composed only by one Node object
 * It will be the head, the first element, of our list
 * @param <E>
 */
public class DLinkList<E> {
    private Node<E> head;


    private static class Node<T> {
        T elem;
        Node<T> next;
        Node<T> prev;

        public Node(T elem) {
            this.elem = elem;
            this.next = null;
            this.prev = null;
        }
    }

    /**
     * We create a new node, we link him with the ancient head
     * If the list is empty or not, we set the new node as head
     * @param data
     */
    public void addFirst(E data) {
        Node<E> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    /**
     * We create a Node, run through the list and link the new node with last elem
     * @param data
     */
    public void addLast(E data){
        Node<E> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
        }else {
            Node<E> tmp = head;
            while (tmp.next != null) {
                tmp = tmp.next;
            }
            newNode.prev = tmp;
            tmp.next = newNode;
        }
    }


    /**
     * If the list is empty we do nothing
     * if there is one elem the head Node is becoming null
     * if the list is more than one elem we set the head as the next element
     */
    public void removeFirst() {
        // the old way
        if (head == null) { throw new IllegalStateException("THE LIST IS EMPTY :/"); }
        else if (head.next == null) {
            head = null;
        } else {
            head = head.next;
            head.prev = null;
        }
    }

    /**
     * If the list is empty we do nothing
     * if there is one element the head Node is becoming null
     * if the list is more than one elem, we run through the list with a temp element until it's pointing the last one
     * we break the link between them and return the data of the new last element
     * we return the data to make easier and more readable test
     */
    public void removeLast() {
        if (head == null) {throw new IllegalStateException("THE LIST IS EMPTY :/");}

        else if (head.next == null) {
            head = null;
        } else {
            Node<E> tmp = head;
            while (tmp.next.next != null) {
                tmp = tmp.next;
            }
            tmp.next = null;
        }

    }

    /**
     * We run through the list with a temp until the elem point next to a void and return the data of it
     * it's returning the data and not a node object, because it's easier to test and read
     * @return E
     */
    public E returnLastElem() {
        if (head == null) {throw new IllegalStateException("THE LIST IS EMPTY :/");}

        else {
            Node<E> tmp = head;
            while (tmp.next != null) {
                tmp = tmp.next;
            }
            E dataOfElem = tmp.elem;
            return dataOfElem;
        }
    }

    /**
     * We return the data of the head of the list
     * @return E
     */
    public E returnFirstElem() {
        if (head == null) { throw new IllegalStateException("THE LIST IS EMPTY :/"); }

        else {
            E dataOfElem = head.elem;
            return dataOfElem;
        }
    }

    /**
     * We just run through the list wih a counter
     * @return int
     */
    public int countElems(){
        Node<E> tmp = head;
        int counter = 0;
        if (head == null) {return counter;}
        else {
            counter++;
            while (tmp.next != null) {
                counter++;
                tmp = tmp.next;
            }
            return counter;
        }
    }

    /**
     * @return String
     */
    @Override
    public String toString() {
        Node tmp = head;
        System.out.print("DLinkList :  {");
        if (head == null){
            System.out.println("empty");
        }else {
            while (tmp != null) {
                System.out.print(" <-" + tmp.elem + "->");
                tmp = tmp.next;
            }
        }
        return (" }");
    }
}

