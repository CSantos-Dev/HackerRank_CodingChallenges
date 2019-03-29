package interviewpreparation.trees;

/**
 * Tree: Height of a Binary Tree
 * https://www.hackerrank.com/challenges/tree-height-of-a-binary-tree/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=trees
 *
 * @author csantos
 */
public class BinaryTreeHeight {

    /**
     * Calculate and return the number of edges between
     * the tree's root and the furthest leaf.
     *
     * Recursive solution
     */
    static int height(Node root) {
        if (root == null) {
            return -1;
        } else {
            int heightLeft = height(root.left);
            int heightRight = height(root.right);

            if (heightLeft > heightRight) {
                return heightLeft + 1;
            } else {
                return heightRight + 1;
            }
        }
    }

    static class Node {
        private int data;
        private Node left;
        private Node right;

        Node(int data) {
            this.data = data;
        }
    }

    static Node insert(Node root, int data) {
        if(root == null) {
            return new Node(data);
        } else {
            Node cur;
            if(data <= root.data) {
                cur = insert(root.left, data);
                root.left = cur;
            } else {
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
    }

}
