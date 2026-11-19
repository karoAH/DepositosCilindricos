package org.ejemplos.depositos;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class DepositosApp extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader loader = new FXMLLoader(
                DepositosApp.class.getResource("/org/ejemplos/depositos/vista/DepositosView.fxml")
        );
        Scene scene = new Scene(loader.load(), 460, 420);
        stage.setTitle("Cálculo de Depósitos Cilíndricos");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
