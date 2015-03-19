/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab12;

/**
 *
 * @author pwest
 */
public interface List {
    public abstract Object get(int index);
    public abstract void add(Object obj);
    public abstract int size();
}
