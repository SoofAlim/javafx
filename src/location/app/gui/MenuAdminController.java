/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package location.app.gui;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.fxml.JavaFXBuilderFactory;
import javafx.scene.Node;
import javafx.scene.chart.PieChart;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.AnchorPane;
import location.app.dao.ClientDAO;
import location.app.dao.IDAO;
import location.app.persistence.Client;

/**
 * FXML Controller class
 *
 * @author DELL
 */
public class MenuAdminController implements Initializable {
@FXML
public AnchorPane menuadmin;


//public BarChart  barChart;
//     public void chart (){
//  barChart.setLegendVisible(false);
//     }
@FXML
public PieChart pc;

 IDAO<Client> idao = new ClientDAO();
 @FXML
   public  TableView<Client> listeclient = new TableView<Client>();
 @FXML
public TableColumn idclient;
 
 public TableColumn nom;
 public TableColumn prenom;
 public TableColumn adresse;
 public TableColumn mail;
 public TableColumn cin;
 public TableColumn login;
  public TableColumn password;
  
 
    
   

    @FXML
    private void DecoAdmin(ActionEvent event) throws IOException {
        
        URL url = getClass().getResource("AuthAdmin.fxml");
      
             FXMLLoader fxmlloader = new FXMLLoader();
             
             fxmlloader.setLocation(url); 
             menuadmin.getChildren().clear();
             menuadmin.getChildren().add((Node) fxmlloader.load(url.openStream()));
             fxmlloader.setBuilderFactory(new JavaFXBuilderFactory());
       
    }
     
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       

  pc = new PieChart(FXCollections.observableArrayList(
            new PieChart.Data("Sun", 20),
            new PieChart.Data("IBM", 12),
            new PieChart.Data("HP", 25),
            new PieChart.Data("Dell", 22),
            new PieChart.Data("Apple", 30)
        ));
        
        // setup chart
        pc.setId("BasicPie");
        pc.setTitle("Pie Chart Example");
        
      
    }  
   
        
      

}