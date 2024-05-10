// public class TrinaryTree {
//     Node root;

//     static class Node {
//         int data;
//         Node left;
//         Node middle;
//         Node right;

//         public Node(int data) {
//             this.data = data;
//             this.left = null;
//             this.middle = null;
//             this.right = null;
//         }
//     }

//     // Method to insert a new node with given data
//     public void insert(int data) {
//         if (root == null) {
//             root = new Node(data);
//             return;
//         }

//         insertRecursive(root, data);
//     }

//     // Recursive helper method for insertion
//     private void insertRecursive(Node current, int data) {
//         if (data < current.data) {
//             if (current.left == null) {
//                 current.left = new Node(data);
//             } else {
//                 insertRecursive(current.left, data);
//             }
//         } else if (data > current.data) {
//             if (current.right == null) {
//                 current.right = new Node(data);
//             } else {
//                 insertRecursive(current.right, data);
//             }
//         } else {
//             if (current.middle == null) {
//                 current.middle = new Node(data);
//             } else {
//                 insertRecursive(current.middle, data);
//             }
//         }
//     }

//     // Method to search for a node with given data
//     public boolean search(int data) {
//         return searchRecursive(root, data);
//     }

//     // Recursive helper method for searching
//     private boolean searchRecursive(Node current, int data) {
//         if (current == null) {
//             return false;
//         }

//         if (data == current.data) {
//             return true;
//         }

//         if (data < current.data) {
//             return searchRecursive(current.left, data);
//         } else if (data > current.data) {
//             return searchRecursive(current.right, data);
//         } else {
//             return searchRecursive(current.middle, data);
//         }
//     }

//     // Method to print the tree in in-order traversal
//     public void printInOrder() {
//         printInOrderRecursive(root);
//     }

//     // Recursive helper method for in-order traversal
//     private void printInOrderRecursive(Node current) {
//         if (current != null) {
//             printInOrderRecursive(current.left);
//             System.out.print(current.data + " ");
//             printInOrderRecursive(current.middle);
//             printInOrderRecursive(current.right);
//         }
//     }
public class TrinaryTree {
    private Node root;

    public TrinaryTree() {
        this.root = null;
    }

    private class Node {
        int value;
        Node left, middle, right;

        public Node(int value) {
            this.value = value;
            this.left = null;
            this.middle = null;
            this.right = null;
        }
    }

    public void insert(int value) {
        root = insertRecursive(root, value);
    }

    private Node insertRecursive(Node current, int value) {
        if (current == null) {
            return new Node(value);
        }

        if (value < current.value) {
            current.left = insertRecursive(current.left, value);
        } else if (value > current.value) {
            current.right = insertRecursive(current.right, value);
        } else {
            current.middle = insertRecursive(current.middle, value);
        }

        return current;
    }

    public boolean search(int value) {
        return searchRecursive(root, value);
    }

    private boolean searchRecursive(Node current, int value) {
        if (current == null) {
            return false;
        }

        if (value == current.value) {
            return true;
        }

        return searchRecursive(current.left, value) || searchRecursive(current.middle, value) || searchRecursive(current.right, value);
    }

    public void printInOrder() {
        printInOrderRecursive(root);
    }

    private void printInOrderRecursive(Node current) {
        if (current != null) {
            printInOrderRecursive(current.left);
            System.out.print(current.value + " ");
            printInOrderRecursive(current.middle);
            printInOrderRecursive(current.right);
        }
    }
    public static void main(String[] args) {
        TrinaryTree tree = new TrinaryTree();
        tree.insert(10);
        tree.insert(10);
        tree.insert(5);
        tree.insert(15);
        tree.insert(3);
        tree.insert(7);
        tree.insert(12);
        tree.insert(17);
        tree.insert(10);

        System.out.println("In-order traversal: ");
        tree.printInOrder();

        System.out.println("\nSearching for 10: " + tree.search(10));
        System.out.println("Searching for 20: " + tree.search(20));
    }
}