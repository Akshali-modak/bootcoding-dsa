package BbinarySearch;

public class Insert {
    public static void main(String[] args) {
     int[] value = {5,1,3,2,4,8};
     Node root = null;
     for (int i=0;i<value.length;i++){
         root=insert(root,value[i]);
     }
     inOrder(root);
        System.out.println( );
        if (search(root,3)){
            System.out.println("Found");
        }
        else {
            System.out.println("Not found");
        }

    }
    static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data) {

            this.data = data;
        }
    }
    public static Node insert(Node root, int value){
        if (root == null){
            root = new Node(value);
            return root;
        }
        if (root.data > value){
            //left subtree
            root.left = insert(root.left, value);
        }
        else {
            root.right = insert(root.right, value);
        }
        return root;
    }
    public static void inOrder(Node root){
        if (root == null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }
    public static boolean search(Node root, int key){
        if (root == null){
            return false;
        }
        if (root.data > key){
            //left subtree
            return search(root.left,key);
        } else if (root.data == key) {
            return true;
        }
        else {
            return search(root.right,key);
        }
    }

}
