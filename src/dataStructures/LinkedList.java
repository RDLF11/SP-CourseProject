package dataStructures;

public class LinkedList<E> {

    //Attributes
    private Node<E> first; //creating the first node
    int size; //size (length) of the list

    //Constructors
    public LinkedList() {
        //empty constructor
        //We may add it or assume its existence
    }

    //Methods
    //Getters and Setters
    public Node<E> getFirst() {
        return first;
    }

    public void setFirst(Node<E> first) {
        this.first = first; //assign first node
    }

    //check if the LL is empty
    public boolean isEmpty() {
        return (first == null);
        //returns based on first node status of existence
    }

    public int size() {
        return size; //returns the size of the LL
    }
    
    public void insert(E info) {
        Node<E> node = new Node<E>(info); //created new node (object)
        node.setNext(first); //set as first as reference
        first = node;
        size++; //size post-increment
    }

    //method to extract a node from an LL
    public E extract() {
        E info = null;
        if(first != null) {
            info = first.getInfo();
            first = first.getNext();
            size--;
        }
        return info;
    }

    public void insert(E info, Node<E> prev) {
        if (prev != null) {
            Node<E> node = new Node<E>(info);
            node.setNext(prev.getNext());
            prev.setNext(node);
            size++; 
        }
    }
}
