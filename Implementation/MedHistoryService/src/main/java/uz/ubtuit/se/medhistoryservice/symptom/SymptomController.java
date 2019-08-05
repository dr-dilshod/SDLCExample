/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uz.ubtuit.se.medhistoryservice.symptom;

import javax.websocket.server.PathParam;

/**
 *
 * @author Delux
 */
public interface SymptomController {
    
    public String getAllSymptom();
    public String getSymptomByID(int id);
    public void addSymptom(Symptom symptom);
    public void deleteSymptom(int id);
    public void updateSymptom(Symptom symptom);
    
}
    

