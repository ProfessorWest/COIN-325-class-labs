package lab18;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pwest
 */
public class HashNode<K, V> {
    private K mKey;
    private V mValue;
    
    HashNode(K key, V value) {
        setKey(key);
        setValue(value);
    }
    
    public void setKey(K key) {
        mKey = key;
    }
    public void setValue(V value) {
        mValue = value;
    }
    public K getKey() {
        return mKey;
    }
    public V getValue() {
        return mValue;
    }
}
