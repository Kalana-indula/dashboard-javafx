package lk.ijse.stockmanagerev02;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Launcher extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage stage) throws Exception {
        Parent root= FXMLLoader.load(this.getClass().getResource("/view/dashboard_form.fxml"));

        Scene scene=new Scene(root);

        stage.centerOnScreen();
        stage.setScene(scene);
        stage.setTitle("Dash Board");

        stage.show();
    }
}
