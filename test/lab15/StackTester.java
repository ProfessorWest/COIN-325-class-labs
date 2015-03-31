/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab15;

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
public class StackTester {
    
    public StackTester() {
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
    public void ArrayStackTest() {
        IntegerStackTest(new ArrayStack<Integer>());
    }
    
    private void IntegerStackTest(Stack<Integer> stack) {
        stack.push(new Integer(1));
        stack.push(new Integer(10));
        stack.push(new Integer(6));
        
        try{
            assertTrue(stack.size() == 3);
            assertTrue(stack.peek().intValue() == 6);
            assertTrue(stack.pop().intValue() == 6);
            assertTrue(stack.pop().intValue() == 10);

            assertTrue(stack.size() == 1);
            assertTrue(!stack.isEmpty());
            assertTrue(stack.pop().intValue() == 1);
            assertTrue(stack.isEmpty());

            assertTrue(stack.size() == 0);
        }catch(EmptyCollectionException ece) {
            System.err.println("Should not ever be here.");
        }
        
        
    }
    
    @Test 
    public void EmptyTest() {
        ArrayStack<Integer> stack = new ArrayStack<Integer>();
        
        try{
            stack.peek();
            fail("peek should have thrown an exception!");
        }catch(EmptyCollectionException ece){
        }
        
        try{
            stack.pop();
            fail("pop should have thrown an exception!");
        }catch(EmptyCollectionException ece){
        }
    }
}
