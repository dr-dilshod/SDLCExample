/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uz.ubtuit.se.medhistoryservice.doctor;

import javax.ws.rs.PathParam;

/**
 *
 * @author dilshod
 */
public interface DoctorController {
    public String getAllDoctors();
    public String getDoctorByID(@PathParam("id") String id);
    public void addDoctor(String docInString);
    public void deleteDoctor(int id);
    public void updateDoctor(Doctor doctor);
    
}
