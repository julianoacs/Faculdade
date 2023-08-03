/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package helloworldfx;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.Button;

/**
 *
 * @author Julianoacs
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Button botao; 
    private Label mensagem;
    
    @FXML
    private void cliquebotao(ActionEvent event) {
        mensagem.setText("Hello, World!");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
