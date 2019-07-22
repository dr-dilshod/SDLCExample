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

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
/**
 *
 * @author dilshod
 */
public class DoctorTest {
    
    public DoctorTest() {
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
     * Test of setFirstName method, of class Doctor.
     */
    @Test
    public void testSetFirstName() {
        System.out.println("setFirstName");
        String firstName = "";
        Doctor instance = new Doctor();
        instance.setFirstName(firstName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLastName method, of class Doctor.
     */
    @Test
    public void testSetLastName() {
        System.out.println("setLastName");
        String lastName = "";
        Doctor instance = new Doctor();
        instance.setLastName(lastName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLogin method, of class Doctor.
     */
    @Test
    public void testSetLogin() {
        System.out.println("setLogin");
        String login = "";
        Doctor instance = new Doctor();
        instance.setLogin(login);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPassword method, of class Doctor.
     */
    @Test
    public void testSetPassword() {
        System.out.println("setPassword");
        String password = "";
        Doctor instance = new Doctor();
        instance.setPassword(password);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setBirthDate method, of class Doctor.
     */
    @Test
    public void testSetBirthDate() {
        System.out.println("setBirthDate");
        Date birthDate = null;
        Doctor instance = new Doctor();
        instance.setBirthDate(birthDate);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAddress method, of class Doctor.
     */
    @Test
    public void testSetAddress() {
        System.out.println("setAddress");
        String address = "";
        Doctor instance = new Doctor();
        instance.setAddress(address);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFirstName method, of class Doctor.
     */
    @Test
    public void testGetFirstName() {
        System.out.println("getFirstName");
        Doctor instance = new Doctor();
        String expResult = "";
        String result = instance.getFirstName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLastName method, of class Doctor.
     */
    @Test
    public void testGetLastName() {
        System.out.println("getLastName");
        Doctor instance = new Doctor();
        String expResult = "";
        String result = instance.getLastName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLogin method, of class Doctor.
     */
    @Test
    public void testGetLogin() {
        System.out.println("getLogin");
        Doctor instance = new Doctor();
        String expResult = "";
        String result = instance.getLogin();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPassword method, of class Doctor.
     */
    @Test
    public void testGetPassword() {
        System.out.println("getPassword");
        Doctor instance = new Doctor();
        String expResult = "";
        String result = instance.getPassword();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBirthDate method, of class Doctor.
     */
    @Test
    public void testGetBirthDate() {
        System.out.println("getBirthDate");
        Doctor instance = new Doctor();
        Date expResult = null;
        Date result = instance.getBirthDate();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAddress method, of class Doctor.
     */
    @Test
    public void testGetAddress() {
        System.out.println("getAddress");
        Doctor instance = new Doctor();
        String expResult = "";
        String result = instance.getAddress();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAllDoctors method, of class Doctor.
     */
    @Test
    public void testGetAllDoctors() {
        System.out.println("getAllDoctors");
        Doctor instance = new Doctor();
        Doctor expResult = null;
        List<Doctor> result = instance.getAllDoctors();
        for (Doctor doc : result) {
           System.out.println(ToStringBuilder.reflectionToString(doc,ToStringStyle.SHORT_PREFIX_STYLE));
        }
    }
    
}
