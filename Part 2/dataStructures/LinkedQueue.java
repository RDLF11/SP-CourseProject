package dataStructures;

public class LinkedQueue<E> implements Queue<E> {
    private Node<E> top;
    private Node<E> tail;
    private int size;

    public LinkedQueue() {
        top = null;
        tail = null;
        size = 0;
    }

    public boolean isEmpty() {
        return (top == null);
    }

    public int size() {
        return size;
    }

    public E front() {
        E info = null;
        if (top != null) {
            info = top.getInfo();
        }
        return info;
    }

    public void enqueue(E info) {
        Node<E> node = new Node<E>(info);
        if (tail != null) {
            tail.setNext(node);

        } else {
            top = node;

        }
        tail = node;
        size++;
    }

    public E dequeue() {
        E info = null;
        if (top != null) {
            info = top.getInfo();
            top = top.getNext();
            size--;
            if (isEmpty()) {
                tail = null;
            }
        }
        return info;
    }

    public String toString() {
        String result = "";
        Node<E> aux = top;
        while (aux != null) {
            result = result + aux.getInfo().toString();
            aux = aux.getNext();
        }
        return result;
    }

    public void print() {
        System.out.println(toString());
    }

}
