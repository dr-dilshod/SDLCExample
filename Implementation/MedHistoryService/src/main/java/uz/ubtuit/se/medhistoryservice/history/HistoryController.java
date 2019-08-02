/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uz.ubtuit.se.medhistoryservice.history;

import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.integration.c3p0.MysqlConnectionTester;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import uz.ubtuit.se.medhistoryservice.config.DBConnection;

/**
 *
 * @author MERCEDES
 */
public class HistoryController {
    
    public List<History> getAllHistory() throws SQLException{
        DBConnection mysqlConnection = new DBConnection();
        String sql = "SELECT * FROM histroy";
        List<History> histories = new ArrayList<>();
        ResultSet resultSet = mysqlConnection.connect().createStatement().executeQuery(sql);
        try{
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
           histories.add(history);
        }
        }catch(Exception e){
        e.printStackTrace();
        }finally{
        mysqlConnection.disconnect();
        }
            
    return histories;
    
    }
    
    public void saveHistory() throws SQLException{
        DBConnection mysqBConnection = new DBConnection();
        String sql  = "Insert into history (name, symptom, reason, severity, patient, doctor) values(?,?,?,?,?,?)";
        History history = new History();
//         ResultSet resultSet = mysqlConnection.connect().createStatement().executeQuery(sql);
        ResultSet resultSet = mysqBConnection.connect().createStatement().executeQuery(sql);
    }
    
}
