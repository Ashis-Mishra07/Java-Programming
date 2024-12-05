package BINARY_SEARCH_TREES;

import java.util.ArrayList;
import java.util.Collections;

public class _11_merge_two_bst {
    static class Node {
        Node left;
        Node right;
        int data;

        public Node(int data) {
            this.data = data;
        }
    }

    public static void storingData(Node node, ArrayList<Integer> arr) {
        if (node == null) {
            return;
        }
        storingData(node.left, arr);
        arr.add(node.data);
        storingData(node.right, arr);
    }

    public static Node createBst(int start, int end, ArrayList<Integer> arr) {

        if (start > end) {
            return null;
        }
        int mid = (start + end) / 2;
        Node node2 = new Node(arr.get(mid));
        node2.left = createBst(start, mid - 1, arr);
        node2.right = createBst(mid + 1, end, arr);

        return node2;
    }

    public static void preOrder(Node node2) {
        if (node2 == null) {
            return;
        }
        System.out.print(node2.data + " ");
        preOrder(node2.left);

        preOrder(node2.right);
    }

    public static void main(String[] args) {
        // BST 1
        Node node = new Node(2);
        node.left = new Node(1);
        node.right = new Node(4);

        // BST 2
        Node node1 = new Node(9);
        node1.left = new Node(3);
        node1.right = new Node(12);
        node1.right.left = new Node(13);

        ArrayList<Integer> arr = new ArrayList<>();

        storingData(node, arr);
        storingData(node1, arr);
        Collections.sort(arr);
        // for(int i=0;i<arr.size();i++){
        // System.out.println(arr.get(i));
        // }

        Node node2 = createBst(0, arr.size() - 1, arr);
        preOrder(node2);
    }
}
