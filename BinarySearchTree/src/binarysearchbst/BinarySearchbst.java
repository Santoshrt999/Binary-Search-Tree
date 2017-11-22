/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binarysearchbst;

/**
 *
 * @author Santosh Goteti
 */
public class BinarySearchbst {

    /**
     * @param args the command line arguments
     */
    Node root; //root node of BST

    class Node { //Node class, which contains left, right anf key elements

        Node left, right;
        int key;

        public Node(int item) {
            key = item;
            left = right = null;
        }
    }
   

    //constructor
    public BinarySearchbst() {
        root = null; //root is empty assigned here.
    }

    //InsertMethod
    public void insert(int key) {

        root = insertRec(root, key);
    }
    //recursive insert based on BST CONCEPT
//Inserting the elements into the Tree Structure
    Node insertRec(Node root, int key) {
        if (root == null) {
            root = new Node(key);
            return root;
        }
        //if small insert left
        if (key < root.key) {
            root.left = insertRec(root.left, key);

        } //if large insert right
        else if (key > root.key) {
            root.right = insertRec(root.right, key);
        }
        return root;

    }

    void inorder() { //inorder method calling
        inorderRec(root);
    }
void preorder(){ //preorder calling method
  preorderRec(root);
}
void postorder(){ //postorder calling method
    postorderRec(root);
}

//Inorder recursion, LEFT, ROOT, RIGHT
    void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.println(root.key);//print the elements
            inorderRec(root.right);
        }
    }
    //preorder recrusion ROOT, LEFT, RIGHT
        void preorderRec(Node root){
        if(root!=null){
            System.out.println(root.key);
            preorderRec(root.left);
            preorderRec(root.right);
        }
        
    }
        //postorder recursion traversal which is LEFT, RIGHT , ROOT
        void postorderRec(Node root){
            if(root!=null){
                postorderRec(root.left);
                postorderRec(root.right);
                System.out.println(root.key);
            }
        }

    

    public static void main(String[] args) {
        // TODO code application logic here

        BinarySearchbst bst = new BinarySearchbst();
        bst.insert(50);
        bst.insert(30);
        bst.insert(20);
        bst.insert(40);
        bst.insert(70);
        bst.insert(60);
        bst.insert(80);

        System.out.println("In-order");
        bst.inorder(); //Inorder Traversal 
        System.out.println("Pre-Order");
        bst.preorder();//Pre-order Traversal
        System.out.println("Post-Order");
        bst.postorder();//Post-order Traversal
        
    }

}
