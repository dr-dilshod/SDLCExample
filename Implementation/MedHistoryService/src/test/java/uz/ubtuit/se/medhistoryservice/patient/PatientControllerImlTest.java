/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uz.ubtuit.se.medhistoryservice.patient;

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
 * @author Bekturdi_
 */
public class PatientControllerImlTest {
    
    public PatientControllerImlTest() {
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
        PatientControllerIml instance = new PatientControllerIml();
        List<Patient> result = instance.getAllPatient();
        for (Patient doc : result) {
           System.out.println(ToStringBuilder.reflectionToString(doc,ToStringStyle.SHORT_PREFIX_STYLE));
        }
    }

    /**
     * Test of addPatient method, of class PatientConIml.
     */
    @Test
    public void testAddPatient() {
        System.out.println("addPatient");
        Patient patient = null;
        PatientControllerIml instance = new PatientControllerIml();
        instance.addPatient(patient);
    }

    /**
     * Test of deletePatient method, of class PatientConIml.
     */
    @Test
    public void testDeletePatient() {
        System.out.println("deletePatient");
        int id = 1;
        PatientControllerIml instance = new PatientControllerIml();
        instance.deletePatient(id);
    }

    /**
     * Test of updatePatient method, of class PatientConIml.
     */
    @Test
    public void testUpdatePatient() {
        System.out.println("updatePatient");
        Patient patient = null;
        PatientControllerIml instance = new PatientControllerIml();
        instance.updatePatient(patient);
    }

    /**
     * Test of getPatientById method, of class PatientConIml.
     */
    @Test
    public void testGetPatientById() {
        System.out.println("getPatientById");
        String id = "";
        PatientControllerIml instance = new PatientControllerIml();
        String expResult = "";
        String result = instance.getPatientById(id);
//        assertEquals(expResult, result);
    }
    
}
