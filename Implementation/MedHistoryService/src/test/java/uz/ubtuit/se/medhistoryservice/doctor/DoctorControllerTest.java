/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uz.ubtuit.se.medhistoryservice.doctor;

import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author dilshod
 */
public class DoctorControllerTest {
    
    public DoctorControllerTest() {
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
     * Test of getAllDoctors method, of class DoctorController.
     */
    @Test
    public void testGetAllDoctors() {
        System.out.println("getAllDoctors");
        DoctorController instance = new DoctorController();
        List<Doctor> expResult = null;
        List<Doctor> result = instance.getAllDoctors();
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
      @Test
    public void testGetDoctorById() {
        System.out.println("getAllDoctors");
        DoctorController instance = new DoctorController();
        
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
