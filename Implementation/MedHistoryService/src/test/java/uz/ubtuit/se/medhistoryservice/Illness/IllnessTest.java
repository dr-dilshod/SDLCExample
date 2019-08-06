
package uz.ubtuit.se.medhistoryservice.Illness;

import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import uz.ubtuit.se.medhistoryservice.illness.Illness;
import uz.ubtuit.se.medhistoryservice.illness.IllnessControllerImpl;

/**
 *
 * @author Egamberdi Otoxonov
 */
public class IllnessTest {
    
    public IllnessTest() {
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
    public void deleteIllness(){
    int id = 1;
    IllnessControllerImpl i = new IllnessControllerImpl(); 
    i.deleteIllness(id);
    }
    
     @Test
    public void testAddIllness(){
        Illness i = new Illness();
        i.setName("uxlash");
        i.setReason("kop uxlash");
        i.setSeverity("o'rtacha");
        i.setSymptom("dagasalik");
        IllnessControllerImpl ill = new IllnessControllerImpl();
        ill.addIllness(i);
    }
    
     @Test
    public void updateIllness(){
    Illness i = new Illness();
    i.setName("gripp");
    i.setReason("shamollash"); 
    }
    
     @Test 
    public void testGetAllIllneses() {
        IllnessControllerImpl ill = new IllnessControllerImpl();
        List<Illness> all = ill.getAllIllneses();
        for (Illness i : all) {
            System.out.println("name = " + i.getName() + "| reason = " + i.getReason() + "| severity = " +i.getSeverity() + "| symptom = " + i.getSymptom());
        }
    }
    @Test 
    public void testGetIllnessByID() {
    IllnessControllerImpl symp = new IllnessControllerImpl();
        Illness s = symp.getIllnessByID(23);
        System.out.println("name = " + s.getName() + "| Info = " + s.getReason());
    }
    
}
