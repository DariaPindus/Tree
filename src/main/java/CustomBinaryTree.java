
public class CustomBinaryTree {

    class Node {
        int key;
        String value;
        Node leftChild;
        Node rightChild;

        public Node(int key, String value) {
            this.key = key;
            this.value = value;
        }

        @Override
        public String toString() {
            return key + " = " + value;
        }
    }

    Node root;

    public void addNote(int key, String value) {
        Node node = new Node(key, value);
        if (root == null) {
            root = node;
            return;
        }

        Node currentNode = root;
        while (true) {
            Node parent = currentNode;
            if (key < currentNode.key) {
                currentNode = currentNode.leftChild;
                if (currentNode == null) {
                    parent.leftChild = currentNode;
                    return;
                }
            } else {
                currentNode = currentNode.rightChild;
                if (currentNode == null) {
                    parent.rightChild = node;
                    return;
                }
            }
        }
    }

    public Node findNode(int key) {
        Node currentNode = root;
        while (true) {
            //Node parent = currentNode;
            if (key < currentNode.key) {
                if (currentNode.key == key)
                    return currentNode;
                else {
                    currentNode= currentNode.leftChild;
                }
            } else {
                if (currentNode.key == key)
                    return currentNode;
                else
                    currentNode = currentNode.rightChild;
            }
        }
    }

    @Override
    public String toString() {
        return root.key + " = " + root.value;
    }
}
//Node node = (root == null) ? root = new Node(key, value) :




