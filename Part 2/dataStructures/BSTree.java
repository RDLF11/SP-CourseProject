/*
 * Systems Programming
 * Department of Telematic Engineering
 * 
 * Universidad Carlos III de Madrid
 * 
 * Change: Comparable<Object> a Comparable
 * @date   April, 2020
 */

package dataStructures;

public interface BSTree<E> {
    boolean isEmpty();

    E getInfo();

    Comparable getKey();

    BSTree<E> getLeft();

    BSTree<E> getRight();

    String toStringPreOrder();

    String toStringInOrder();

    String toStringPostOrder();

    String toString(); // pre-order

    void insert(Comparable key, E info);

    BSTree<E> search(Comparable key);
}