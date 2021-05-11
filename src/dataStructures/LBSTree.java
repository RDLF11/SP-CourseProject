package dataStructures;

public class LBSTree<E> implements BSTree<E> {

    //Attributes
    private LBSNode<E> root;

    //Constructors
    //creates empty LBSTree
    public LBSTree() {
        this.root = null;
    }

    //Creates a new LBSTree by creating its root node
    public LBSTree(Comparable key, E info) {
        this.root = new LBSNode<E>(key, info, new LBSTree<E>(),
                new LBSTree<E>());
    }

    //Methods

    //isEmpty makes sure the LBSTree exists
    public boolean isEmpty() {
        return (this.root == null);
    }

    //Makes sure the LBSTree exists and returns the root's info
    public E getInfo() {
        if (!this.isEmpty()) {
            return this.root.getInfo();
        }
        return null;
    }

    //Makes sure LBSTree exists and returns the root's content
    public Comparable getKey() {
        if (!this.isEmpty()) {
            return this.root.getKey();
        }
        return null;
    }

    //gets the next node, left, below
    public BSTree<E> getLeft() {
        if (!this.isEmpty()) {
            return this.root.getLeft();
        }
        return null;
    }

    //gets the next node, right, below
    public BSTree<E> getRight() {
        if (!this.isEmpty()) {
            return this.root.getRight();
        }
        return null;
    }

    //Name the nodes of the tree in pre-order
    public String toStringPreOrder() {
        String treeStr = "";
        if (!this.isEmpty()) {
            treeStr = this.getInfo().toString();
            if (this.getLeft() != null) {
                treeStr = treeStr + this.getLeft().toStringPreOrder();
            }
            if (this.getRight() != null) {
                treeStr = treeStr + this.getRight().toStringPreOrder();
            }
        }
        return treeStr;
    }

    //Name the nodes of the tree in-order
    public String toStringInOrder() {
        String treeStr = "";
        if (!this.isEmpty()) {
            if (!this.getLeft().isEmpty()) {
                treeStr = treeStr + this.getLeft().toStringInOrder();
            }
            treeStr = treeStr + this.getInfo().toString();
            if (!this.getRight().isEmpty()) {
                treeStr = treeStr + this.getRight().toStringInOrder();
            }
        }
        return treeStr;
    }

    //Name the nodes of the tree post-order
    public String toStringPostOrder() {
        String treeStr = "";
        if (!this.isEmpty()) {
            if (this.getLeft() != null) {
                treeStr = treeStr + this.getLeft().toStringPostOrder();
            }
            if (this.getRight() != null) {
                treeStr = treeStr + this.getRight().toStringPostOrder();
            }
            treeStr = treeStr + this.getInfo().toString();
        }
        return treeStr;
    }

    //inserts a new node inside an LBSTree
    public void insert(Comparable key, E info) {
        if (this.isEmpty()) {
            this.root = new LBSNode<E>(key, info, new LBSTree<E>(),
                    new LBSTree<E>());
        } else {
            if (this.root.getKey().compareTo(key) > 0) {
                // lower key -> insert in the left subtree
                this.getLeft().insert(key, info);

            } else if (this.root.getKey().compareTo(key) < 0) {
                // greater key -> insert in right subtree
                this.getRight().insert(key, info);

            } else {
                this.root.setInfo(info);
            }
        }
    }

    //search's the LBSTree by its key identifier
    @Override
    public BSTree<E> search(Comparable  key) {
        BSTree<E> searchedSubtree = null;
        if (!this.isEmpty()) {
            if (this.root.getKey().compareTo(key) > 0) {
                // lower key -> search in the left subtree
                searchedSubtree = this.getLeft().search(key);
            } else if (this.root.getKey().compareTo(key) < 0) {
                // greater key -> insert in the right subtree
                searchedSubtree = this.getRight().search(key);
            } else {
                // equal keys
                searchedSubtree = this;
            }
        } // if reaching an empty subtree -> key not found
        return searchedSubtree;
    }

    //toString returns in pre-order
    public String toString() {
        return this.toStringPreOrder();
    }

    public void print() {
        System.out.println(toStringInOrder());
    }

}
