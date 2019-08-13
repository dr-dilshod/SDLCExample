package uz.ubtuit.se.medhistory.restservice;

import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import org.json.JSONArray;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by MERCEDES on 8/8/2019.
 */
public class RestserverController implements Initializable{
    @FXML
    Button button;
    @FXML
    public TableView tableView;
    @FXML
    public TableColumn<RestserviceModel, String> id;
    @FXML
    public TableColumn<RestserviceModel, String> name;
    @FXML
    public TableColumn<RestserviceModel, String> surname;
    @FXML
    public TableColumn<RestserviceModel, String> login;
    @FXML
    public TableColumn<RestserviceModel, String> password;


    ObservableList<RestserviceModel> observableList = FXCollections.observableArrayList();


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        com.mashape.unirest.http.HttpResponse<JsonNode> response;
        try {
            response = Unirest.get("http://172.20.120.220:8889/api/doctor/GetAllDoctors").
                    header("accept",  "application/json").
                    asJson();
            JSONArray array = new JSONArray(response.getBody().toString());
            final ObservableList<List<String>> data = FXCollections.observableArrayList();

            for (int i = 0; i < array.length(); i ++) {
//                observableList.add(new RestserviceModel(response.getStr));

//                id.setCellValueFactory(cellData -> cellData.getValue().idProperty());
//                name.setCellValueFactory(cellData -> cellData.getValue().dateProperty());

//
//                List<String> unit = new ArrayList<String>();
//                unit.add(i + "");
//                unit.add(array.getJSONObject(i).getString("firstName"));
//                unit.add(array.getJSONObject(i).getString("lastName"));
//                unit.add(array.getJSONObject(i).getString("login"));
//                unit.add("");
//                data.addAll(unit);

//                tableView.getColumns().addAll(id,name,surname,login,"");

            }
//            treeTableView.setRoot((TreeItem) data);

        } catch (UnirestException ex) {
            Logger.getLogger(RestserverController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
