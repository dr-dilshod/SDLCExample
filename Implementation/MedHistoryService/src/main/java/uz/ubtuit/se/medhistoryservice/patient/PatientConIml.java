/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uz.ubtuit.se.medhistoryservice.patient;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import uz.ubtuit.se.medhistoryservice.config.DBConnection;
import uz.ubtuit.se.medhistoryservice.history.History;
import uz.ubtuit.se.medhistoryservice.history.HistoryControllerImp;

/**
 *
 * @author Bekturdi_
 */
public class PatientConIml  implements PatientCont{

    @Override
    public List<Patient> getAllPatient() {
       DBConnection mysqlConnection = new DBConnection();
        String sql = "SELECT * FROM patient";
//        JSONArray array=new JSONArray();
        List<Patient> patient = new ArrayList<>();
        try{
          ResultSet resultSet = mysqlConnection.connect().createStatement().executeQuery(sql);
            while (resultSet.next()) {
            String name = resultSet.getString("name");
            String surname = resultSet.getString("surname");
            String birthdate = resultSet.getString("birthdate");
            String login = resultSet.getString("login");
            String password = resultSet.getString("password");
            String address = resultSet.getString("address");
            String phone = resultSet.getString("phone");
            String bloodgroup = resultSet.getString("bloodgroup");
            
            Patient p = new Patient();
            p.setName(name);
            p.setSurname(surname);
            p.setBirthDate(birthdate);
            p.setLogin(login);
            p.setPassword(password);
            p.setAddress(address);
            p.setPhone(phone);
            p.setBlood_group(bloodgroup);
        
//          array.put(history);
            patient.add(p);
        }
        }catch(Exception e){
        e.printStackTrace();
        }finally{
        mysqlConnection.disconnect();
        }
    return patient;
    }

    @Override
    public void addPatient(Patient patient) {
           try {
            DBConnection mysqBConnection = new DBConnection();
            String sql  = "Insert into patient (name, surname, birthdate, login, password, address, phone, bloodgroup) "
                    + "VALUES(?,?,?,?,?,?,?,?)";
            java.sql.PreparedStatement preparedStatement = mysqBConnection.connect().prepareStatement(sql);
            preparedStatement.setString(1, patient.getName());
            preparedStatement.setString(2, patient.getSurname());
            preparedStatement.setDate(3, (Date) patient.getBirthDate());
            preparedStatement.setString(4, patient.getLogin());
            preparedStatement.setString(5, patient.getPassword());
            preparedStatement.setString(6, patient.getAddress());
            preparedStatement.setString(7, patient.getPhone());
            preparedStatement.setString(8, patient.getBlood_group());
            preparedStatement.executeUpdate(); 
            mysqBConnection.disconnect();
        } catch (SQLException ex) {
                   Logger.getLogger(PatientConIml.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void deletePatient(int id) {
              DBConnection mysqConnection = new DBConnection();
    try
    {
        
      String query = "delete from patient where id = ?";
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
    public void updatePatient(Patient patient) {
     DBConnection dBConnection = new DBConnection();
           try
    {
      // create the java mysql update preparedstatement
      String query = "update patient set name = ?, surname=?, birthdate=?, login=?, password=?, address=? ,phone=?, bloodgroup=?  "
              + "where id = ?";
      PreparedStatement preparedStatement = dBConnection.connect().prepareStatement(query);
        preparedStatement.setString(1, patient.getName());
            preparedStatement.setString(2, patient.getSurname());
            preparedStatement.setDate(3, (Date) patient.getBirthDate());
            preparedStatement.setString(4, patient.getLogin());
            preparedStatement.setString(5, patient.getPassword());
            preparedStatement.setString(6, patient.getAddress());
            preparedStatement.setString(7, patient.getPhone());
            preparedStatement.setString(8, patient.getBlood_group());
           
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

    @Override
    public String getPatientById(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
