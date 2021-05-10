package dataStructures;

public class Node<E> {

    private E info;
    private Node<E> next;

    public Node() {
        this(null, null);
    }

    public Node(E info) {
        this(info, null);
    }

    public Node(E info, Node<E> next) {
        setInfo(info);
        setNext(next);
    }

    public E getInfo() {
        return this.info;
    }

    public void setInfo(E info) {
        this.info = info;
    }

    public Node<E> getNext() {
        return this.next;
    }

    public void setNext(Node<E> next) {
        this.next = next;
    }

    public String toString() {
        if (info != null) {
            return info.toString();
        } else {
            return null;
        }
    }

}
