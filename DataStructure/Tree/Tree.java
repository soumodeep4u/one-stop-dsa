class Node {
    int data;
    Node leftTree;
    Node rightTree;
    Node(int data) {
        this.data = data;
        this.leftTree = null;
        this.rightTree = null;
    }
}

class Tree {

    public void preOrderTraversalWithRecursion(Node root){
        if(root != null){
            System.out.println("Element ------> "+root.data);
            preOrderTraversalWithRecursion(root.leftTree);
            preOrderTraversalWithRecursion(root.rightTree);
        }

    }

    public void inOrderTraversalWithRecursion(Node root){
        if(root != null){
            inOrderTraversalWithRecursion(root.leftTree);
            System.out.println("Element --------> "+root.data);
            inOrderTraversalWithRecursion(root.rightTree);
        }
    }

    public void postOrderTraversalWithRecursion(Node root){
        if(root != null){
            postOrderTraversalWithRecursion(root.leftTree);
            postOrderTraversalWithRecursion(root.rightTree);
            System.out.println("Element --------> "+root.data);
        }
    }

    public static void main(String args[]) {
        System.out.println("Let's create a tree :: ");
        Node root = new Node(1);
        root.leftTree = new Node(2);
        root.rightTree = new Node(3);
        root.leftTree.leftTree = new Node(4);
        root.leftTree.rightTree = new Node(5);
        root.rightTree.leftTree = new Node(6);
        root.rightTree.rightTree = new Node(7);
        Tree t = new Tree();
        System.out.println("Starting Pre-Order Traversal :: ");
        t.preOrderTraversalWithRecursion(root);
        System.out.println("Starting In Order Traversal :: ");
        t.inOrderTraversalWithRecursion(root);
        System.out.println("Starting Post Order Traversal :: ");
        t.postOrderTraversalWithRecursion(root);
    }
}