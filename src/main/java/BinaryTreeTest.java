
public class BinaryTreeTest {

    public static void main(String[] args) {

        CustomBinaryTree tree = new CustomBinaryTree();
        tree.addNote(2, "Dog");
        tree.addNote(3, "Cat");
        tree.addNote(1, "Parrot");
        tree.addNote(5, "Turtle");
        tree.addNote(12, "Cat");
        tree.addNote(7, "Duck");
        System.out.println(tree.findNode(5));
    }
}
