/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author treyd
 */
public abstract class AbstractBinaryTree<E> extends AbstractTree<E> implements BinaryTree<E> 
{
    
 public Position<E> sibling(Position<E> p) 
 {
 Position<E> parent = parent(p);
 if (parent == null) return null; // p must be the root
    if (p == left(parent)) // p is a left child
        return right(parent); // (right child might be null)
    else // p is a right child
 return left(parent); // (left child might be null)
 }
 public int numChildren(Position<E> p) 
 {
    int count=0;
    if (left(p) != null)
        count++;
    if (right(p) != null)
        count++;
    return count;
 }
 
 public Iterable<Position<E>> children(Position<E> p) 
 {
    List<Position<E>> snapshot = new ArrayList<>(2); // max capacity of 2
    if (left(p) != null)
        snapshot.add(left(p));
    if (right(p) != null)
        snapshot.add(right(p));
    return snapshot;
 }
 
 public void inOrder(Position<E> p)
    {
        if( left(p) != null )
        {
            inOrder(left(p));
        }
        if(right(p) != null)
        {
            inOrder(right(p));
        }
    }

 public void eulerTourBinary(Position<E> p)
 {
     if (this.isInternal(p))
            System.out.print("(");

        if (this.left(p) != null) {
           eulerTourBinary(this.left(p)); //Recursively tour the left subtree of p
        }

        //Perform in visit action
        System.out.print(p.getElement());

        if (this.right(p) != null) {
            eulerTourBinary(this.right(p));
        }
        //Perform post visit action
        if (this.isInternal(p))
            System.out.print(")");
 }
}
