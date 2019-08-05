/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uz.ubtuit.se.medhistoryservice.symptom;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.websocket.server.PathParam;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import org.json.JSONArray;
import org.json.JSONObject;
import uz.ubtuit.se.medhistoryservice.config.DBConnection;

/**
 *
 * @author Shohruh
 */
public class  SymptomControllerImpl {
/**
 *
 * @author Shohruh
 */
    @GET
    @Path("/GetAllSymptoms")
    @Produces("application/json")
    public List<Symptom> getAllSymptoms() {
        DBConnection mysqlConnect = new DBConnection();
        String sql = "SELECT * FROM symptom";
        List<Symptom> symptoms = new ArrayList<>();
        try {
            ResultSet resultSet = mysqlConnect.connect().createStatement().executeQuery(sql);
            while (resultSet.next()) {
                String name = resultSet.getString("Name");
                String information = resultSet.getString("Information");
                Symptom symp = new Symptom();
                symp.setName(name);
                symp.setInformation(information);
                symptoms.add(symp);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            mysqlConnect.disconnect();
        }
        return symptoms;
    }
    /**
     * This method return only one doctor by its id
     */
    @GET
    @Path("/GetSymptomByID/{id}")
    @Produces("application/json")
    public Symptom getSymptomByID(int id) {
        DBConnection mysqlConnect = new DBConnection();
        String sql = "SELECT * FROM symptom WHERE ID=" + id;
        Symptom symp = new Symptom();
        try {
            ResultSet resultSet = mysqlConnect.connect().createStatement().executeQuery(sql);
            while (resultSet.next()) {
                String name = resultSet.getString("name");
                String information = resultSet.getString("information");
                symp.setName(name);
                symp.setInformation(information);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            mysqlConnect.disconnect();
        }
        return symp;
    }

    public void addSymptom(Symptom symptom) {
        DBConnection dbc = new DBConnection();
        try { 
            String sql = "INSERT INTO symptom(Name, Information) "
                    + "VALUES (?,?)";
            java.sql.PreparedStatement preparedStatement = dbc.connect().prepareStatement(sql);
            preparedStatement.setString(1, symptom.getName());
            preparedStatement.setString(2, symptom.getInformation());
          preparedStatement.executeUpdate(); 
            dbc.disconnect();
        } catch (Exception e) {  
            
            System.err.println("Got an exception! "); 
            System.err.println(e.getMessage()); 
        } 
  
    }

    public void deleteSymptom(int id) {
        DBConnection dbc = new DBConnection();
        try
        {
          String query = "DELETE FROM symptom WHERE  ID = ?";
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

    
    public void updateSymptom(Symptom symptom) {
    DBConnection dbc = new DBConnection();
    
    try
    {
      // create the java mysql update preparedstatement
      String query = "UPDATE symptom SET Name=?, Information=? "
              + "where ID = ?";
      PreparedStatement preparedStatement = dbc.connect().prepareStatement(query);
        preparedStatement.setString(1, symptom.getName());
        preparedStatement.setString(2, symptom.getInformation());
        preparedStatement.setInt(3, symptom.getId());

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
