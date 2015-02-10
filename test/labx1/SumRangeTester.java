/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labx1;

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
public class SumRangeTester {
    
    public SumRangeTester() {
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
    public void sumRangeTester() {
        assertTrue(SumRange.sumRange(0, 1) == 1);
        assertTrue(SumRange.sumRange(1, 2) == 3);
        // -1 + 0 + 1 + 2 + 3 = 5
        assertTrue(SumRange.sumRange(-1, 3) == 5);
        // 10 + 11 = 21
        assertTrue(SumRange.sumRange(10, 11) == 21);
    }
    
    @Test
    public void SumRangeInvalidTester() {
        assertTrue(SumRange.sumRange(5, 3) == 0);
    }
}
