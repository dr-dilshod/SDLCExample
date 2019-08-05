/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uz.ubtuit.se.medhistoryservice.history;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import org.json.JSONArray;
import org.json.JSONObject;
import uz.ubtuit.se.medhistoryservice.config.DBConnection;

/**
 *
 * @author MERCEDES
 */
public class HistoryControllerImp implements HistoryController {

    public List<History> getAllHistory() {
        DBConnection mysqlConnection = new DBConnection();
        String sql = "SELECT * FROM history";
//        JSONArray array=new JSONArray();
        List<History> histories = new ArrayList<>();
        try{
          ResultSet resultSet = mysqlConnection.connect().createStatement().executeQuery(sql);
            while (resultSet.next()) {
            String name = resultSet.getString("name");
            String symptom = resultSet.getString("symptom");
            String reason = resultSet.getString("reason");
            String severity = resultSet.getString("severity");
            String patient = resultSet.getString("patient");
            String doctor = resultSet.getString("doctor");
            
            History history = new History();
            
            history.setName(name);
            history.setSymptom(symptom);
            history.setReason(reason);
            history.setSeverity(severity);
            history.setPatient(patient);
            history.setDoctor(doctor);
        
//          array.put(history);
            histories.add(history);
        }
        }catch(Exception e){
        e.printStackTrace();
        }finally{
        mysqlConnection.disconnect();
        }
    return histories;
    }

    
    @Override
    public void addHistory(History history) {
               try {
            DBConnection mysqBConnection = new DBConnection();
            String sql  = "Insert into history (name, symptom, reason, severity, patient, doctor) "
                    + "VALUES(?,?,?,?,?,?)";
            java.sql.PreparedStatement preparedStatement = mysqBConnection.connect().prepareStatement(sql);
            preparedStatement.setString(1, history.getName());
            preparedStatement.setString(2, history.getSymptom());
            preparedStatement.setString(3, history.getReason());
            preparedStatement.setString(4, history.getSeverity());
            preparedStatement.setString(5, history.getPatient());
            preparedStatement.setString(6, history.getDoctor());
            preparedStatement.executeUpdate(); 
            mysqBConnection.disconnect();
        } catch (SQLException ex) {
                   Logger.getLogger(HistoryControllerImp.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    @Override
    public void deleteHistory(int id) {
                DBConnection mysqConnection = new DBConnection();
    try
    {
        
      String query = "delete from history where id = ?";
      PreparedStatement preparedStmt = mysqConnection.connect().prepareStatement(query);
      preparedStmt.setInt(1, id);
      preparedStmt.execute();
      mysqConnection.disconnect();
    }
    catch (Exception e)
    {
      System.err.println("Got an exception! ");
      System.err.println(e.getMessage());
    }

    }

    @Override
    public void updateHistory(History history) {
        DBConnection dBConnection = new DBConnection();
           try
    {
      // create the java mysql update preparedstatement
      String query = "update history set name = ?, symptom=?, reason=?, severity=?, patient=?, doctor=? "
              + "where id = ?";
      PreparedStatement preparedStatement = dBConnection.connect().prepareStatement(query);
        preparedStatement.setString(1, history.getName());
        preparedStatement.setString(2, history.getSymptom());
        preparedStatement.setString(3, history.getReason());
        preparedStatement.setString(4, history.getSeverity());
        preparedStatement.setString(5, history.getPatient());
        preparedStatement.setString(6, history.getDoctor());
        preparedStatement.setInt(7, history.getId());

      // execute the java preparedstatement
      preparedStatement.executeUpdate();
      
      dBConnection.disconnect();
    }
    catch (Exception e)
    {
      System.err.println("Got an exception! ");
      System.err.println(e.getMessage());
    }
        

    }

@GET
@Path("/GetHistoryByID/{id}")
@Produces("application/json")
public String gethistoryById(int id) {
  DBConnection mysqlConnect = new DBConnection();
        String sql = "SELECT * FROM history WHERE id=" + id;
        JSONObject someObject = null;
        try {
            ResultSet resultSet = mysqlConnect.connect().createStatement().executeQuery(sql);
            while (resultSet.next()) {
                String name = resultSet.getString("name");
                String symptom = resultSet.getString("symptom");
                String reason = resultSet.getString("reason");
                String severity = resultSet.getString("severity");
                String patient = resultSet.getString("patient");
                String doctor = resultSet.getString("doctor");
                
                History history = new History();
                history.setName(name);
                history.setSymptom(symptom);
                history.setReason(reason);
                history.setSeverity(severity);
                history.setPatient(patient);
                history.setDoctor(doctor);
                someObject = new JSONObject(history);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            mysqlConnect.disconnect();
        }
        return someObject.toString();
    }
}
    

