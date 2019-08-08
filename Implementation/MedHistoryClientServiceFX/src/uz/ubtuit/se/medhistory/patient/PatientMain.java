package uz.ubtuit.se.medhistory.patient;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Created by MERCEDES on 8/8/2019.
 */
public class PatientMain extends Application{
    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("patient.fxml"));
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }
}
