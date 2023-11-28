package controller;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class DashboardFormController {
    public AnchorPane dashboardPaneContext;
    public Label lbl_PatientCount;
    public Label lbl_MedicCount;
    public Label lbl_MedicalRecordCount;
    public Label lbl_AppointmentCount;
    public Label lbl_LabTestCount;
    public Label lbl_PrescriptionCount;

    public void initialize(){

    }

    public void managePatientOnAction(ActionEvent actionEvent) {
    }

    public void manageMedicOnAction(ActionEvent actionEvent) {
    }

    public void manageMedicalRecordOnAction(ActionEvent actionEvent) {
    }

    public void manageAppointmentOnAction(ActionEvent actionEvent) {
    }

    public void manageLabTestOnAction(ActionEvent actionEvent) {
    }

    public void managePrescriptionOnAction(ActionEvent actionEvent) {
    }

    public void logoutOnAction(ActionEvent actionEvent) {
    }

    public void setUI(String location) throws IOException {
        Stage stage = (Stage) dashboardPaneContext.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/" + location + ".fxml"))));
    }
}
