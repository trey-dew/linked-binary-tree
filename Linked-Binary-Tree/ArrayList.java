/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 * Transcribed by Trey Dew code fragments from data structures & algorithms code fragments 7.2 7.3 7.4 7.5
 * @author treyd
 */
public class ArrayList<E> implements List<E> 
{
 // instance variables
 public static final int CAPACITY=16; // default array capacity
 private E[ ] data; // generic array used for storage
 private int size = 0; // current number of elements
 // constructors
 public ArrayList( ) { this(CAPACITY); } // constructs list with default capacity
 public ArrayList(int capacity) { // constructs list with given capacity
 data = (E[ ]) new Object[capacity]; // safe cast; compiler may give warning
 }
 // public methods
 /** Returns the number of elements in the array list. */
 public int size( ) { return size; }
 /** Returns whether the array list is empty. */
 public boolean isEmpty( ) { return size == 0; }
 /** Returns (but does not remove) the element at index i. */
 public E get(int i) throws IndexOutOfBoundsException {
 checkIndex(i, size);
 return data[i];
 }
 /** Replaces the element at index i with e, and returns the replaced element. */
 public E set(int i, E e) throws IndexOutOfBoundsException {
 checkIndex(i, size);
 E temp = data[i];
 data[i] = e;
 return temp;
 }
 /** Inserts element e to be at index i, shifting all subsequent elements later. */
 public void add(int i, E e) throws IndexOutOfBoundsException,
 IllegalStateException {
 checkIndex(i, size + 1);
 if (size == data.length) // not enough capacity
 resize(2*data.length); 
 for (int k = size-1;k>= i;k--) // start by shifting rightmostint 
 data[k+1] = data[k];
 data[i] = e; // ready to place the new element
 size++;
 }
 /** Removes/returns the element at index i, shifting subsequent elements earlier. */
 public E remove(int i) throws IndexOutOfBoundsException {
 checkIndex(i, size);
 E temp = data[i];
 for (int k=i;k<size-1;k++) // shift elements to fill holeint k=i; k < size−1; k++
 data[k] = data[k+1];
 data[size-1] = null; // help garbage collection data[size−1] = null
 size--;
 return temp;
 }
 // utility method
 /** Checks whether the given index is in the range [0, n−1]. */
 protected void checkIndex(int i, int n) throws IndexOutOfBoundsException {
 if (i < 0 || i >= n)
 throw new IndexOutOfBoundsException("Illegal index: " + i);
 }
 protected void resize(int capacity) {
E[ ] temp = (E[ ]) new Object[capacity]; // safe cast; compiler may give warning
for (int k=0; k < size; k++)
temp[k] = data[k];
data = temp; // start using the new array
}
 
}
