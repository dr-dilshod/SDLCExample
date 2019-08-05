/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uz.ubtuit.se.medhistoryservice.symptom;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Delux
 */
public class SymptomTest {
    
    public SymptomTest() {
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
    
    
    @Test
    public void deleteSymptom(){
        int id = 23;
        SymptomController s = (SymptomController) new SymptomControllerImpl();
        s.deleteSymptom(id);
       
    
    
    }
    
    @Test
    public void testAddSymptom(){
    Symptom s = new Symptom();
    s.setId(25);
    s.setName("name");
    s.setInformation("information");
    }
    
    @Test
    public void updateSymptom(){
    Symptom s = new Symptom();
    s.setId(23);
    s.setName("grip");
    s.setInformation("shamollash");   
    }

    
    
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
