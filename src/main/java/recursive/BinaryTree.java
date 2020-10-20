package recursive;


import static java.lang.Math.max;

public class BinaryTree {

    private Node root;

    public void add(int value) {
        root = addRecursive(root, value);
    }

    public boolean containsNode(int value) {
        return containsNodeRecursive(root, value);
    }

    public int calculateHeight() {
       return calculateTreeHeight(root);
    }

    private Node addRecursive(Node current, int value) {
        if (current == null) {
            return new Node(value);
        }

        if (value < current.getValue()) {
            current.setLeft(addRecursive(current.getLeft(), value));
        } else if (value > current.getValue()) {
            current.setRight(addRecursive(current.getRight(), value));
        } else {
            // value already exists
            return current;
        }

        return current;
    }

    private boolean containsNodeRecursive(Node current, int value) {
        if (current == null) {
            return false;
        }
        if (value == current.getValue()) {
            return true;
        }

        /*
        if(value < current.getValue()) {
            return containsNodeRecursive(current.getLeft(), value);
        } else {
            return containsNodeRecursive(current.getRight(), value);
        }
         */

        // ternary
        return value < current.getValue() ?
                containsNodeRecursive(current.getLeft(), value) :
                containsNodeRecursive(current.getRight(), value);
    }

    private int calculateTreeHeight(Node node) {
        if (node != null) {
            if (node.getLeft() != null || node.getRight() != null) {
                return 1 + max(calculateTreeHeight(node.getLeft()), calculateTreeHeight(node.getRight()));
            }
        }
        return 0;
    }

}
