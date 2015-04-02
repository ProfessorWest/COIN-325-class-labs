/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab16;

/**
 *
 * @author pwest
 */
public class LinkedStack<T> implements Stack<T> {
    private int count;
    private LinkedNode<T> top;
    
    public LinkedStack() {
        count = 0;
        top = null;
    }

    @Override
    public void push(T element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public T pop() throws EmptyCollectionException {
        if ( top == null ) {
            throw new EmptyCollectionException();
        }
        
        T result = top.getElement();
        top = top.getNext();
        count--;
        
        return result;
    }

    @Override
    public T peek() throws EmptyCollectionException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isEmpty() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int size() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
