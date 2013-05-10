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
public class AuthClientController implements Initializable {
@FXML
public AnchorPane authclient;
      @FXML
    private void retourChoix(ActionEvent event) throws IOException {
        
        URL url = getClass().getResource("Choix.fxml");
      
             FXMLLoader fxmlloader = new FXMLLoader();
             
             fxmlloader.setLocation(url); 
             authclient.getChildren().clear();
             authclient.getChildren().add((Node) fxmlloader.load(url.openStream()));
             fxmlloader.setBuilderFactory(new JavaFXBuilderFactory());
       
    }
      @FXML
       private void ConnexionClient(ActionEvent event) throws IOException {
        
        URL url = getClass().getResource("MenuClient.fxml");
      
             FXMLLoader fxmlloader = new FXMLLoader();
             
             fxmlloader.setLocation(url); 
             authclient.getChildren().clear();
             authclient.getChildren().add((Node) fxmlloader.load(url.openStream()));
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
