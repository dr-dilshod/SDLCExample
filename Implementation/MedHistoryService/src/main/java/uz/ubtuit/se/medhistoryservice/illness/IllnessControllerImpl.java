
package uz.ubtuit.se.medhistoryservice.illness;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import uz.ubtuit.se.medhistoryservice.config.DBConnection;
import uz.ubtuit.se.medhistoryservice.illness.Illness;


/**
 *
 * @author Shohruh
 */
public class IllnessControllerImpl implements IllnessController{
    @GET
    @Path("/GetAllillneses")
    @Produces("application/json")
    public List<Illness> getAllIllnesses() {
        DBConnection mysqlConnect = new DBConnection();
        String sql = "SELECT * FROM illness";
        List<Illness> illneses = new ArrayList<>();
        try {
            ResultSet resultSet = mysqlConnect.connect().createStatement().executeQuery(sql);
            while (resultSet.next()) {
                String name = resultSet.getString("Name");
                String reason = resultSet.getString("reason");
                String Severity = resultSet.getString("severity");
                String symptom = resultSet.getString("symptom");
                Illness ill = new Illness();
                ill.setName(name);
                ill.setReason(reason);
                ill.setSymptom(symptom);

                illneses.add(ill);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            mysqlConnect.disconnect();
        }
        return illneses;
    }
    /**
     * This method return only one doctor by its id
     */
    @GET
    @Path("/GetSymptomByID/{id}")
    @Produces("application/json")
    public Illness getIllnessByID(int id) {
        DBConnection mysqlConnect = new DBConnection();
        String sql = "SELECT * FROM illness WHERE ID=" + id;
        Illness ill = new Illness();
        try {
            ResultSet resultSet = mysqlConnect.connect().createStatement().executeQuery(sql);
            while (resultSet.next()) {
                String name = resultSet.getString("name");
                String reason = resultSet.getString("reason");
                ill.setName(name);
                ill.setReason(reason);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            mysqlConnect.disconnect();
        }
        return ill;
    }
    public void addIllness(Illness illness) {
        DBConnection dbc = new DBConnection();
        try { 
            String sql = "INSERT INTO illness(Name, reason, severity, symptom)"
                    + " VALUES (?,?,?,?)";
            java.sql.PreparedStatement preparedStatement = dbc.connect().prepareStatement(sql);
            preparedStatement.setString(1, illness.getName());
            preparedStatement.setString(2, illness.getReason());
            preparedStatement.setString(3, illness.getSeverity());
            preparedStatement.setString(4, illness.getSymptom());
            
          preparedStatement.executeUpdate(); 
            dbc.disconnect();
        } catch (Exception e) {  
            
            System.err.println("Got an exception! "); 
            System.err.println(e.getMessage()); 
        } 
    }
    
    
     public void deleteIllness(int id) {
        DBConnection dbc = new DBConnection();
        
        try
        {
          String query = "DELETE FROM illness WHERE id=?";
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
    
   public void updateIllness(Illness illness) {
    DBConnection dbc = new DBConnection();
    
    try
    {
      // create the java mysql update preparedstatement
      String query = "UPDATE illness SET Name=?, reason=?, severity=?, symptom=?"
              + " WHERE Id=?";
      PreparedStatement preparedStatement = dbc.connect().prepareStatement(query);
        preparedStatement.setString(1, illness.getName());
        preparedStatement.setString(2, illness.getReason());
        preparedStatement.setString(2, illness.getSeverity());
        preparedStatement.setString(2, illness.getSymptom());
        preparedStatement.setInt(3, illness.getId());

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
