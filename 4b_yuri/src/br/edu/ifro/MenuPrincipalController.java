/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifro;

import com.jfoenix.controls.JFXTextField;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

/**
 *
 * @author 04018523262
 */
public class MenuPrincipalController implements Initializable {
    
    @FXML
    private Label label;
    @FXML
    private JFXTextField txtnum1;
    @FXML
    private JFXTextField txtnum2;
    @FXML
    private JFXTextField txtresult;
    @FXML
    private Button btnSoma;
    
    private void handleButtonAction(ActionEvent event) {
      
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void somar(ActionEvent event) {
    Double num1 = Double.parseDouble(txtnum1.getText());
    Double num2 = Double.parseDouble(txtnum2.getText());
    Double result = num1+num2;
    txtresult.setText(result.toString());
    }

    @FXML
    private void abrircadastroaluno(ActionEvent event) {
      
      try{
       FXMLLoader fxmlLoader = new FXMLLoader();
       fxmlLoader.setLocation(getClass().getResource("Aluno.fxml"));
       Scene scene = new Scene(fxmlLoader.load(),400,682);
            Stage stage = new Stage();
       stage.setTitle("Cadastrar Cliente");
       stage.setScene(scene);
       stage.show();
      }
      catch(IOException e){

       }
    }
    @FXML
    private void fecharprojeto(ActionEvent event) {
        
    }
    
}
