package tictactoegame.Controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javax.swing.*;
import java.awt.*;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.Writer;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Objects;
import tictactoegame.Server;

public class P2PContoller {

    //Server s = new Server();
    public static final int PLAYER1 = 1;
    public static final int PLAYER2 = 2;
    public static final int PLAYER1_WON = 1;
    public static final int PLAYER2_WON = 2;
    public static final int DRAW = 3;
    public static final int CONTINUE = 4;

    @FXML
    private Text winnerText;

    @FXML
    private Button p1button;

    @FXML
    private Button p2button;
    ArrayList<Button> buttons;

    public P2PContoller() throws IOException {
    }

    public void BackButton(ActionEvent actionEvent) throws IOException {
        final Node source = (Node) actionEvent.getSource();
        final Stage stage = (Stage) source.getScene().getWindow();
        VBox page = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("Main-View.fxml")));
        Scene newScene = new Scene(page);
        stage.setScene(newScene);
        stage.show();
    }

    public void StartButton(ActionEvent actionEvent) {
        p1button.setDisable(false);


    }

    private void setupButton(Button button) {
    }

    public void player1win(ActionEvent actionEvent) throws IOException {

        Server s = new Server();
        
        //s.main();

    }

    public void player2win(ActionEvent actionEvent) throws IOException {

    }
}
