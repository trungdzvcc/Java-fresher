package Day8.Practive.BST;

public class TestBST {
    public  static void main(String[] args){
        BST<String> bst = new BST<>();
        bst.insert("George");
        bst.insert("Michael");
        bst.insert("Tom");
        bst.insert("Adam");
        bst.insert("Jones");
        System.out.println("iborder sort");
        bst.inorder();
        System.out.println("the number of nodes is "+ bst.getSize());
    }
}
