/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uz.ubtuit.se.medhistoryservice.patient;

import java.util.List;
import javax.ws.rs.PathParam;
import uz.ubtuit.se.medhistoryservice.history.History;

/**
 *
 * @author Bekturdi_
 */
public interface PatientController {
     public List<Patient> getAllPatient();
        public void addPatient(Patient patient);
        public void deletePatient(int id);
        public void updatePatient(Patient patient);
        public String getPatientById(@PathParam("id") String id);
}
