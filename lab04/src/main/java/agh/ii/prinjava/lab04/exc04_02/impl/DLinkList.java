package agh.ii.prinjava.lab04.exc04_02.impl;

public class DLinkList<E> {
    Node head;

    public DLinkList() {
        head = null;
    }

    private static class Node<T> {
        T elem;
        Node<T> next;
        Node<T> prev;

        public Node (T elem) {
            this.elem = elem;
            this.next = null;
            this.prev = null;
        }
    }

    public void addAtBeginning(E data){
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        }else{
            newNode.next = head;
            head.prev = newNode;
        }
    }

    public void addAtEnd(E data){
        Node newNode = new Node(data);
        if (head == null) {head = newNode;}
        else{
            Node tmp = head;
            while (tmp.next != null){
                tmp = tmp.next;
            }
            newNode = tmp;
        }
    }

    public void removeFromBeginning (E data){
        if (head == null) {
            // do a throw
        }else if(head.next == null){ head = null;}
        else{
            head = head.next;
            head.prev = null;
        }
    }





     /*public boolean isEmpty(){
        if (head == null){
            return true;
        }else{
            return false
        }
    }*/

}
