/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uz.ubtuit.se.medhistoryservice.history;

import javax.ws.rs.Path;

/**
 *
 * @author xursand
 */
@Path(value = "history")
public class History {
    private int id;
    private String name;
    private String symptom;
    private String reason;
    private String severity;
    private String patient;
    private String doctor;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSymptom() {
        return symptom;
    }

    public String getReason() {
        return reason;
    }

    public String getSeverity() {
        return severity;
    }

    public String getPatient() {
        return patient;
    }

    public String getDoctor() {
        return doctor;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSymptom(String symptom) {
        this.symptom = symptom;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public void setSeverity(String severity) {
        this.severity = severity;
    }

    public void setPatient(String patient) {
        this.patient = patient;
    }

    public void setDoctor(String doctor) {
        this.doctor = doctor;
    }

    
    
}
