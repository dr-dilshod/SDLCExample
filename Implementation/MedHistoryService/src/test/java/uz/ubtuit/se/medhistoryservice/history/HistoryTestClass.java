/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uz.ubtuit.se.medhistoryservice.history;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author MERCEDES
 */
public class HistoryTestClass {
    
    public HistoryTestClass() {
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
    public void testGetAllGistory(){
         System.out.println("getAllHistory");
         HistoryConInterface instance = new HistoryControllerImp();
        String result = instance.getAllHistory();
//        for(History history : result){
//            
//        }
    }
    
    @Test
    public void testAddHistory(){
        History h = new History();
        h.setName("name");
        h.setSymptom("symptom");
        h.setReason("reason");
        h.setSeverity("severity");
        h.setPatient("patient");
        h.setDoctor("doctor");
        HistoryConInterface historyController = new HistoryControllerImp();
         historyController.saveHistory(h);
    }
    
    
    @Test
    public void testDeleteHistry(){
    int id = 2;
    HistoryConInterface hController = new HistoryControllerImp();
    hController.deleteHistory(id);
    }


    
    @Test
    public void updateHistory(){
        History d = new History();
        d.setId(3);
        d.setName("nameX");
        d.setSymptom("symptomX");
        d.setReason("reasonX");
        d.setSeverity("severityX");
        d.setPatient("patientX");
        d.setDoctor("doctorX");
        HistoryConInterface his = new HistoryControllerImp();
        his.updateHistory(d);
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
