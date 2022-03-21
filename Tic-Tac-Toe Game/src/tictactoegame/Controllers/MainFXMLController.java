/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package tictactoegame.Controllers;


import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

/**
 * FXML Controller class
 *
 * @author Mohamed Hamdy
 */
public class MainFXMLController {

    
    public void onSingleModeClick(ActionEvent actionEvent) throws IOException {
        final Node source = (Node) actionEvent.getSource();
        final Stage stage = (Stage) source.getScene().getWindow();
        AnchorPane page = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("../FXML/SingleModeBoard.fxml")));
        stage.setTitle("tic-tac-toe Single Mode game");
        Scene newScene = new Scene(page);
        stage.setScene(newScene);
        stage.show();
    }

    public void onMultiModeClick(ActionEvent actionEvent) throws IOException {
        final Node source = (Node) actionEvent.getSource();
        final Stage stage = (Stage) source.getScene().getWindow();
        AnchorPane page = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("../FXML/MultiModeBoard.fxml")));
        stage.setTitle("tic-tac-toe Multi Mode game");
        Scene newScene = new Scene(page);
        stage.setScene(newScene);
        stage.show();
    }

    public void onOnlineModeClick(ActionEvent actionEvent) throws IOException {
        final Node source = (Node) actionEvent.getSource();
        final Stage stage = (Stage) source.getScene().getWindow();
        AnchorPane page = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("../FXML/Session-Window.fxml")));

        stage.setTitle("tic-tac-toe Multi Mode game");
        Scene newScene = new Scene(page);
        stage.setScene(newScene);
        stage.show();


    }

    public void onExitClick(ActionEvent actionEvent) {
        final Node source = (Node) actionEvent.getSource();
        final Stage stage = (Stage) source.getScene().getWindow();
        stage.close();
    }

    public void restartGame(ActionEvent actionEvent) {
    }    
    
}
