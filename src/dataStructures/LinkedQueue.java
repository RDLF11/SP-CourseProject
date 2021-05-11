package dataStructures;

public class LinkedQueue<E> implements Queue<E> {

    //Attributes
    private Node<E> top;
    private Node<E> tail;
    private int size;

    //Constructors

    //initialize an empty LQ
    public LinkedQueue() {
        top = null;
        tail = null;
        size = 0;
    }

    //Methods
    public boolean isEmpty() {
        return (top == null); //if top is empty, no LQ exists
    }

    public int size() {
        return size;
    }

    //set the first node of the LQ
    public E front() {
        E info = null;
        if(top != null) {
            info = top.getInfo();
        }
        return info;
    }

    //input a new node into the queue
    public void enqueue(E info) {
        Node <E> node = new Node<E>(info);
        if(tail != null) {
            tail.setNext(node);
        } else {
            top = node;
        }
        tail = node;
        size++;
    }

    //pull out a node from the queue
    public E dequeue() {
        E info = null;
        if(top != null) {
            info = top.getInfo();
            top = top.getNext();
            size--;
            if(isEmpty()) {
                tail = null;
            }
        }
        return info;
    }

    //toString method
    public String toString() {
        String result = "";
        Node<E> aux = top;
        while(aux != null) {
            result = result + aux.getInfo().toString();
            aux = aux.getNext();
        }
        return result;
    }

    //print out toString method text
    public void print() {
        System.out.println(toString());
    }
    
}
