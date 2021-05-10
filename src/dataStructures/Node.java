package dataStructures;

//Rodrigo De Lama
//100451775

public class Node<E> {

    //Attributes
    private E info; //node "insides" (stored info)
    private Node<E> next; //reference to the next node

    //Constructors
    public Node() {
        this(null, null); //initialized as empty and alone
    }

    public Node(E info) {
        this(info, null); //initialized a null with info, but no references
    }

    public Node(E info, Node<E> next) {
        setInfo(info); //setter for info
        setNext(next); //setter for next node (reference)
    }

    //Methods
    //Getters and Setters
    public E getInfo() {
        return this.info; //return the private attribute
    }

    public void setInfo(E info) {
        this.info = info; //set the new info value
    }

    public Node<E> getNext() {
        return this.next; //return the private attribute
    }

    public void setNext(Node<E> next) {
        this.next = next; //set the new next reference
    }

    //toString method
    public String toString() {
        if (info != null) {
            return info.toString();
        } else {
            return null;
        }
    }

}
