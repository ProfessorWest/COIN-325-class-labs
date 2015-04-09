/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab17;

/**
 *
 * @author pwest
 */
public class LinkedQueue<T> implements Queue<T>{
    private int mCount;
    private LinkedNode<T> mHead, mTail;
    
    public LinkedQueue () {
        mCount = 0;
        mHead = mTail = null;
    }
    
    @Override
    public void enqueue(T element) {
        LinkedNode<T> node = new LinkedNode<T>();
        
        node.setElement(element);
        
        if (mHead == null) {
            mHead = node;
        } else {
            mTail.setNext(node);
        }
        
        mTail = node;
        mCount++;
    }

    @Override
    public T dequeue() throws EmptyCollectionException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public T first() throws EmptyCollectionException {
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
