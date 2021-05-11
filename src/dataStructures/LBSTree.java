package dataStructures;

public class LBSTree<E> implements BSTree<E> {

    private LBSNode<E> root;

    public LBSTree(Comparable key, E info) {
        this.root = new LBSNode<E>(key, info, new LBSTree<E>(),
                new LBSTree<E>());
    }

    public LBSTree() {
        this.root = null;
    }

    public boolean isEmpty() {
        return (this.root == null);
    }

    public E getInfo() {
        if (!this.isEmpty()) {
            return this.root.getInfo();
        }
        return null;
    }

    public Comparable getKey() {
        if (!this.isEmpty()) {
            return this.root.getKey();
        }
        return null;
    }

    public BSTree<E> getLeft() {
        if (!this.isEmpty()) {
            return this.root.getLeft();
        }
        return null;
    }

    public BSTree<E> getRight() {
        if (!this.isEmpty()) {
            return this.root.getRight();
        }
        return null;
    }

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

    public String toString() {
        return this.toStringPreOrder();
    }

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

    public void print() {
        System.out.println(toStringInOrder());
    }

}
