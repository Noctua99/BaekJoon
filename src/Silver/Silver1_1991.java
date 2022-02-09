package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Silver1_1991 {
    static class Node {
        char data;
        Node left;
        Node right;

        public Node(char data) {
            this.data = data;
        }
    }

    static class Tree {
        Node root;

        public void createNode(char data, char leftData, char rightData) {
            if (root == null) {
                root = new Node(data);

                if (leftData != '.') {
                    root.left = new Node(leftData);
                }
                if (rightData != '.') {
                    root.right = new Node(rightData);
                }
            } else {
                searchNode(root, data, leftData, rightData);
            }
        }

        public void searchNode(Node node, char data, char leftData, char rightData) {
            if (node == null) {
                return;
            } else if (node.data == data) {
                if (leftData != '.') {
                    node.left = new Node(leftData);
                }
                if (rightData != '.') {
                    node.right = new Node(rightData);
                }
            } else {
                searchNode(node.left, data, leftData, rightData);
                searchNode(node.right, data, leftData, rightData);
            }
        }

        // 전위 순회
        public void preOrder(Node node) {
            if (node != null) {
                System.out.print(node.data);
                if (node.left != null) preOrder(node.left);
                if (node.right != null) preOrder(node.right);
            }
        }

        // 중위 순회
        public void inOrder(Node node) {
            if (node != null) {
                if (node.left != null) inOrder(node.left);
                System.out.print(node.data);
                if (node.right != null) inOrder(node.right);
            }
        }

        // 후위순회
        public void postOrder(Node node) {
            if (node != null) {
                if (node.left != null) postOrder(node.left);
                if (node.right != null) postOrder(node.right);
                System.out.print(node.data);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Tree tree = new Tree();

        int nodeNum = Integer.parseInt(br.readLine());
        while (nodeNum-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            tree.createNode(st.nextToken().charAt(0), st.nextToken().charAt(0), st.nextToken().charAt(0));
        }
        tree.preOrder(tree.root);
        System.out.println();
        tree.inOrder(tree.root);
        System.out.println();
        tree.postOrder(tree.root);
    }
}
