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
public class LinkedNode<T> {
    private T mElement;
    private LinkedNode<T> mNext;
    
    public T getElement() {
        return mElement;
    }
    public void setElement(T element) {
        mElement = element;
    }
    
    public LinkedNode<T> getNext() {
        return mNext;
    }
    public void setNext(LinkedNode<T> next) {
        mNext = next;
    }
}
