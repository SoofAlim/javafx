/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package location.app.gui;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.fxml.JavaFXBuilderFactory;
import javafx.scene.Node;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author DELL
 */



public class AuthAdminController implements Initializable {
@FXML 
    public AnchorPane authadmin ;
   
    
    
    @FXML
    private void retourChoix(ActionEvent event) throws IOException {
        
        URL url = getClass().getResource("Choix.fxml");
      
             FXMLLoader fxmlloader = new FXMLLoader();
             
             fxmlloader.setLocation(url); 
             authadmin.getChildren().clear();
             authadmin.getChildren().add((Node) fxmlloader.load(url.openStream()));
             fxmlloader.setBuilderFactory(new JavaFXBuilderFactory());
       
    }
     @FXML
    private void ConnexionAdmin(ActionEvent event) throws IOException {
        
        URL url = getClass().getResource("MenuAdmin.fxml");
      
             FXMLLoader fxmlloader = new FXMLLoader();
             
             fxmlloader.setLocation(url); 
             authadmin.getChildren().clear();
             authadmin.getChildren().add((Node) fxmlloader.load(url.openStream()));
             fxmlloader.setBuilderFactory(new JavaFXBuilderFactory());
       
    }
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
}
