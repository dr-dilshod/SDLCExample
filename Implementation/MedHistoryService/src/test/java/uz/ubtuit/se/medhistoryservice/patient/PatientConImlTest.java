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
public class PatientConImlTest {
    
    public PatientConImlTest() {
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
     * Test of getAllPatient method, of class PatientConIml.
     */
    @Test
    public void testGetAllPatient() {
        System.out.println("getAllPatient");
        PatientConIml instance = new PatientConIml();
        List<Patient> expResult = null;
        List<Patient> result = instance.getAllPatient();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addPatient method, of class PatientConIml.
     */
    @Test
    public void testAddPatient() {
        System.out.println("addPatient");
        Patient patient = null;
        PatientConIml instance = new PatientConIml();
        instance.addPatient(patient);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deletePatient method, of class PatientConIml.
     */
    @Test
    public void testDeletePatient() {
        System.out.println("deletePatient");
        int id = 1;
        PatientConIml instance = new PatientConIml();
        instance.deletePatient(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updatePatient method, of class PatientConIml.
     */
    @Test
    public void testUpdatePatient() {
        System.out.println("updatePatient");
        Patient patient = null;
        PatientConIml instance = new PatientConIml();
        instance.updatePatient(patient);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPatientById method, of class PatientConIml.
     */
    @Test
    public void testGetPatientById() {
        System.out.println("getPatientById");
        String id = "";
        PatientConIml instance = new PatientConIml();
        String expResult = "";
        String result = instance.getPatientById(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
