/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uz.ubtuit.se.medhistoryservice.patient;

import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Bekturdi_
 */
public class PatientControllerTest {
    
    public PatientControllerTest() {
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

    /**
     * Test of getAllPatient method, of class PatientController.
     */
    @org.junit.Test
    public void testGetAllPatient() {
        System.out.println("getAllPatient");
        PatientController instance = new PatientController();
        List<Patient> expResult = null;
        List<Patient> result = instance.getAllPatient();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetDoctorById() {
        System.out.println("getAllPatients");
        PatientController instance = new PatientController();
    
          // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
