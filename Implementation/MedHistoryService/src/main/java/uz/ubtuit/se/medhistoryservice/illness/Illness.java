/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uz.ubtuit.se.medhistoryservice.illness;

/**
 *
 * @author dilshod
 */
public class Illness {
  private int id;
  private String name;
  private String reason;
  private String Severity;
  private String  Symptom;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getSeverity() {
        return Severity;
    }

    public void setSeverity(String Severity) {
        this.Severity = Severity;
    }

    public String getSymptom() {
        return Symptom;
    }

    public void setSymptom(String Symptom) {
        this.Symptom = Symptom;
    }
  
    
    
    
}
