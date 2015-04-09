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
public class CircularArrayQueue<T> implements Queue<T> {
    private final static int DEFAULT_CAPACITY = 100;
    private int mFront, mRear, mCount;
    private T[] mQueue;
    
    public CircularArrayQueue(int initialCapacity) {
        mFront = mRear = mCount = 0;
        mQueue = (T[]) (new Object[initialCapacity]);
    }
    
    public CircularArrayQueue() {
        this(DEFAULT_CAPACITY);
    }

    @Override
    public void enqueue(T element) {
        if (size() == mQueue.length) {
            // The queue is full, just throw an exception!
            throw new UnsupportedOperationException("Array is out of space!");
        }
        
        mQueue[mRear] = element;
        mRear = (mRear + 1) % mQueue.length;
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
