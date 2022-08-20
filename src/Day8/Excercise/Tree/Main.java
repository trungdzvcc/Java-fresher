package Day8.Excercise.Tree;

public class Main {
    public static void main(String[] args) {

        BST<String> tree = new BST<>();
        tree.insert(String.valueOf(10));
        tree.insert(String.valueOf(14));
        tree.insert(String.valueOf(19));
        tree.insert(String.valueOf(27));
        tree.insert(String.valueOf(35));
        tree.insert(String.valueOf(31));
        tree.insert(String.valueOf(42));

        System.out.println("-Inorder sorted: ");
        tree.inorder();
        System.out.println();
        System.out.println("-Postorder sorted: ");
        tree.postorder();
        System.out.println();
        System.out.println("-Preorder sorted: ");
        tree.preorder();
        System.out.println();
        System.out.println("-The number of nodes is: " + tree.getSize());



        System.out.println();
        System.out.println("-Test search");
        System.out.println(tree.search(String.valueOf(20)));
        System.out.println(tree.search(String.valueOf(58)));

        System.out.println();
        System.out.println("-Test delete");
        tree.delete(String.valueOf(50));

        tree.inorder();
    }
}
