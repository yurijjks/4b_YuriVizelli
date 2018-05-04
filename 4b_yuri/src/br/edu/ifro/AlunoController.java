/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifro;

import br.edu.ifro.modelo.aluno;
import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * FXML Controller class
 *
 * @author 04018523262
 */
public class AlunoController implements Initializable {

    @FXML
    private JFXTextField txtnome;
    @FXML
    private Button btnsalvar;
    @FXML
    private Button btnfechar;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void salvar(ActionEvent event) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("aula");
        EntityManager em = emf.createEntityManager();
    
        aluno aluno1= new aluno();
        aluno1.setNome(txtnome.getText());
        
        em.getTransaction().begin();
         
        
        em.persist(aluno1);  
        
        
        em.getTransaction().commit(); 
    }

    @FXML
    private void fechar(ActionEvent event) {
        Stage stage = (Stage) btnfechar.getScene().getWindow();
    stage.close();
    }
    
}
