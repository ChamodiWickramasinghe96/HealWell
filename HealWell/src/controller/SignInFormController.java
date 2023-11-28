package controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.Window;

import java.io.IOException;

public class SignInFormController {
    public AnchorPane signInPaneContext;
    public JFXTextField tf_UserName;
    public JFXTextField tf_Password;
    public JFXButton btn_SignIn;

    public void signInOnAction(ActionEvent actionEvent) throws IOException {
        setUI("DashboardForm");
    }

    public void setUI(String location) throws IOException {
        Stage stage = (Stage) signInPaneContext.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/" + location + ".fxml"))));
    }
}
