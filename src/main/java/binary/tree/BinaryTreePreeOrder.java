package binary.tree;

import static binary.tree.BinaryTreePreeOrder.BinaryTree.inOrder;
import static binary.tree.BinaryTreePreeOrder.BinaryTree.preOrderTree;

public class BinaryTreePreeOrder {
    public static void main(String[] args) {
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        inOrder(root);
//        preOrderTree(root);
//        System.out.println(root.data);

    }
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    static class BinaryTree{
        static int indx = -1;
        public static Node buildTree(int nodes[]){
            indx++;
            if (nodes[indx] == -1){
                return null;
            }
            Node newNode = new Node(nodes[indx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;
        }


        public static void preOrderTree(Node root){
            if (root == null){
                return;
            }
            System.out.println(root.data+" ");
            preOrderTree(root.left);
            preOrderTree(root.right);
        }

        public static void inOrder(Node root){
            if (root == null){
                return;
            }
            inOrder(root.left);
            System.out.println(root.data+" ");
            inOrder(root.right);
        }
    }
}
