package dataStructures;

public class LinkedList<E> {
    private Node<E> first;
    int size;

    public LinkedList() {
    }

    public Node<E> getFirst() {
        return first;
    }

    public void setFirst(Node<E> first) {
        this.first = first;
    }

    public boolean isEmpty() {
        return (first == null);
    }

    public int size() {
        return size;
    }

    public void insert(E info) {
        Node<E> n = new Node<E>(info);
        n.setNext(first);
        first = n;
        size++;
    }

    public E extract() {
        E info = null;
        if (first != null) {
            info = first.getInfo();
            first = first.getNext();
            size--;
        }
        return info;
    }

    public void insert(E info, Node<E> prev) {
        if (prev != null) {
            Node<E> n = new Node<E>(info);
            n.setNext(prev.getNext());
            prev.setNext(n);
            size++;
        }
    }

    public E extract(Node<E> prev) {
        E info = null;
        if (prev != null && prev.getNext() != null) {
            info = prev.getNext().getInfo();
            prev.setNext(prev.getNext().getNext());
            size--;
        }
        return info;
    }

    public E extractLast() {
        E info = null;
        Node<E> aux = first;
        if (aux != null && aux.getNext() != null) {
            while (aux.getNext().getNext() != null) {
                aux = aux.getNext();
            }
            info = aux.getNext().getInfo();
            aux.setNext(null);
        }
        return info;
    }

    public E extract(int index) {
        E info = null;
        if (index < 0 || index > size - 1) {
            System.err.println("Invalid index");
        } else if (isEmpty()) {
            System.err.println("List is empty");
        } else {
            Node<E> aux = first;
            for (int i = 0; i < index - 1 && aux != null; i++) {
                aux = aux.getNext();
            }
            if (aux.getNext() != null) {
                info = aux.getNext().getInfo();
                aux.setNext(aux.getNext().getNext());
            }
        }
        return info;
    }

    public Node<E> searchNode(E info) {
        Node<E> node = null;
        Node<E> aux = first;
        while (aux != null) {
            if (aux.getInfo().equals(info)) {
                node = aux;
            }
            aux = aux.getNext();
        }
        return node;
    }

    public Node<E> searchLastNode() {
        Node<E> node = null;
        Node<E> aux = first;
        while (aux.getNext() != null) {
            if (aux != null) {
                aux = aux.getNext();
            }
        }
        node = aux;
        return node;
    }

    public E get(int index) {
        E info = null;
        if (index >= 0 && index < size()) {
            Node<E> aux = first;
            for (int i = 0; i < index && aux != null; i++) {
                aux = aux.getNext();
            }
            info = aux.getInfo();
        }
        return info;
    }

    public int indexOf(E info) {
        int index = -1;
        Node<E> aux = first;
        int counter = 0;
        while (aux != null && !aux.getInfo().equals(info)) {
            aux = aux.getNext();
            counter++;
        }
        if (aux != null) {
            index = counter;
        }
        return index;
    }

    public int numOccurences(E info) {
        Node<E> aux = first;
        int counter = 0;
        while (aux != null) {
            if (aux.getInfo().equals(info)) {
                counter++;
            }
            aux = aux.getNext();
        }
        return counter;
    }

    public String toString() {
        String result = "";
        Node<E> aux = first;
        while (aux != null) {
            result = result + " " + aux.getInfo().toString();
            aux = aux.getNext();
        }
        return result;
    }

    public void print() {
        System.out.println(toString());
    }
}