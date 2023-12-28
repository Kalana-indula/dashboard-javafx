package lk.ijse.stockmanagerev02.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class DashboardForm {
    public AnchorPane rootNode;
    public AnchorPane root;

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

    public void itemBtnClicked(ActionEvent actionEvent) throws IOException {
        //Fetching the scene from fxml form
       Parent rootNode= FXMLLoader.load(this.getClass().getResource("/view/item_form.fxml"));
       //Creating a scene from fxml form
       Scene scene=new Scene(rootNode);
       //Setting the scene on dashboard window
        Stage primaryStage=(Stage)this.rootNode.getScene().getWindow();
        primaryStage.setScene(scene);
        primaryStage.setTitle("Item Manager");
    }

    public void supplierBtnClicked(ActionEvent actionEvent) throws IOException {
        //Fetch the scene from fxml form
        Parent supplierScene=FXMLLoader.load(this.getClass().getResource("/view/supplier_form.fxml"));


        //Get a pane from dashboard windoq
        this.root.getChildren().clear();
        //apply new scene to the pane
        this.root.getChildren().add(supplierScene);
    }
}
