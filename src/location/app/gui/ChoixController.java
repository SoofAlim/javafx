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
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;

/**
 *
 * @author DELL
 */
public class ChoixController  implements  Initializable {
    
    @FXML 
    public AnchorPane choix ;
  
    
    @FXML
    private void buttonAdmin(ActionEvent event) throws IOException {
        
        URL url = getClass().getResource("AuthAdmin.fxml");
      
             FXMLLoader fxmlloader = new FXMLLoader();
             
             fxmlloader.setLocation(url); 
             choix.getChildren().clear();
             choix.getChildren().add((Node) fxmlloader.load(url.openStream()));
             fxmlloader.setBuilderFactory(new JavaFXBuilderFactory());
       
    }
      @FXML
    private void buttonClient(ActionEvent eent) throws IOException {
        
        URL url = getClass().getResource("AuthClient.fxml");
      
             FXMLLoader fxmlloader = new FXMLLoader();
             
             fxmlloader.setLocation(url); 
             choix.getChildren().clear();
             choix.getChildren().add((Node) fxmlloader.load(url.openStream()));
             fxmlloader.setBuilderFactory(new JavaFXBuilderFactory());
       
    }
        @FXML
    private void buttonVisiteur(ActionEvent evt) throws IOException {
        
        URL url = getClass().getResource("MenuVisiteur.fxml");
      
             FXMLLoader fxmlloader = new FXMLLoader();
             
             fxmlloader.setLocation(url); 
             choix.getChildren().clear();
             choix.getChildren().add((Node) fxmlloader.load(url.openStream()));
             fxmlloader.setBuilderFactory(new JavaFXBuilderFactory());
       
    }
   
   
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
}
