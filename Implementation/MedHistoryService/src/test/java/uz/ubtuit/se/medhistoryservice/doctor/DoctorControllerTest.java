/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uz.ubtuit.se.medhistoryservice.doctor;

import com.google.gson.Gson;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
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
    public void testAddDoctor() throws UnirestException {
        Doctor d = new Doctor();
        d.setFirstName("WebServiceTest");
        d.setLastName("JSONTest");
        d.setLogin("json");
        d.setPassword("123");
        d.setBirthDate(Date.valueOf("2019-08-14"));
        d.setAddress("urganch");
        Gson serializer = new Gson();
        HttpResponse<String> response;
        //Unirest.setObjectMapper(new GsonObjectMapper());
        response = Unirest.put("http://172.20.120.220:8889/api/doctor/AddDoctor").
                header("accept", "application/json")
                .header("Content-Type", "application/json")
                .body(serializer.toJson(d))
                .asString();
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
