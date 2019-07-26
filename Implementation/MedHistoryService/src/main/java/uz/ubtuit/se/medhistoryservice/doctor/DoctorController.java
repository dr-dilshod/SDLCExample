/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uz.ubtuit.se.medhistoryservice.doctor;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import uz.ubtuit.se.medhistoryservice.config.DBConnection;

/**
 *
 * @author dilshod
 */
public class DoctorController {
    @GET
    @Path(value = "getAllDoctors")
    @Produces(value = MediaType.APPLICATION_JSON)
    public List<Doctor> getAllDoctors() {
        DBConnection mysqlConnect = new DBConnection();
        String sql = "SELECT * FROM doctor";
        List<Doctor> doctors = new ArrayList<>();
        try {
            ResultSet resultSet = mysqlConnect.connect().createStatement().executeQuery(sql);
            while (resultSet.next()) {
                String firstName = resultSet.getString("first_name");
                String lastName = resultSet.getString("last_name");
                String login = resultSet.getString("login");
                String password = resultSet.getString("password");
                Date date = resultSet.getDate("birth_date");
                String address = resultSet.getString("address");
                
                Doctor doc = new Doctor();
                
                doc.setFirstName(firstName);
                doc.setLastName(lastName);
                doc.setLogin(login);
                doc.setPassword(password);
                doc.setAddress(address);
                doc.setBirthDate(date);
                
                doctors.add(doc);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            mysqlConnect.disconnect();
        }
        return doctors;
    }
}
