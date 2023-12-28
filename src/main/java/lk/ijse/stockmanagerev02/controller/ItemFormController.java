package lk.ijse.stockmanagerev02.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class ItemFormController {
    public AnchorPane itemRoot;

    public void backBtnClicked(ActionEvent actionEvent) throws IOException {
        Parent dashBoardScene= FXMLLoader.load(this.getClass().getResource("/view/dashboard_form.fxml"));

        Scene scene=new Scene(dashBoardScene);
        Stage stage= (Stage) this.itemRoot.getScene().getWindow();
        stage.setScene(scene);
        stage.setTitle("Dashboard Form");
    }
}
