package lk.ijse.stockmanagerev02.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class DashboardForm {
    public void customerBtnClicked(ActionEvent actionEvent) throws IOException {

        Parent rootNode= FXMLLoader.load(this.getClass().getResource("/view/customer_form.fxml"));

        //creating a scene from loaded fxml
        Scene scene=new Scene(rootNode);
        //creating a window for created scene
        Stage stage=new Stage();

        stage.setScene(scene);
        stage.centerOnScreen();
        stage.setTitle("Customer Manager");
        stage.show();
    }
}
