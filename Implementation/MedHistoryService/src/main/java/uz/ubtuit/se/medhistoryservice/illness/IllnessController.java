/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uz.ubtuit.se.medhistoryservice.illness;
/**
 *
 * @author Delux
 */
public interface IllnessController {
 
 public String getAllIllness();
 public String getIllnesByID(int id);
 public void addIllness(Illness illness);
 public void deleteIllness(int id);
 public void updateIllness(Illness illness); 

//  public String getAllSymptom();
    //public String getSymptomByID(int id);
   // public void addSymptom(Symptom symptom);
   // public void deleteSymptom(int id);
   // public void updateSymptom(Symptom symptom);
}
