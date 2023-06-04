/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author treyd
 */
public class Client
{
    public static void main(String[] args)
    {
        LinkedBinaryTree<String> tree = new LinkedBinaryTree<>();

        Position root = tree.addRoot("-");
        Position leftRoot = tree.addLeft(tree.root, "/");
        Position rightRoot = tree.addRight(tree.root, "+");
        Position leftChildLeft = tree.addLeft(tree.root.getLeft(), "x");
        Position leftChildRight = tree.addRight(tree.root.getLeft(), "+");
        Position leftChildRleft = tree.addLeft(tree.root.getLeft().getRight(),"-");
        Position LeftChildRright =tree.addRight(tree.root.getLeft().getRight(),"3");
        Position leftChildRchildRleft = tree.addLeft(tree.root.getLeft().getRight().getLeft(),"9");
        Position leftChildRchildRright = tree.addRight(tree.root.getLeft().getRight().getLeft(),"5");
        Position leftChildChildleft = tree.addLeft(tree.root.getLeft().getLeft(), "+");
        Position leftChildChildRight = tree.addRight(tree.root.getLeft().getLeft(), "3");
        Position leftChildChildChildLeft = tree.addLeft(tree.root.getLeft().getLeft().getLeft(), "3");
        Position leftChildChildChildRight = tree.addRight(tree.root.getLeft().getLeft().getLeft(), "1");
        
        Position rightChildleft = tree.addLeft(tree.root.getRight(), "x");
        Position rightChildRight = tree.addRight(tree.root.getRight(), "6");
        Position rightChildChildLeft = tree.addLeft(tree.root.getRight().getLeft(), "3");
        Position rightChildChildRight = tree.addRight(tree.root.getRight().getLeft(), "-");
        Position rightChildChildChildRleft = tree.addLeft(tree.root.getRight().getLeft().getRight(), "7");
        Position rightChildChildChildRright = tree.addRight(tree.root.getRight().getLeft().getRight(), "4");
        System.out.println("( ( ( 3 + 1 ) * 3 ) / ( ( 9 - 5 ) ) - ( ( 3 * ( 7 - 4 ) ) + 6 ) )");
        System.out.println(tree.height(tree.root));
        System.out.println(tree.preorder());
        tree.inOrder(tree.root);
        System.out.println(tree.postorder());
        System.out.println(tree.breadthfirst());
        tree.eulerTourBinary(tree.root);
    }
}
