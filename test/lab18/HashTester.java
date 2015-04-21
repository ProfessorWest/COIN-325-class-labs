/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab18;

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
public class HashTester {
    
    public HashTester() {
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
    public void HashPutTest() {
        HashLinkedChaining<String, Employee> hash = 
                new HashLinkedChaining<String, Employee>();
        
        hash.put("123-45-6789Vulcan",
                new Employee("Dan", "123-45-6789", "01-01-2000", "Vulcan"));
        hash.put("123-45-6000Human",
                new Employee("Captian Kirk", "123-45-6000", "01-01-2263", "Human"));
        hash.put("123-45-5000Human",
                new Employee("Uhura", "123-45-5000", "01-02-2263", "Human"));
        
        assertTrue(hash.get("123-45-6789Vulcan").getBDay().equals("01-01-2000"));
        assertTrue(hash.get("123-45-6000Human").getBDay().equals("01-01-2263"));
        assertTrue(hash.get("123-45-5000Human").getBDay().equals("01-02-2263"));
        
        assertTrue(hash.size() == 3);
    }
}
