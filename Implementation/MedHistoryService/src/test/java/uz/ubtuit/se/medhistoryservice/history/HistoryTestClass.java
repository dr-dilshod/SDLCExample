/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uz.ubtuit.se.medhistoryservice.history;

import java.util.List;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
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
    public void testGetAllHistory(){
         System.out.println("getAllHistory");
         HistoryController instance = new HistoryControllerImp();
         List<History> result = instance.getAllHistory();
        for (History doc : result) {
           System.out.println(ToStringBuilder.reflectionToString(doc,ToStringStyle.SHORT_PREFIX_STYLE));
        }
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
        HistoryController historyController = new HistoryControllerImp();
        historyController.addHistory(h);
    }
    
    
    @Test
    public void testDeleteHistry(){
    int id = 2;
    HistoryController hController = new HistoryControllerImp();
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
        HistoryController his = new HistoryControllerImp();
        his.updateHistory(d);
    }
    @Test
    public void getHistoryById(){
            int id = 3;
            HistoryControllerImp hc = new HistoryControllerImp();
//            History h = hc.gethistoryById(id);
    
    
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
