package binary.tree;

import static binary.tree.BinaryTreePreeOrder.BinaryTree.*;

public class BinaryTreePreeOrder {
    public static void main(String[] args) {
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
//        postOrder(root);
//        System.out.println(sumOfNodes(root));
//        System.out.println(heightOfTree(root));
        System.out.println( countOfNodes(root));

//        inOrder(root);
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
        public static int countOfNodes(Node root){
            if (root == null){
                return 0;
            }
            int leftNodes = countOfNodes(root.left);
            int rightNodes = countOfNodes(root.right);
            return leftNodes + rightNodes + 1;
        }
        public static int sumOfNodes(Node root){
            if (root == null){
                return 0;
            }
            int leftSum = sumOfNodes(root.left);
            int rightSum = sumOfNodes(root.right);

            return leftSum + rightSum + root.data;
        }
        public static int heightOfTree(Node root){
            if (root == null){
                return 0;
            }
            int leftHeight = heightOfTree(root.left);
            int rightHeight = heightOfTree(root.right);
            int treeHeight = Math.max(leftHeight,rightHeight)+1;
            return treeHeight;
        }

        public static void postOrder(Node root){
            if (root == null){
                return;
            }
            postOrder(root.left);
            postOrder(root.right);
            System.out.println(root.data+" ");
        }
    }
}
