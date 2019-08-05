/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uz.ubtuit.se.medhistoryservice.symptom;

import java.util.List;
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
        SymptomControllerImpl s = new SymptomControllerImpl();
        s.deleteSymptom(id);
       
    
    
    }
    
    @Test
    public void testAddSymptom(){
        Symptom s = new Symptom();
        s.setName("uxlash");
        s.setInformation("kop uxlash");
        SymptomControllerImpl symp = new SymptomControllerImpl();
        symp.addSymptom(s);
    }
    
    @Test
    public void updateSymptom(){
    Symptom s = new Symptom();
    s.setId(23);
    s.setName("grip");
    s.setInformation("shamollash");   
    }
    @Test 
    public void testGetAllSymptoms() {
        SymptomControllerImpl symp = new SymptomControllerImpl();
        List<Symptom> all = symp.getAllSymptoms();
        for (Symptom s : all) {
            System.out.println("name = " + s.getName() + "| Info = " + s.getInformation());
        }
    }
    @Test 
    public void testGetSymptomByID() {
        SymptomControllerImpl symp = new SymptomControllerImpl();
        Symptom s = symp.getSymptomByID(23);
        System.out.println("name = " + s.getName() + "| Info = " + s.getInformation());
    }
}
