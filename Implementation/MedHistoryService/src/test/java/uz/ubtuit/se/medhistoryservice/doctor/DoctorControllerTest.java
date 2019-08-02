/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uz.ubtuit.se.medhistoryservice.doctor;

import java.sql.Date;
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
        DoctorControllerImpl instance = new DoctorControllerImpl();
        List<Doctor> expResult = null;
//        List<Doctor> result = instance.getAllDoctors();
        
        // TODO review the generated test code and remove the default call to fail.
    }
    @Test
    public void testGetDoctorById() {
        System.out.println("getAllDoctors");
        DoctorControllerImpl instance = new DoctorControllerImpl();
        
        
        // TODO review the generated test code and remove the default call to fail.
    }
    @Test
    public void testAddDoctor() {
        Doctor d = new Doctor();
        d.setFirstName("Apandi");
        d.setLastName("Programmistlar");
        d.setLogin("Java");
        d.setPassword("1234");
        d.setBirthDate(Date.valueOf("2019-08-14"));
        d.setAddress("Earth");
        DoctorController dc = new DoctorControllerImpl();
        dc.addDoctor(d);
    }
       @Test
    public void testUpdateDoctor() {
        Doctor d = new Doctor();
        d.setId(5);
        d.setFirstName("Apandi123");
        d.setLastName("Programmistlar123");
        d.setLogin("Java123");
        d.setPassword("1234");
        d.setBirthDate(Date.valueOf("2019-08-14"));
        d.setAddress("Earth");
        DoctorController dc = new DoctorControllerImpl();
        dc.updateDoctor(d);
    }
    @Test 
    public void testDeleteDoctor(){
        int id = 1;
        DoctorController dc = new DoctorControllerImpl();
        dc.deleteDoctor(id);
    }
    
}
