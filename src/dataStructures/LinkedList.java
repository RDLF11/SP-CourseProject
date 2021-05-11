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
    
    //method to insert a first node into an LL
    public void insert(E info) {
        Node<E> node = new Node<E>(info); //created new node (object)
        node.setNext(first); //set as first as reference
        first = node;
        size++; //size post-increment
    }

    //method to extract first node from an LL
    public E extract() {
        E info = null;
        if(first != null) {
            info = first.getInfo();
            first = first.getNext();
            size--;
        }
        return info;
    }

    //method to insert a node with a reference to prev node
    public void insert(E info, Node<E> prev) {
        if(prev != null) {
            Node<E> node = new Node<E>(info); //create new node
            node.setNext(prev.getNext()); //setNext after previous and getNext fro prev
            prev.setNext(node); //setNext overridden to newly created node
            size++;
        }
    }

    //method to extract a node based on prev node
    public E extract(Node<E> prev) {
        E info = null;
        if(prev != null && prev.getNext() != null) {
            info = prev.getNext().getInfo();
            prev.setNext(prev.getNext().getNext());
            size--;
        }
        return info;
    }

    //extractLast
    public E extractLast() {
        E info = null;
        Node<E> aux = first;
        if(aux != null && aux.getNext() != null) {
            while(aux.getNext().getNext() != null) {
                aux = aux.getNext();
            }
            info = aux.getNext().getInfo(); //grabs the absolute last after while loop execution
            aux.setNext(null);
        }
        return info;
    }

    //Extract node based on its index
    public E extract(int index) {
        E info = null;
        if(index < 0 || index > size - 1) {
            System.err.println("Invalid index");
        } else if (isEmpty()) {
            System.err.println("List is empty");
        } else {
            Node<E> aux = first;
            for(int i = 0; i < index - 1 && aux != null; i++) {
                aux = aux.getNext();
            }
            if(aux.getNext() != null) {
                info = aux.getNext().getInfo();
                aux.setNext(aux.getNext().getNext());
            }
        }
        return info;
    }

    //search for a node with specific info inside
    public Node<E> searchNode(E info) {
        Node<E> node = null;
        Node<E> aux = first;
        while(aux != null) {
            if(aux.getInfo().equals(info)) node = aux;
            aux = aux.getNext();
        }
        return node;
    }

    //search the lastNode (grabs node w/ all attributes)
    public Node<E> searchLastNode() {
        Node<E> node = null;
        Node<E> aux = first;
        while(aux.getNext() != null) {
            if(aux != null) {
                aux = aux.getNext();
            }
        }
        node = aux;
        return node;
    }

    //get the node's info based on an input index
    public E get(int index) {
        E info = null;
        if(index >= 0 && index < size()) {
            Node<E> aux = first;
            for(int i = 0; i < index && aux != null; i++) {
                aux = aux.getNext();
            }
            info = aux.getInfo();
        }
        return info;
    }

    //find out the index of the node given a specific info
    public int indexOf(E info) {
        int index = -1; //return as is if not found (-1 equals some kind of error)
        Node<E> aux = first;
        int counter = 0;
        //if the first node is not null (LL exists)
        //and the info inside the node is different from the searched parameters
        //re-loop while
        while(aux != null && !aux.getInfo().equals(info)) {
            if(aux.getInfo().equals(info)) {
                counter++; //until found coincidence return position post-increment
            }
            aux = aux.getNext();
        }
        return counter;
    }

    //obtain the number of repeat content nodes
    public int numOccurences(E info) {
        Node<E> aux = first; //initialize our aux w/ baseline (root)
        int counter = 0;
        while(aux != null) {
            if(aux.getInfo().equals(info)) {
                counter++;
            }
            aux = aux.getNext();
        }
        return counter;
    }

    //toString method
    public String toString() {
        String result = "";
        Node<E> aux = first; //baseline
        //as long as the current node exists run while
        while(aux != null) {
            result = result + " " + aux.getInfo().toString();
            aux = aux.getNext();
        }
        return result;
    }

    //print the toString values
    public void print() {
        System.out.println(toString());
    }

}
