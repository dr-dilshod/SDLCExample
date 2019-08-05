/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uz.ubtuit.se.medhistoryservice.symptom;

/**
 *
 * @author Shohruh
 */
public class Symptom {
    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Shohruh
 */

    private int id;
    private String name;
    private String information;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getInformation() {
        return information;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setInformation(String information) {
        this.information = information;
    }
    
    
}

