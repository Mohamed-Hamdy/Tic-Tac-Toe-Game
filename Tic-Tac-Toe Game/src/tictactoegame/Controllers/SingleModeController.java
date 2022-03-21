package tictactoegame.Controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.*;

public class SingleModeController implements Initializable {

    @FXML
    private Button button1;

    @FXML
    private Button button2;

    @FXML
    private Button button3;

    @FXML
    private Button button4;

    @FXML
    private Button button5;

    @FXML
    private Button button6;

    @FXML
    private Button button7;

    @FXML
    private Button button8;

    @FXML
    private Button button9;

    @FXML
    private Text winnerText;

    //private int playerTurn = 0;

    ArrayList<Button> buttons;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        buttons = new ArrayList<>(Arrays.asList(button1,button2,button3,button4,button5,button6,button7,button8,button9));
        buttons.forEach(button ->{
            setupButton(button);
            button.setFocusTraversable(false);
        });
    }



    private void setupButton(Button button) {
            button.setOnMouseClicked(mouseEvent -> {
                setPlayerSymbol(button);
                checkIfGameIsOver();
            });

    }

    public void setPlayerSymbol(Button button) {
        String id ;
        // Player
        button.setText("X");
        id = button.getId();
        System.out.println("id :" + id);

        button.setDisable(true);

        Random rand = new Random();
        button = buttons.get(rand.nextInt(buttons.size()));
        System.out.println("random id :" + button.getId());
        if (!Objects.equals(button.getText(), "X")) {
            button.setText("O");
        } else {
            do {
                button = buttons.get(rand.nextInt(buttons.size()));
            } while (Objects.equals(button.getText(), "X"));
            button.setText("O");
        }
        button.setDisable(true);
        //playerTurn =0;
    }


    public void checkIfGameIsOver(){
        String line = null;
            
        for (int a = 0; a < 8; a++) {
            if ( a== 0){
                line = button1.getText() + button2.getText() + button3.getText();
            }if ( a== 1){
                line = button4.getText() + button5.getText() + button6.getText();
            }if ( a== 2){
                line = button7.getText() + button8.getText() + button9.getText();
            }if ( a== 3){
                line = button1.getText() + button5.getText() + button9.getText();
            }if ( a== 4){
                line = button3.getText() + button5.getText() + button7.getText();
            }if ( a== 5){
                line = button1.getText() + button4.getText() + button7.getText();
            }if ( a== 6){
                line = button2.getText() + button5.getText() + button8.getText();
            }if ( a== 7){
                line = button3.getText() + button6.getText() + button9.getText();
            }
               
            

            //X winner
            if (line.equals("XXX")) {
                winnerText.setText("The winner is Player 1 -- (X Won)");
            }

            //O winner
            else if (line.equals("OOO")) {
                winnerText.setText("The winner is Computer -- (O Won)");
            }
        }
    }


    @FXML
    public void ClearButton(ActionEvent actionEvent) {
        buttons.forEach(this::resetButton);
        winnerText.setText("Tic-Tac-Toe");
    }

    public void resetButton(Button button){
        button.setDisable(false);
        button.setText("");
    }

    public void BackButton(ActionEvent actionEvent) throws IOException {
        final Node source = (Node) actionEvent.getSource();
        final Stage stage = (Stage) source.getScene().getWindow();
        VBox page = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("../FXML/MainFXML.fxml")));
        Scene newScene = new Scene(page);
        stage.setScene(newScene);
        stage.show();
    }
}
