/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab17;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author pwest
 */
public class QueueTester {
    
    public QueueTester() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Test
    public void LinkedStackTest() {
        IntegerStackTest(new LinkedQueue<Integer>());
    }
    
    @Test
    public void ArrayStackTest() {
        IntegerStackTest(new CircularArrayQueue<Integer>(10));
    }
    
    private void IntegerStackTest(Queue<Integer> queue) {
        queue.enqueue(new Integer(1));
        queue.enqueue(new Integer(10));
        queue.enqueue(new Integer(6));
        
        try{
            assertTrue(queue.size() == 3);
            assertTrue(queue.first().intValue() == 1);
            assertTrue(queue.dequeue().intValue() == 1);
            assertTrue(queue.dequeue().intValue() == 10);

            assertTrue(queue.size() == 1);
            assertTrue(!queue.isEmpty());
            assertTrue(queue.dequeue().intValue() == 6);
            assertTrue(queue.isEmpty());

            assertTrue(queue.size() == 0);
            
            for (int i = 0; i < 9; i++ ){
                queue.enqueue(new Integer(i));
            }
            
            for (int i = 0; i < 9; i++ ){
                assertTrue(queue.dequeue().intValue() == i);
            }
        }catch(EmptyCollectionException ece) {
            System.err.println("Should not ever be here.");
        }
        
        
    }
    
    @Test 
    public void EmptyTest() {
        LinkedQueue<Integer> queue = new LinkedQueue<Integer>();
        
        try{
            queue.first();
            fail("first should have thrown an exception!");
        }catch(EmptyCollectionException ece){
        }
        
        try{
            queue.dequeue();
            fail("dequeue should have thrown an exception!");
        }catch(EmptyCollectionException ece){
        }
    }
}
