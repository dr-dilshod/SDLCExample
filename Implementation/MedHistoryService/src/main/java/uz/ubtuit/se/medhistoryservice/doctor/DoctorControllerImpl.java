/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uz.ubtuit.se.medhistoryservice.doctor;

import com.google.gson.Gson;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonObject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import org.json.JSONArray;
import org.json.JSONObject;
import uz.ubtuit.se.medhistoryservice.config.DBConnection;

/**
 *
 * @author dilshod
 */
@Path("/doctor")
public class DoctorControllerImpl implements DoctorController {
    /**
     * This method returns all doctors available in the DB table
     * @return
     */
    @GET
    @Path("/GetAllDoctors")
    @Produces("application/json")
    public String getAllDoctors() {
        DBConnection mysqlConnect = new DBConnection();
        String sql = "SELECT * FROM doctor";
        JSONArray array=new JSONArray();
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
                
                array.put(new JSONObject(doc));
                doctors.add(doc);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            mysqlConnect.disconnect();
        }
        return array.toString();
    }
    /**
     * This method return only one doctor by its id
     */
    @GET
    @Path("/GetDoctorByID/{id}")
    @Produces("application/json")
    public String getDoctorByID(@PathParam("id") String id) {
        DBConnection mysqlConnect = new DBConnection();
        String sql = "SELECT * FROM doctor WHERE id=" + id;
        JSONObject someObject = null;
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
                someObject = new JSONObject(doc);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            mysqlConnect.disconnect();
        }
        return someObject.toString();
    }

    @Override
    public void addDoctor(Doctor doctor) {
        DBConnection dbc = new DBConnection();
        try { 
            String sql = "INSERT INTO doctor (first_name, last_name, login, password, birth_date, address) " + 
                "VALUES (?, ?, ?, ?, ?, ?)";
            java.sql.PreparedStatement preparedStatement = dbc.connect().prepareStatement(sql);
            preparedStatement.setString(1, doctor.getFirstName());
            preparedStatement.setString(2, doctor.getLastName());
            preparedStatement.setString(3, doctor.getLogin());
            preparedStatement.setString(4, doctor.getPassword());
            preparedStatement.setDate(5, doctor.getBirthDate());
            preparedStatement.setString(6, doctor.getAddress());
            preparedStatement.executeUpdate(); 
            dbc.disconnect();
        } catch (Exception e) { 
            System.err.println("Got an exception! "); 
            System.err.println(e.getMessage()); 
        } 
  
    }

    @Override
    public void deleteDoctor(int id) {
    DBConnection dbc = new DBConnection();
    try
    {
        
      String query = "delete from doctor where id = ?";
      PreparedStatement preparedStmt = dbc.connect().prepareStatement(query);
      preparedStmt.setInt(1, id);
      preparedStmt.execute();
      dbc.disconnect();
    }
    catch (Exception e)
    {
      System.err.println("Got an exception! ");
      System.err.println(e.getMessage());
    }
    }

    @Override
    public void updateDoctor(Doctor doctor) {
    DBConnection dbc = new DBConnection();
    
    try
    {
      // create the java mysql update preparedstatement
      String query = "update doctor set first_name = ?, last_name=?, login=?, password=?, birth_date=?, address=? "
              + "where id = ?";
      PreparedStatement preparedStatement = dbc.connect().prepareStatement(query);
        preparedStatement.setString(1, doctor.getFirstName());
        preparedStatement.setString(2, doctor.getLastName());
        preparedStatement.setString(3, doctor.getLogin());
        preparedStatement.setString(4, doctor.getPassword());
        preparedStatement.setDate(5, doctor.getBirthDate());
        preparedStatement.setString(6, doctor.getAddress());
        preparedStatement.setInt(7, doctor.getId());

      // execute the java preparedstatement
      preparedStatement.executeUpdate();
      
      dbc.disconnect();
    }
    catch (Exception e)
    {
      System.err.println("Got an exception! ");
      System.err.println(e.getMessage());
    }
    }
}
