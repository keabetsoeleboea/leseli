/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise1;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;

/**
 *
 * @author Kea
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private ProgressBar Myprogressbar;

    @FXML
    private Button decrease;

    @FXML
    private Button increase;

    @FXML
    private Label label;

    double progress;
    @FXML
    void DECREASE(ActionEvent event) {

        progress-=1;
        Myprogressbar.setProgress(progress);
        label.setText(Integer.toString((int)Math.round(progress+1)));
    }
    @FXML
    void INCREASE(ActionEvent event) {
        progress+=1;
        Myprogressbar.setProgress(progress);
        label.setText(Integer.toString((int)Math.round(progress+1)));

    }   
    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
