/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab10;

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
public class QuizTest {
    
    public QuizTest() {
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
    public void testQuestions() {
        Question q = new Question("Who shot first?", "Han");
        assertTrue(q.getAnswer().equals("Han"));
        assertTrue(q.getQuestion().equals("Who shot first?"));
    }
    
    @Test
    public void testQuiz() {
        Quiz quiz = new Quiz();
        Question q = new Question("Who shot first?", "Han");
        Question q2 = new Question("What is 1+1?", "2");
        
        quiz.add(q);
        quiz.add(q2);
        
        Question qret = quiz.getQuestion(0);
        assertTrue(quiz.getQuestion(-1) == null);
        assertTrue(quiz.getQuestion(25) == null);
        assertTrue(qret == q);
        assertTrue(q2 == quiz.getQuestion(1));
        
        assertTrue(quiz.getQuestion(0).getQuestion().equals("Who shot first?"));
        quiz.getQuestion(0).setResponse("Greedo");
        assertTrue(quiz.getQuestion(0).getResponse().equals("Greedo"));
        
        assertTrue(quiz.getNumberOfQuestions() == 2);
        assertTrue(quiz.getNumberOfCorrectResponses() == 0);
        quiz.getQuestion(1).setResponse("2");
        assertTrue(quiz.getNumberOfCorrectResponses() == 1);
    }
}
