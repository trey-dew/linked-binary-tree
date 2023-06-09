/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */




/**
 *Transcribed by Trey Dew code fragments from data structures & algorithms code fragments 
 * @author treyd
 */
public interface Queue<E> {
 /** Returns the number of elements in the queue. */
 int size( );
 /** Tests whether the queue is empty. */
 boolean isEmpty( );
 /** Inserts an element at the rear of the queue. */
 void enqueue(E e);
 /** Returns, but does not remove, the first element of the queue (null if empty). */
 E first( );
 /** Removes and returns the first element of the queue (null if empty). */
 E dequeue( );
public String toString(); // converts to string
public boolean equals(Object o); // check if equals
 }
