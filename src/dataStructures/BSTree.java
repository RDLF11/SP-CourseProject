package dataStructures;

//recompilation of method declarations
public interface BSTree<E> {
    
    //does the tree exist?
    boolean isEmpty();

    //get node info
    E getInfo();

    //gets node's key
    Comparable getKey();

    //get R or L node
    BSTree<E> getLeft();
    BSTree<E> getRight();

    String toStringPreOrder(); //count when stop on left
    String toStringInOrder(); //count when stop below node
    String toStringPostOrder(); //count when stop after

    String toString(); //pre-order

    void insert(Comparable key, E info);

    BSTree<E> search(Comparable key);
}
