package dataStructures;

public class LBSNode<E> {

    //Attributes
    private E info;
    private Comparable  key;
    private BSTree<E> right;
    private BSTree<E> left;

    //Constructor
    public LBSNode(Comparable  key, E info, BSTree<E> left, BSTree<E> right) {
        this.info = info;
        this.key = key;
        this.right = right;
        this.left = left;
    }

    //Methods
    //Get node info
    public E getInfo() {
        return this.info;
    }

    //set node info
    public void setInfo(E info) {
        this.info = info;
    }

    //get node's key
    public Comparable getKey() {
        return this.key;
    }

    //set node's key
    public void setKey(Comparable  key) {
        this.key = key;
    }

    //get left (lower) node
    public BSTree<E> getLeft() {
        return this.left;
    }

    //setLeft node
    public void setLeft(BSTree<E> left) {
        this.left = left;
    }

    //get right (lower) node
    public BSTree<E> getRight() {
        return this.right;
    }

    //setRight node
    public void setRight(BSTree<E> right) {
        this.right = right;
    }

    //toString method
    public String toString() {
        String result = "";
        if (info != null) {
            result = info.toString();
        }
        return result;
    }
}
