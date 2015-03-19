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
public class SLinkedList implements List{
    Node head, tail;
    @Override
    public Object get(int index) {
        return -1;
    }

    @Override
    public void add(Object obj) {
        Node node = new Node();
        node.value = obj;
        
        if (head == null && tail == null) {    
            node.next = null;
            head = tail = node;
        } else {
            // We assume both head tail are not null.
            if (head != null && tail != null) {
                node.next = null;
                tail.next = node;
                tail = node;
            } else {
                // Show never happen...
                System.err.println("Invalid state only one is null: head, tail");
            }
        }
    }

    @Override
    public int size() {
        return -1;
    }
    class Node {
        Object value;
        Node next;
    }
}
