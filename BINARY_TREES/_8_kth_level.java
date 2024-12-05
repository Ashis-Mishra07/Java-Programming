package BINARY_TREES;

import java.util.*;

public class _8_kth_level {
    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            Node left = null;
            Node right = null;
        }
    }

    public static void Kth_level(Node node, int level, int k) {
        if (node == null) {
            return;
        }
        if (level == k) {
            System.out.print(node.data + " ");
            return;
        }
        Kth_level(node.left, level + 1, k);
        Kth_level(node.right, level + 1, k);
    }

    public static void main(String[] args) {
        Node node = new Node(1);
        node.left = new Node(2);
        node.right = new Node(3);
        node.left.left = new Node(4);
        node.left.right = new Node(5);
        node.right.left = new Node(6);
        node.right.right = new Node(7);

        Kth_level(node, 1, 3);
    }
}
