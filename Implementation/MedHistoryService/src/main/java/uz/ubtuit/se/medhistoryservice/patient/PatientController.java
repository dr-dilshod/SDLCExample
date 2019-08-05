/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package uz.ubtuit.se.medhistoryservice.patient;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
//import javax.ws.rs.GET;
//import javax.ws.rs.Path;
//import javax.ws.rs.Produces;
//import javax.ws.rs.core.MediaType;
import uz.ubtuit.se.medhistoryservice.config.DBConnection;


/**
 *
 * @author Bekturdi_
 */
public class PatientController {

//    @GET
//    @Path(value = "getAllPatient")
//    @Produces(value = MediaType.APPLICATION_JSON)
    public List<Patient> getAllPatient() {
        DBConnection mysqlConnect = new DBConnection();
        String sql = "SELECT * FROM patient";
        List<Patient> patients = new ArrayList<>();
        try {
            ResultSet resultSet = mysqlConnect.connect().createStatement().executeQuery(sql);
            while (resultSet.next()) {
                String Name = resultSet.getString("name");
                String Surname = resultSet.getString("surname");
                String login = resultSet.getString("login");
                String password = resultSet.getString("password");
                Date date = resultSet.getDate("birth_date");
                String address = resultSet.getString("address");
                String phone = resultSet.getString("phone");
                String bloodgroup = resultSet.getString("bloodgroup");
                
                Patient p = new Patient();
                
                p.setName(Name);
                p.setSurname(Surname);
                p.setLogin(login);
                p.setPassword(password);
                p.setAddress(address);
                p.setBirthDate(date);
                p.setPhone(phone);
                p.setBlood_group(bloodgroup);
                
                patients.add(p);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            mysqlConnect.disconnect();
        }
        return patients;
    }
}
