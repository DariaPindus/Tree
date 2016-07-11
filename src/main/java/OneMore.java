/**
 * Created by User on 11.07.2016.
 */
public class OneMore {

    class Node {
        int key;
        String value;
        Node leftChild;
        Node rightChild;

        public Node(int key, String value) {
            this.key = key;
            this.value = value;
        }
    }
    Node root;

    public void addNode(int key, String val) {
        Node node = new Node(key, val);
        if (root == null) {
            root = node;
            return;
        }

        Node currentNode = root;
        while (true) {
            Node parent = currentNode;
            if (key < currentNode.key){
                currentNode = currentNode.leftChild;
                return;
            }
        }
    }
}
