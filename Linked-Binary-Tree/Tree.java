/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author treyd
 */
import java.util.Iterator;
public interface Tree<E> extends Iterable<E> 
{
     Position<E> root( );
     Position<E> parent(Position<E> p) throws IllegalArgumentException;
     Iterable<Position<E>> children(Position<E> p)
     throws IllegalArgumentException;
     int numChildren(Position<E> p) throws IllegalArgumentException;
     boolean isInternal(Position<E> p) throws IllegalArgumentException;
     boolean isExternal(Position<E> p) throws IllegalArgumentException;
     boolean isRoot(Position<E> p) throws IllegalArgumentException;
     int size( );
     boolean isEmpty( );
     Iterator<E> iterator( );
    Iterable<Position<E>> positions( );
}

